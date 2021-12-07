package week3;

import java.util.Scanner;

public class Task6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int arr[] = new int[n];
        for(int i = 0; i < arr.length; i++){
            arr[i] = scanner.nextInt();
        }
        int min = arr[0];
        for(int i = 0; i < arr.length; i++){
            if(arr[i] > 0 ){
                if(min > arr[i]){
                    min = arr[i];
                }
            }
        }
        System.out.println(min);
    }
}
