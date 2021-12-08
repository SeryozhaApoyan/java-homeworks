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
        int maxIndex = 0;
        int minIndex = 0;
        for(int i = 0; i < arr.length; i++){
            if(arr[i] > max){
                max = arr[i];
                maxIndex = i;
            }
            else{
                if (arr[i] < min) {
                    min = arr[i];
                    minIndex = i;
                }
            }
        }
        int temp = arr[maxIndex];
        arr[maxIndex] = arr[minIndex];
        arr[minIndex] = temp;
        for(int i = 0; i < arr.length; i++){
           System.out.println(arr[i]);
        }
    }
}
