package week2;
import java.util.Scanner;
import java.util.Random;
public class Task11 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();
        int max = 0;
        max = a > b ? (a > c ? a : c):(b > c ? b : c);
        System.out.println(max);

    }
}
