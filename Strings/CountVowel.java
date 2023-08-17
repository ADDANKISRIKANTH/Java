package test.Strings;

public class CountVowel {

    public static void getVowel(String str){
        int countVowl = 0;
        for(int i=0; i < str.length(); i++) {
            if(isChar(str.charAt(i))){
                countVowl++;
            }
        }
        System.out.println("count: "+countVowl);
    }

    public static boolean isChar(char ch){
        if(ch == 'A' || ch == 'E' || ch == 'I' || ch == 'O' || ch == 'U'){
            return true;
        }else{
            return false;
        }
    }

    public static void main(String[] args) {

        String str = "Hello Java";
        getVowel(str);
    }
}
