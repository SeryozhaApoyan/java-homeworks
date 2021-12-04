package week2;
import java.util.Scanner;
public class Task8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        if((a % 7 == 0 || b % 7 ==0) && (a >0 && b > 0) && a > b){
                    if(a%2 == 1){
                        for(int i= 0; a > b; i ++){
                            System.out.println(a);
                            a = a -2;
                        }
                    }
                    else{
                        a = a - 1;
                        for(int i= 0; a > b; i ++) {
                            System.out.println(a);
                            a = a - 2;
                        }
                    }
        }
        else{
            if (a % 2 == 0){
                 for (int i= 0; a > b; i ++){
                     System.out.println(a);
                     a = a - 2;
                 }
                System.out.println(a);
            }

        }
    }
}
