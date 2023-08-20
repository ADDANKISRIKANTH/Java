package test.Strings;

public class ArmStrongNumber {

    public static void getValue(int num){
        int temp = num;
        int last;
        int a = 0;
        while(num!=0){
            last = num%10;
            a = a+(last*last*last);
            num = num/10;
        }
        System.out.println(a+" "+temp);
        if(temp == a){
            System.out.println("Armstrong");
        }else{
            System.out.println("Not armStrong");
        }
    }

    public static void main(String[] args) {
        getValue(153);
    }
}
