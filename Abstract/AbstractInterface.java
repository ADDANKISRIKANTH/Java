package test.Abstract;


interface ITest1{
    public abstract void  m1(int x);
    public abstract void m2(int y);
    public abstract void m3(int z);
}

abstract class MClass implements ITest1{
    public void m1(int x){
        System.out.println("x: "+x);
    }

    public void m2(int y){
        System.out.println("y: "+y);
    }



}

class NClass extends MClass{
    public void m3(int z){
        System.out.println("z: "+z);
    }
}
public class AbstractInterface {
    public static void main(String[] args) {
        NClass num = new NClass();
        num.m1(10);
        num.m2(20);
        num.m3(30);
    }

}
