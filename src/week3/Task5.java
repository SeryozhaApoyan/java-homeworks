package week3;
import java.util.Scanner;
public class Task5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int arr[] = new int[n];
        for(int i = 0; i < arr.length; i++){
            arr[i] = scanner.nextInt();
        }
        int max = arr[0];
        int k = 0;
        for(int i = 1; i < arr.length; i++){
            if(arr[i] > max ){
                max = arr[i];
                k = i;
            }
        }
        System.out.println("The larjest is " + max + " index is " + k);
    }
}
