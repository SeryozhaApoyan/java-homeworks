package week4;
import java.util.Scanner;
public class Task18 {

    public static int countOfBlocks(int n){
        if(n == 1){
           return 1;
        }
        return n + countOfBlocks(n - 1);
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        System.out.println(countOfBlocks(n));
    }
}
