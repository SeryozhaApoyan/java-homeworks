package week2;
import java.util.Scanner;


public class Task5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        byte b = scanner.nextByte();
        if(b<=18){
            System.out.println("Yes");
        }
        else{
            System.out.println("No");
        }
    }
}
