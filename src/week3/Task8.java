package week3;

import java.util.Scanner;

public class Task8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int arr[] = new int[n];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = scanner.nextInt();
        }
        int max = arr[0];
        int min = arr[0];
        int maxIndex = 1;
        int minIndex = 1;
        for(; maxIndex < arr.length; maxIndex++){
            if(arr[maxIndex] > max){
                max = arr[maxIndex];
            }
        }
        for(; minIndex < arr.length; minIndex++) {
            if (arr[minIndex] < min) {
                min = arr[minIndex];
            }
        }
        int temp = arr[maxIndex];
        arr[maxIndex] = arr[minIndex];
        arr[minIndex] = temp;
        System.out.println(maxIndex);
        System.out.println(minIndex);
        //for(int i = 0; i < arr.length; i++){
         //   System.out.println(arr[i]);
       // }
    }
}
