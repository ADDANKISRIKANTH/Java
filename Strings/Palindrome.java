package test.Strings;

public class Palindrome {

    // num = 545   step -1
    // 545%10 = 5
    // sum =  50+5 = 55
    // num = 545/10 = 54 step -2
    // rem = 54%10 = 4
    // sum = 550+4 = 554
    // num = 54/10 = 5 - step -3
    // rem = 5%10 =  0
    // sum = 554*10 = 5540
    // num = 5/10 = 0


    public static void getValue(int num){
        int temp = num;
        int sum =0;
        int rem;
        while(num>0){
            rem = (num%10);
            sum = (sum*10)+rem;
            num = num/10;
        }

        if(temp == sum){
            System.out.println("Palindrome");
        }else{
            System.out.println("Not palindrome");
        }


    }

    public static void main(String[] args) {
        getValue(545);
    }
}
