package multithreading.interthreadcommunication;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Random;

class AssemblyStation {

    Queue<String> assemblyLine;

    public AssemblyStation() {
        this.assemblyLine = new LinkedList<>();
    }

    public boolean isAssemblyLineFull() {
        return this.assemblyLine.size() == 2;
    }

    public boolean isAssemblyLineEmpty() {
        return this.assemblyLine.size() == 0;
    }
}

class Producer extends Thread {

    private static String[] cars = {"Tesla Model X", "Tesla Model Y", "Tesla Model 3", "Tesla Model S"};
    Random random = new Random();
    AssemblyStation assemblyStation;

    public Producer(AssemblyStation assemblyStation) {
        this.assemblyStation = assemblyStation;
    }

    @Override
    public void run() {
        while (true) {
            synchronized (this.assemblyStation) {
                if (this.assemblyStation.isAssemblyLineFull()) {
                    try {
                        this.assemblyStation.wait();
                    } catch (InterruptedException e) {
                        throw new RuntimeException(e);
                    }
                } else if (!this.assemblyStation.isAssemblyLineFull()){
                    String producerCar = cars[random.nextInt(cars.length)];
//                    try {
//                        Thread.sleep(5000);
//                    } catch (InterruptedException e) {
//                        throw new RuntimeException(e);
//                    }
                    this.assemblyStation.assemblyLine.offer(producerCar);
                    //System.out.println(this.assemblyStation.assemblyLine);
                    System.out.println("Produced [" + producerCar + "]");
                    this.assemblyStation.notify();
                }
            }
        }
    }
}

class Consumer extends Thread {

    AssemblyStation assemblyStation;

    public Consumer(AssemblyStation assemblyStation) {
        this.assemblyStation = assemblyStation;
    }

    @Override
    public void run() {

        while (true) {
            synchronized (this.assemblyStation) {
                if (this.assemblyStation.isAssemblyLineEmpty()) {
                    try {
                        this.assemblyStation.wait();
                    } catch (InterruptedException e) {
                        throw new RuntimeException(e);
                    }
                } else if (!this.assemblyStation.isAssemblyLineEmpty()) {
                    String consumedCar = this.assemblyStation.assemblyLine.poll();
//                    try {
//                        Thread.sleep(5000);
//                    } catch (InterruptedException e) {
//                        throw new RuntimeException(e);
//                    }
                    System.out.println("Consumed [" + consumedCar + "]");
                    this.assemblyStation.notify();
                }
            }
        }
    }
}

public class ProducerConsumer {

    public static void main(String[] args) {
        AssemblyStation assemblyStation = new AssemblyStation();
        Producer producerThread = new Producer(assemblyStation);
        Consumer consumerThread = new Consumer(assemblyStation);

        producerThread.start();
        consumerThread.start();
    }
}
