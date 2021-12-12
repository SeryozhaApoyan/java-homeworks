package week4;
import java.util.Scanner;
public class Task20 {
    public static int countOfDigitsSeven(int n){
        int count = 0;
        for(int i = 0; n > 0; i++){
            int x = n % 10;
            if (x == 7){
                count++;
            }
            n = n / 10;
        }
        return count;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        System.out.println(countOfDigitsSeven(n));
    }
}
