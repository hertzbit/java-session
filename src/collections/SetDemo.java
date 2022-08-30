package collections;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;


public class SetDemo {

    public static void main(String[] args) {

//        Set<Integer> integerSet = new HashSet<>();
//
//        integerSet.add(1);
//        integerSet.add(2);
//        integerSet.add(3);
//        integerSet.add(4);
//        integerSet.add(1);
//
//        for (Integer currentInteger : integerSet) {
//            System.out.println(currentInteger);
//        }

        Set<Employee> employeeSet = new TreeSet<>();
        Employee employeeOne = new Employee(1, "Rahul");
        Employee employeeTwo = new Employee(2, "Ravi");
        Employee employeeThree = new Employee(3, "Rohit");
        Employee employeeFour = new Employee(4, "Rahul");
        Employee employeeFive = new Employee(1, "Rahul");

//        System.out.println(employeeOne.hashCode());
//        System.out.println(employeeFive.hashCode());
//        System.out.println(employeeOne.equals(employeeFive));

        employeeSet.add(employeeOne);
        employeeSet.add(employeeTwo);
        employeeSet.add(employeeThree);
        employeeSet.add(employeeFour);
        employeeSet.add(employeeFive);

        for (Employee currentEmployee : employeeSet) {
            System.out.println(currentEmployee);
        }
    }
}

class Employee implements Comparable<Employee>{

    private Integer employeeId;
    private String employeeName;

    public Employee() {};

    public Employee(Integer employeeId, String employeeName) {
        this.employeeId = employeeId;
        this.employeeName = employeeName;
    }

    public Integer getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(Integer employeeId) {
        this.employeeId = employeeId;
    }

    public String getEmployeeName() {
        return employeeName;
    }

    public void setEmployeeName(String employeeName) {
        this.employeeName = employeeName;
    }

    /*@Override
    public String toString() {
        return "Employee{" +
                "employeeId='" + employeeId + '\'' +
                ", employeeName='" + employeeName + '\'' +
                '}';
    }*/

    @Override
    public boolean equals(Object anotherObject) {
        if (anotherObject instanceof Employee) {
            Employee anotherEmployee = (Employee) anotherObject;
            int isEmployeeIdSame = this.employeeId.compareTo(anotherEmployee.employeeId);
            int isEmployeeNameSame = this.employeeName.compareTo(anotherEmployee.employeeName);
            if (isEmployeeIdSame == 0 &&  isEmployeeNameSame == 0) {
                return true;
            }
            return false;
        }
        return false;
    }

    @Override
    public int hashCode() {
        return this.employeeId % 5;
    }

    @Override
    public int compareTo(Employee anotherEmployee) {
        return this.employeeName.compareTo(anotherEmployee.employeeName);
    }
}
