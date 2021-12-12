package week4;
import java.util.Scanner;
public class Task3 {
    public static boolean isPalindrom(int n){
        boolean bool = false;
        int temp = n;
        int x = 0;
        for(int i = 0; n > 0; i++){
            x = (n % 10) + (x * 10);
            n = n / 10;
        }
        System.out.println(x);
        if( x == temp){
            bool = true;
        }
        return bool;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        System.out.println(isPalindrom(n));
    }
}
