package week4;
import java.util.Scanner;
public class Task5 {
    public static int[] copyOf(int []arr){
        int copy[] = new int[arr.length];
        for(int i =0; i < arr.length; i++){
            copy[i] = arr [i];
        }
        return copy;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int arr[] = new int[n];
        for(int i = 0; i < arr.length; i++){
            arr[i] = scanner.nextInt();
        }
        int []copy = copyOf(arr);
    }
}
