package week2;
import java.util.Scanner;
public class Task33 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
       // int arr[][] = new int [n][n * 2 + 5];
        int k = 1;
        int x = n * 2 + 3;
        for(int i = 0; i < n; i++,k++,x--){
            for(int j = 0; j < n * 2 + 5; j++){
                if (j == (n * 2 +5)/2){
                    System.out.print(" ");
                }
                else if (j == k){
                    System.out.print(" ");
                }
                else if (j == x){
                    System.out.print(" ");
                }
                else{
                    System.out.print("* ");
                }
            }
            System.out.println("");
        }
    }
}
