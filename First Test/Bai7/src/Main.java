import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ManagerStudent managerStudent = new ManagerStudent();

        while (true) {
            System.out.println("\n=========================================");
            System.out.println("======= Application Manager Students =======");
            System.out.println("Enter 1: Create student automatic");
            System.out.println("Enter 2: Find student by name ");
            System.out.println("Enter 3: Find student by rank GIOI ");
            System.out.println("Enter 4: Sort student");
            System.out.println("Enter 5: Display student list");
            System.out.println("Enter 6: To exit:");
            String line = scanner.nextLine();
            switch (line) {
                case "1": {
                    managerStudent.initStudent();
                    System.out.println("Created student successfully!");
                    break;
                }
                case "2": {
                    System.out.println("Enter name to search student: ");
                    String name = scanner.nextLine();

                    managerStudent.findStudentByName(name);
                    break;
                }
                case "3": {
                    System.out.println("List students have rank GIOI: ");
                    managerStudent.findStudentByRank("GIOI");
                    break;
                }
                case "4": {
                    managerStudent.sortStudent();
                    System.out.println("Sort successfully!");
                }
                case "5": {
                    managerStudent.printListStudent();
                    break;
                }
                case "6": {
                    return;
                }
                default:
                    System.out.println("Invalid");
                    continue;
            }

        }

    }
}
