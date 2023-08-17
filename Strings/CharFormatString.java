package test.Strings;

public class CharFormatString {

    public static void getChar(String str){
        for(int i=0; i < str.length(); i++){
            char ch = str.charAt(i);
            if(i == str.length()-1){
                System.out.println(ch);
            }else{
                System.out.println(ch+",");
            }
        }
    }

    public static void main(String[] args) {
        String str = "Hello Java";
        getChar(str);
    }
}
