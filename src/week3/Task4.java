package week3;

import java.util.Scanner;

public class Task4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int arr[] = new int[n];
        for(int i = 0; i < arr.length; i++){
            arr[i] = scanner.nextInt();
        }
        for(int i = 0; i < arr.length - 1; i++){
            if(arr[i] < arr[i + 1] ){
                System.out.println(arr[i + 1]);
            }
        }
    }
}
