package week2;
import java.util.Scanner;
public class Task16 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        for(int i = 1; i <= N; i++){
            if(i % 3 == 0){
                continue;
            }
            System.out.println(i);
        }
    }
}
