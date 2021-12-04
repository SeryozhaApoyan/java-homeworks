package week2;
import java.util.Scanner;
public class Task32 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int [] arr1 = new int[a];
        int [][] arr = new int [a][a];
        for(int i = 0; i < arr1.length; i++){
            arr1[i] = scanner.nextInt();
        }
        for(int i = 0; i < arr1.length; i++){
            System.out.print(arr1[i] + " ");
        }
        int k = 2;
        for(int i = 0; i < arr1.length - 1; i++, k++){
            System.out.println("");
            for(int j = 0; j < arr1.length;  j++){
                arr[i][j] = arr1[j] * k;
                System.out.print(arr[i][j] + " ");
            }
        }
    }
}
