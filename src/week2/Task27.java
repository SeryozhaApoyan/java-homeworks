package week2;
import java.util.Scanner;

public class Task27 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int x = scanner.nextInt();
        int num = 1;
        int y = 0;
        for(int i = 0; i > 2; i++, y ++){
            if(x % 10 == 1){
                num = num + 2 * y;
            }
            x = x / 10;
        }
        y = 1;
        for(int i = 0; x > 0; i++, y = y * 2){
            if(x % 10 == 1){
                num = num + y;
            }
            x = x / 10;
        }
        System.out.println(num);

    }
}