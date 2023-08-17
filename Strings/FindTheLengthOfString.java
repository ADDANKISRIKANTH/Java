package test.Strings;

public class FindTheLengthOfString {

    public static void getStringLength(String str){
        int len = str.length();
        System.out.println("Length: "+len);
    }
    public static void main(String[] args) {
        String str = "Hello Hyderabad";
        getStringLength(str);
    }
}
