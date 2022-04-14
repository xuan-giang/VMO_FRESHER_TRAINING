import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class ManagerStudent {
    private List<Student> students = new ArrayList<>();

    public void initStudent()
    {
        students.add(new Student("Nguyen Van A", 20, 8, 9, 10));
        students.add(new Student("Nguyen Van B", 21, 5, 9, 10));
        students.add(new Student("Nguyen Van C", 22, 3, 7, 2));
        students.add(new Student("Nguyen Van D", 23, 9, 9, 1));
        students.add(new Student("Nguyen Van E", 19, 6, 8, 8));
        students.add(new Student("Nguyen Van F", 20, 7, 4, 7));
        students.add(new Student("Nguyen Van G", 22, 9, 9, 9));
        students.add(new Student("Nguyen Van H", 20, 8, 5, 9));
    }

    public void findStudentByName(String name){
        for(int i = 0; i < students.size(); i++)
        {
            if(students.get(i).getName().compareTo(name) == 0)
            {
                System.out.println(students.get(i).toString());;
            }
        }
    }

    public void findStudentByRank(String rank){
        for(int i = 0; i < students.size(); i++)
        {
            if(students.get(i).getRank().compareTo(rank) == 0)
            {
                System.out.println(students.get(i).toString());;
            }
        }
    }

    public void sortStudent()
    {
        Comparator<Student> comparator = new Comparator<Student>() {
            @Override
            public int compare(Student o1, Student o2) {
                if (o1.getName().compareTo(o2.getName()) != 0) {
                    return o1.getName().compareTo(o2.getName());
                }
                return (int) (o1.getAvg() - o2.getAvg());
            }
        };

        Collections.sort(students, comparator);
        System.out.println("Sort students successfully!");
    }

    public void printListStudent()
    {
        for (Student student : students)
        {
            System.out.println(student.toString());;
        }
    }
}
