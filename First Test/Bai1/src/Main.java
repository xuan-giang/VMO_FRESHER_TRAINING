import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Nhap x: ");
        double x    = sc.nextDouble();
        System.out.println("Nhap n: ");
        int n       = sc.nextInt();

        Exercise exercise = new Exercise(x,n);

        System.out.println("Ket qua tinh = " + exercise.getResult(x,n));

    }
}
