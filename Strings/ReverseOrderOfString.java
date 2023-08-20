package test.Strings;

public class ReverseOrderOfString {

    public static void getString(String str){
        int len = str.length();
        String s = "";
        for(int i=len-1; i >= 0; i--){
            char ch = str.charAt(i);
            s += String.valueOf(ch);
        }
        System.out.println(s);
    }


    public static void main(String[] args) {
        getString("Srikanth");
    }
}
