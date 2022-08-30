package collections;

import java.util.ArrayList;
import java.util.Collections;

public class ArrayListTest {

    public static void main(String[] args) {

        ArrayList<Integer> myArrayList = new ArrayList<>();
        myArrayList.add(5);
        myArrayList.add(3);
        myArrayList.add(2);
        myArrayList.add(1);
        myArrayList.add(4);

        for (Integer currentInteger : myArrayList) {
            System.out.print(currentInteger + " ");
        }
        System.out.println();

        Collections.sort(myArrayList);
        for (Integer currentInteger : myArrayList) {
            System.out.print(currentInteger + " ");
        }
        System.out.println();

        System.out.println(myArrayList.contains(10));
        myArrayList.set(2, 10);
        System.out.println(myArrayList.contains(10));
    }
}
