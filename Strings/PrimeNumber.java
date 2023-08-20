package test.Strings;

public class PrimeNumber {

    public static void getPrime(int num){
        boolean isPrime = false;
        for(int i=0; i < num; i++){
            if(num%2 == 0){
                isPrime = true;
            }
        }
        if(isPrime){
            System.out.println(" not prime");
        }else{
            System.out.println("prime");
        }

    }

    public static void main(String[] args) {
        getPrime(5);
    }
}
