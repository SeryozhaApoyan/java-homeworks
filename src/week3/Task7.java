package week3;
import java.util.Scanner;

public class Task7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int arr[] = new int[n];
        int arr1[] = new int [n];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = scanner.nextInt();
        }
        int k = 1;
        for(int i = 0; i < arr.length; i++,k++){
            arr1[i] = arr[n - k];
            System.out.println(arr1[i]);
        }
    }
}
