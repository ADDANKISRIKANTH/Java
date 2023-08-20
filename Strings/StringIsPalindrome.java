package test.Strings;

public class StringIsPalindrome {

    public static void getString(String str){
        int len = str.length();
        String stri = "";
        for(int i=len-1; i >=0; i--){
            stri += str.charAt(i);
        }
        if(stri.equalsIgnoreCase(str)){
            System.out.println("palindrome");
        }else{
            System.out.println("not palindrome");
        }

    }

    public static void main(String[] args) {
        getString("ramar");
    }
}
