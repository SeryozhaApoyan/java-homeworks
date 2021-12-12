package week4;
import java.util.Scanner;
public class Task12 {
    public static String reverseString(String str){
        String tempString = "";
        for(int i = 0; i < str.length(); i++){
           tempString += str.charAt(str.length()-1 - i);
        }
        return tempString;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a String");
        String str = scanner.next();
        System.out.println("The reverse of the String " + str + " is " +reverseString(str));
    }
}
