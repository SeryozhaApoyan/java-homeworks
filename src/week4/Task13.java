package week4;

import java.util.Scanner;

public class Task13 {
    public static boolean isPalindrome(String str){
        boolean bool = false;
        for(int i = 0; i < str.length()/2;i++){
            if(str.charAt(i) == str.charAt(str.length() - 1 - i)){
                bool = true;
            }
            else{
                return false;
            }
        }
        return bool;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String str = scanner.next();
        if(isPalindrome(str)){
            System.out.println(str + " is a Palindrome");
        }
        else{
            System.out.println(str + " is NOT a Palindrone");
        }
    }
}
