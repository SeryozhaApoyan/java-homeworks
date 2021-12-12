package week4;
import java.util.Scanner;

public class Task2 {
    public static boolean isPrime(int n){
        boolean bool = true;
        for(int i = n - 1; i > 1; i --){
            int x = n;
            x = n % i;
            if (x == 0){
                bool = false;
                break;
            }
        }
        return bool;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        System.out.println(isPrime(n));
    }

}
