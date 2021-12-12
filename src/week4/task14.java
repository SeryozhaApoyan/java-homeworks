package week4;
import java.util.Scanner;
public class task14 {
    public static boolean checkBinStr(String str){
        boolean bool = false;
        for(int i = 0; i <str.length(); i++){
           if(str.charAt(i) == '0' || str.charAt(i) == '1'){
                bool = true;
           }
           else{
               bool = false;
               break;
           }
        }
        return bool;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String str = scanner.next();
        if(checkBinStr(str)){
            System.out.println(str + " is a binary string");
        }
        else{
            System.out.println(str + " is NOT a binary string");
        }
    }
}
