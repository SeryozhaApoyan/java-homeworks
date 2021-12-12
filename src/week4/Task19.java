package week4;
import java.util.Scanner;

public class Task19 {
    public static int sumOfDigitsRec(int n){
        if (n < 10){
            return n;
        }
        return sumOfDigitsRec(n % 10) + sumOfDigitsRec(n / 10);
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        System.out.println(sumOfDigitsRec(n));
    }
}
