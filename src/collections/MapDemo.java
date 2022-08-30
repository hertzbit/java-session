package collections;

import java.util.*;

public class MapDemo {

    public static void main(String[] args) {

        Employee employeeThree = new Employee(3, "Deepali");
        Employee employeeOne = new Employee(1, "Abhishek");
        Employee employeeFive = new Employee(5, "Rahul");
        Employee employeeTwo = new Employee(2, "Chetan");
        Employee employeeFour = new Employee(4, "Gaurav");


        Map<Integer, Employee> employeeMap = new TreeMap<>();

        employeeMap.put(employeeThree.getEmployeeId(), employeeThree);
        employeeMap.put(employeeOne.getEmployeeId(), employeeOne);
        employeeMap.put(employeeFive.getEmployeeId(), employeeFive);
        employeeMap.put(employeeTwo.getEmployeeId(), employeeTwo);
        employeeMap.put(employeeFour.getEmployeeId(), employeeFour);
//        employeeMap.put("6", employeeFive);
//        employeeMap.put("7", null);
//        employeeMap.put(null, null);
//        employeeMap.put(null, employeeFive);

//        System.out.println(employeeMap.get(null));

        //Using SET
//        Set<String> employeeKeySet = employeeMap.keySet();
//        System.out.println(employeeKeySet);
//        for (String eachKey : employeeKeySet) {
//            Employee currentEmployee = employeeMap.get(eachKey);
//            System.out.println(currentEmployee.getEmployeeName());
//        }

        //System.out.println("***************************************");

        //Using EntrySet
        for (Map.Entry<Integer, Employee> currentEntry : employeeMap.entrySet()) {
            Employee currentEmployee = currentEntry.getValue();
            System.out.println(currentEntry.getKey() + " " + currentEmployee.getEmployeeName());
        }
//
//        //Search
//        System.out.println(employeeMap.get("1").getEmployeeName());
//        System.out.println(employeeMap.containsKey("6"));
//        System.out.println(employeeMap.containsValue(employeeFive));


    }
}
