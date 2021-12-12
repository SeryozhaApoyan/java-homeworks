package week4;
import java.util.Scanner;
public class Task10 {
    public static int reminder(int num){
        int sum = 0;
        for(int i = 0; num > 0; i++){
           sum += num % 10;
           num = num / 10;
        }
       return sum;
    }
    public static int reminder(int num, int digit){
        return reminder(num) % digit;
    }
    public static void main(String[] args) {
        System.out.println(reminder(542, 2));
    }
}


