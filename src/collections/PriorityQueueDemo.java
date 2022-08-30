package collections;

import java.util.Comparator;
import java.util.PriorityQueue;

class MyIntegerComparator implements Comparator<Integer> {

    @Override
    public int compare(Integer integerOne, Integer integerTwo) {
        return integerTwo.compareTo(integerOne);
    }
}
public class PriorityQueueDemo {

    public static void main(String[] args) throws InterruptedException {


        PriorityQueue<Integer> integerPriorityQueue = new PriorityQueue<>(new MyIntegerComparator());
        integerPriorityQueue.add(5);
        integerPriorityQueue.add(10);
        integerPriorityQueue.add(2);

        //System.out.println(integerPriorityQueue.peek());
//        System.out.println(integerPriorityQueue.poll());
//        System.out.println(integerPriorityQueue.poll());
//        System.out.println(integerPriorityQueue.poll());
//        System.out.println(integerPriorityQueue.poll());

        for (int i = 0; i <= integerPriorityQueue.size(); i++) {
            System.out.println("Processing Some Threads");
            Integer threadValue = integerPriorityQueue.poll();
            System.out.println("Processing Thread [" + threadValue + "]");
            Thread.sleep(threadValue * 1000);
            System.out.println("Processed Thread [" + threadValue + "]");
        }


    }
}
