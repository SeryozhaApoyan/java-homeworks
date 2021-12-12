package week4;
import java.util.Scanner;
public class Task11 {
    public static boolean contains(String str, char ch){
        for(int i = 0; i < str.length(); i ++){
            if(str.charAt(i) == ch){
                return true;
            }
        }
        return false;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the String");
        String str = scanner.next();
        System.out.println("Enter a character");
        char ch = scanner.next().charAt(0);
        System.out.println(contains(str,ch));
    }
}
