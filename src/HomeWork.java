import java.util.Scanner;
public class HomeWork {
    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);
        //byte b = scanner.nextByte(); //nerroing
        //short a = b;
       // System.out.println(b);
       // System.out.println(a);
       // int c = (short)a;
        /*double b = scanner.nextDouble();
        float f = (float) b;                 // NO: 2
        System.out.println(b);
        System.out.println(f);*/
        /*byte p = (byte)3.14159;
        int Radius = scanner.nextInt();
        int area = p * Radius * Radius;
        int perimetr = 2 * p * Radius;
        System.out.println(area);
        System.out.println(perimetr);*/
        /*int i = 15;
        int j = 25;
        System.out.println(i+j);
        String c = "abc";
        System.out.println(c+i);*/
        byte b = scanner.nextByte();
        if(b<=18){
            System.out.println("Yes");
        }
        else{
            System.out.println("No");
        }

    }
}
