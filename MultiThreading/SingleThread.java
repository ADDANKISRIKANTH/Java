package test.MultiThreading;

public class SingleThread{
    public static void main(String[] args) {
            OneClass one = new OneClass();
            SecondOne two = new SecondOne();
            Thread t1 = new Thread(one);
            t1.start();
            Thread t2 = new Thread(two);
            t2.start();
    }


}

class OneClass implements Runnable{
    public void run(){
        for(int i=0; i <=5; i++){
            System.out.println("Task-1: "+i);
            try{
                Thread.sleep(2000);
            }catch(Exception e){
                e.printStackTrace();
            }
        }
    }
}
class SecondOne implements Runnable{
    public void run(){
        for (int i=101; i <= 105; i++){
            System.out.println("Task-2: "+i);
            try{
                Thread.sleep(2000);
            }catch(Exception e){
                e.printStackTrace();
            }
        }
    }
}