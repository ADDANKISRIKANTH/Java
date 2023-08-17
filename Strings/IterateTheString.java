package test.Strings;

public class IterateTheString {

    public static void getString(String str){
        for(int i=0; i < str.length(); i++){
            System.out.println("String: "+str.charAt(i));
        }
    }
    public static void main(String[] args) {
        String str = "Java";
        getString(str);
    }
}
