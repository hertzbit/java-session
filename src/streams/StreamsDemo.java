package streams;

import packageA.A;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class StreamsDemo {

    public static void main(String[] args) {

        ArrayList<Integer> integerArrayList = new ArrayList<>();
        integerArrayList.add(1);
        integerArrayList.add(2);
        integerArrayList.add(3);
        integerArrayList.add(4);
        integerArrayList.add(5);

        //integerArrayList.forEach(currentInteger -> System.out.println(currentInteger));
        List<Integer> squareList = integerArrayList.stream().map(num -> num * num).collect(Collectors.toList());
        System.out.println(squareList);

        List<Integer> evenList = squareList.stream().filter(num -> num % 2 == 0).collect(Collectors.toList());

        Comparator<Integer> descendingOrderComparator = (numOne, numTwo) -> numTwo.compareTo(numOne);
        List<Integer> sortedList = evenList.stream().sorted(descendingOrderComparator).collect(Collectors.toList());
        System.out.println(sortedList);

        integerArrayList.stream().map(num -> num * num)
                                 .filter(num -> num % 2 == 0)
                                 .sorted(descendingOrderComparator)
                                 .forEach(System.out::println);

        int value = integerArrayList.stream().filter(num -> num % 2 == 0).
                                    reduce(0, (partialSum, currentInteger) -> partialSum + currentInteger);
        System.out.println(value);

        List<Integer> someIntegerList = new ArrayList<>();
        //someIntegerList.add(1);
        Optional<Integer> optionalInteger = someIntegerList.stream().findFirst();
        System.out.println(optionalInteger.isPresent());

        if (optionalInteger.isPresent()) {
            System.out.println(optionalInteger.get());
        }
    }
}
