package week4;
import java.util.Scanner;
public class Task1 {
    public static double funk(double a, int n){
        double result = 1;
        for(int i = 0; i < n; i++){
            result  *= a;
        }
        return result;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int x = scanner.nextInt();
        int y = scanner.nextInt();
        System.out.println(funk(x,y));
    }
}
