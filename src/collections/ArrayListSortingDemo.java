package collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class ArrayListSortingDemo {

    public static void main(String[] args) {

        List<Student> studentList = new ArrayList<>();
        studentList.add(new Student("John", 43124, 98)); //2nd
        studentList.add(new Student("Max", 12312, 85)); //4th
        studentList.add(new Student("Alicia", 13313, 91)); //1st
        studentList.add(new Student("Rahul", 1, 75)); //3rd

        Collections.sort(studentList);
    }
}

class StudentMarksComparator implements Comparator<Student> {

    @Override
    public int compare(Student studentOne, Student studentTwo) {
        return studentOne.getStudentMarks().compareTo(studentTwo.getStudentMarks());
    }
}

class StudentNameComparator implements Comparator<Student> {

    @Override
    public int compare(Student studentOne, Student studentTwo) {
        return studentOne.getStudentName().compareTo(studentTwo.getStudentName());
    }
}

class Student implements Comparable<Student> {

    private static int comparisionNumber;
    private String studentName;
    private Integer studentId;

    private Integer studentMarks;

    public Student() {};

    public Student(String studentName, Integer studentId, Integer studentMarks) {
        this.studentName = studentName;
        this.studentId = studentId;
        this.studentMarks = studentMarks;
    }

    public String getStudentName() {
        return studentName;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    public Integer getStudentId() {
        return studentId;
    }

    public void setStudentId(Integer studentId) {
        this.studentId = studentId;
    }

    public Integer getStudentMarks() {
        return studentMarks;
    }

    public void setStudentMarks(Integer studentMarks) {
        this.studentMarks = studentMarks;
    }

    @Override
    public String toString() {
        return "Student{" +
                "studentName='" + studentName + '\'' +
                ", studentId=" + studentId +
                ", studentMarks=" + studentMarks +
                '}';
    }

    @Override
    public int compareTo(Student anotherStudent) {
        System.out.println("********************************");
        System.out.println("***************" + ++comparisionNumber + "****************");
        System.out.println(this);
        System.out.println(anotherStudent);
        System.out.println("********************************");
        //return this.studentId.compareTo(anotherStudent.getStudentId());
        //return this.studentName.compareTo(anotherStudent.getStudentName());
        //return anotherStudent.getStudentId().compareTo(this.studentId);
        int isEqual =  this.studentName.compareTo(anotherStudent.getStudentName());
        if (isEqual == 0) {
            return this.studentId.compareTo(anotherStudent.getStudentId());
        }
        return isEqual;
    }
}
