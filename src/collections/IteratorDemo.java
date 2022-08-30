package collections;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

public class IteratorDemo {

    public static void main(String[] args) {

        ArrayList<String> nameList = new ArrayList<>();
        nameList.add("Virat Kohli");
        nameList.add("Rohit Sharma");
        nameList.add("Jasprit Bumrah");
        nameList.add("Rishabh Pant");

        /*
        for (String currentName : nameList) {
            System.out.print(currentName + "-");
        }
        System.out.println();
        */

        Iterator<String> nameIterator = nameList.iterator();
        while (nameIterator.hasNext()) {
            String currentName = nameIterator.next();
            System.out.println(currentName);
            if (currentName.equals("Rohit Sharma"))  {
                nameList.remove(currentName);
            }
        }

        /*
        ListIterator<String> nameListIterator = nameList.listIterator();
        while(nameListIterator.hasNext()) {
            String currentName = nameListIterator.next();
            System.out.print(currentName + "-");
        }
        System.out.println();

        while(nameListIterator.hasPrevious()) {
            String currentName = nameListIterator.previous();
            System.out.print(currentName + "-");
        }
        System.out.println();
        */
    }
}
