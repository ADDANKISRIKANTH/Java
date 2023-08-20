package test.Strings;

public class FebonacciSeries {

    public static void getValue(int num){
        int num1=0;
        int num2 = 1;
        int num3=0;
        for(int i=2; i<num; i++){
            num3 = num1+num2;
            num1=num2;
            num2=num3;
        }
        System.out.println(num3);
    }

    public static void main(String[] args) {
        getValue(5);

    }

}
// n1 = 0, n2 = 1, n3 = 0, int i = 2; count = 5;
// for(i=2; i< count; i++)
// n3 = n1+n2; = 0+1 = 1, 1+1 = 2, 2+1 = 3, 3+2 = 5, 5+3 = 8
// n1 = n2; = 1  = 1 = 2 = 3
// n2 = n3; = 1 =  2 = 3 = 5

// 1 >