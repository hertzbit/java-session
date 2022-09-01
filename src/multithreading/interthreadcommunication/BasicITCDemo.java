package multithreading.interthreadcommunication;

class SumCalculator extends Thread {

    int total = 0;

    @Override
    public void run() {

        System.out.println("Child Thread starts calculation");
        for (int i = 1; i<= 100; i++) {
            total += i;
        }
        System.out.println("Child Thread completes calculation");
        synchronized (this) {
            System.out.println("Notifying Threads waiting for total");
            this.notify();
        }
        try {
            Thread.sleep(10000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        System.out.println("Child Thread Completes Execution");
    }
}
public class BasicITCDemo {

    public static void main(String[] args) throws InterruptedException {
        SumCalculator sumCalculatorThread = new SumCalculator();
        sumCalculatorThread.start();

        System.out.println("Main Thread is waiting for calculation to finish");
//        sumCalculatorThread.join();
//        System.out.println("Main Thread resumes its operation");
//        System.out.println(sumCalculatorThread.total);
        synchronized (sumCalculatorThread) {
            sumCalculatorThread.wait();
            System.out.println("Main Thread resumes its operation");
            System.out.println(sumCalculatorThread.total);
        }
    }
}
