package week4;

public class Task21 {
    public static int countOfDigitsSeven(int number){
        if(number <= 9){
            if(number == 7){
                return  1;
            }
            else {
                return 0;
            }
        }
        return countOfDigitsSeven(number % 10) + countOfDigitsSeven(number / 10);
    }
    public static void main(String[] args) {
        System.out.println(removeX("xthgfxnj"));
    }
    public static String removeX(String string){
        if(string.length() == 0){
            return string;
        }
        if(string.charAt(0) != 'x' && string.charAt(0) != 'X'){
            return string.charAt(0) + removeX(string.substring(1));
        }
        return removeX(string.substring(1));
    }
}
