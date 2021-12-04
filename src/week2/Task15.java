package week2;
import java.util.Scanner;

public class Task15 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int x = 1;
        int count = 0;
        for(int i = 0; x < N; i++){
            x = 2 * x;
            count++;
        }
        System.out.println(count);
    }
}
