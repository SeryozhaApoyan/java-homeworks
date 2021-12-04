package week2;
import java.util.Scanner;
public class Task18 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        if(b > a) {
            if (b % 2 == 1) {
                b = b - 1;
                for (int i = 0; b >= a; i++) {
                    System.out.println(b);
                    b = b - 2;
                }
            } else {
                for (int i = 0; b >= a; i++) {
                    System.out.println(b);
                    b = b - 2;
                }
            }
        }
        else {
            int temp = a;
            a = b;
            b = temp;
            if (b % 2 == 1) {
                b = b - 1;
                for (int i = 0; b >= a; i++) {
                    System.out.println(b);
                    b = b - 2;
                }
            } else {
                for (int i = 0; b >= a; i++) {
                    System.out.println(b);
                    b = b - 2;
                }
            }
        }
    }
}
