package week4;

public class Task16 {
    public static int count(String str, char ch){
        int count = 0;
        for(int i = 0; i < str.length(); i++){
            if (str.charAt(i) == ch){
                count++;
            }
        }
        return count;
    }
    public static void main(String[] args) {
        String str = "dykygyu8";
        System.out.println(str.charAt(2));
        char ch = '0';
        System.out.println(count(str,ch));
    }
}
