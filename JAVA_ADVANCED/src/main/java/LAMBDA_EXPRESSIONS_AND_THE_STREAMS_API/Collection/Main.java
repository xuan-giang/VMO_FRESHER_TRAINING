package LAMBDA_EXPRESSIONS_AND_THE_STREAMS_API.Collection;

import java.util.*;

public class Main {
    static List<Student> studentList = new ArrayList<>();

    public static void main(String[] args) {
        // (parameter1, parameter2) -> expression

        initStudent();

        sortStudent();

        printStudentList();
    }

    static void initStudent()
    {
        studentList.add(new Student("SV001", "Nguyễn Văn Nam", 20));
        studentList.add(new Student("SV002", "Nguyễn Văn Hùng", 27));
        studentList.add(new Student("SV003", "Nguyễn Văn Chiến", 19));
        studentList.add(new Student("SV004", "Nguyễn Văn Mạnh", 23));
        studentList.add(new Student("SV005", "Nguyễn Văn Duy", 21));
    }

    static void printStudentList()
    {
        studentList.forEach((student) -> {System.out.println(student);});
    }

    // Lamda Expression
    static void sortStudent()
    {
        studentList.sort((Student o1, Student o2)-> o1.getAge()- o2.getAge());
    }
}
