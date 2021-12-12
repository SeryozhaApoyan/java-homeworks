package week4;

public class Task22 {
    public static String Reverse(String str){
        int n = str.length();
        if (str.length() == 0){
            return str;
        }
        return str.charAt(str.length()-1) + Reverse(str.substring(0,(str.length())-1));
    }
    public static void main(String[] args) {
        String str = "alakh akbar";
        System.out.println(Reverse(str));
    }
}
