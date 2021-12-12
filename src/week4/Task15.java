package week4;

public class Task15 {
    public static char firstNonRepeated(String str){
        boolean bool = false;
        char ch = str.charAt(str.length()-1);

        for(int i = 0; i < str.length(); i++){
            if(bool){
                ch = str.charAt(i-1);
                break;
            }
            for(int j = 0; j < str.length(); j++){
                if(str.charAt(i) == str.charAt(j)){
                    if(i == j){
                        continue;
                    }
                    bool = false;
                    break;
                }
                bool = true;
            }
        }
        return ch;
    }
    public static void main(String[] args) {
        String str = "aghttdfdgh";
        System.out.println(firstNonRepeated(str));
    }
}
