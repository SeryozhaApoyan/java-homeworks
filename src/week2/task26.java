package week2;
import java.util.Scanner;
public class task26 {
    public static void main(String[] args) {
        int arr [] = new int[10];
        int sum = 0;
        Scanner scanner = new Scanner(System.in);
        for(int i = 0; i < arr.length; i++){
            arr[0] = scanner.nextInt();
            sum = sum + arr[0];
        }
        System.out.println(sum);
    }

}
