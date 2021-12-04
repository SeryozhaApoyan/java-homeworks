package week2;
import java.util.Scanner;
public class Task9 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int x1 = scanner.nextInt();
        int y1 = scanner.nextInt();
        int x2 = scanner.nextInt();
        int y2 = scanner.nextInt();
        if(x1 > 0 && x2 > 0 && y1 > 0 && y2 > 0){
            System.out.println("in the same quarter");
        }
        else if(x1 > 0 && x2 > 0 && y1 < 0 && y2 < 0){
            System.out.println("in the same quarter");
        }
        else if(x1 < 0 && x2 < 0 && y1 > 0 && y2 > 0){
            System.out.println("in the same quarter");
        }
        else if(x1 < 0 && x2 < 0 && y1 < 0 && y2 < 0){
            System.out.println("in the same quarter");
        }
        else{
            System.out.println("Not in the same quarter");
        }
    }
}
