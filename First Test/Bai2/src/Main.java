import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap chieu cao = ");
        int height = sc.nextInt();

        DrawAnyShape drawAnyShape = new DrawAnyShape(height);
        drawAnyShape.drawShape();


    }
}



