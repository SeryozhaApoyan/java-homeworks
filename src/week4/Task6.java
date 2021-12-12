package week4;
import java.util.Scanner;
public class Task6 {
    public static float ex1(int x, float y){
        float z = x + y;
        return z;
    }
    public static int ex1(int x, int y){
        int z = x * y;
        return z;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int x = scanner.nextInt();
        float y = scanner.nextInt();
        System.out.println(ex1(x,y));
    }

}
