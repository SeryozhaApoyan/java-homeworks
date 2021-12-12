package week4;
import java.util.Scanner;
public class Task17 {
    public static int f( int arr[], int n ) {
        if (n < 0) {
            return 0;
        }
        else{
            return arr[n] + f(arr, n-1);
        }
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int arr[] = {1, 3, 4 , 1, 6};
        int n = arr.length - 1;
        System.out.println(f(arr,n));
    }
}
