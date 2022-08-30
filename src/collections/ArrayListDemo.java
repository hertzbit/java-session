package collections;

import java.util.ArrayList;
import java.util.List;

public class ArrayListDemo {

    public static void print(List<String> myList) {

        for (int i = 0; i < myList.size(); i++) {
            String myString = myList.get(i);
        }
    }
    public static void main(String[] args) {

        List<String> myList = new ArrayList<>();
        myList.add("Chetan Krishna");
        myList.add("Cristiano Ronaldo");
        //myList.add(1);

        print(myList);
    }
}
