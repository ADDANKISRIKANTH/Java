package test.Strings;

public class SumOfDigits {

    public static void getValue(String str){
        int val = 0;
        for(int i=0; i < str.length(); i++){
            char ch = str.charAt(i);
            if(Character.isDigit(ch)){
                int k = Character.getNumericValue(ch);
                val +=k;
            }
        }
        System.out.println("Sum: "+val);
    }

    public static void main(String[] args) {
        String str = "Hello143";
        getValue(str);
    }
}
