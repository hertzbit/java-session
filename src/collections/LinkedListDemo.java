package collections;

import java.util.LinkedList;
import java.util.List;

public class LinkedListDemo {

    public static void main(String[] args) {

        LinkedList<Integer> integerList = new LinkedList<>();
        integerList.add(11);
        integerList.add(22);
        integerList.add(33);

        //System.out.println(integerList.get(0));
        integerList.addFirst(0);
        integerList.addLast(11);
        for (Integer currentInteger : integerList) {
            System.out.print(currentInteger + " ");
        }
        System.out.println();
    }
}
