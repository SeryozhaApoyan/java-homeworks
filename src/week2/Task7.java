package week2;
import java.util.Scanner;


public class Task7 {
    public static void main(String[] args) {
       Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        if(a > 10 && b != 10){
            System.out.println("Both a and b legal");
        }
        else if(a <= 10 && b != 10){
            System.out.println("a is ilegal b is llegal");
        }
        else if(a > 10 && b == 10){
            System.out.println("a is legal b is legal");
        }

    }
}
