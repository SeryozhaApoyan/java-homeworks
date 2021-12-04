package week2;
import java.util.Scanner;
public class Task14 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int x = 1;
        for(int i = 0; x <= N/2; i++){
            x = 2 * x;
            System.out.println(x);
        }
    }
}
