package week2;
import java.util.Scanner;
public class Task10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double a = scanner.nextDouble();
        double b = scanner.nextDouble();
        double c = scanner.nextDouble();
        double x = 0;
        if(c / (2 * a + b) < 0){
            x = (c / (2 * a + b)) * -1;
            System.out.println(x + " Its a decision");
        }
        else{
            System.out.println("cant be");
        }
    }
}
