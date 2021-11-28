package week2;
import java.util.Scanner;


public class Task3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);
        byte p = (byte)3.14159;
        int Radius = scanner.nextInt();
        int area = p * Radius * Radius;
        int perimetr = 2 * p * Radius;
        System.out.println(area);
        System.out.println(perimetr);
    }
}
