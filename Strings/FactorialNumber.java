package test.Strings;

public class FactorialNumber {

    public static int getValue(int num){
        int factorial = 1;
        if(num == 0 || num == 1){
            return 1;
        }else{
            for(int i=1; i <= num; i++){
                factorial *= i;
            }
        }
        return factorial;
    }

    public static void main(String[] args) {
        int k = getValue(5);
        System.out.println(k);
    }
}
