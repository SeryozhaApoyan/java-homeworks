package week2;
import java.io.RandomAccessFile;
import java.util.Scanner;
import java.util.Random;


public class Task6 {
    public static void main(String[] args) {
        Random random = new Random();
        int num = random.nextInt();
        int x = 0;
        if(num < 0){
            num = num * -1;
            //System.out.println(num);
        }
        x = num % 6;
        x = x + 2;
        System.out.println(x);
    }
}
