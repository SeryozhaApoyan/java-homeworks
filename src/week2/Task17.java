package week2;
import java.util.Scanner;
public class Task17 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int Temp = 0;
        for(int i = 0; N > 0; i++){
            Temp = N % 10 + Temp;
            N = N / 10;
        }
        System.out.println(Temp);
    }
}
