package test.Strings;

public class FindLengthWithBuiltnMethod {

    public static void getLength(String str){
        int count = 0;
        char [] ch = str.toCharArray();
        for(char sm : ch){
            count++;
        }
        System.out.println("Count: "+count);
    }
    public static void main(String[] args) {
        String str = "java";
        getLength(str);
    }
}
