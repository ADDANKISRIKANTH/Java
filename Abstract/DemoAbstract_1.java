package test.Abstract;



abstract class AClass{
    public static int a;
    public int b;

    AClass(int a,int b){
        AClass.a=a;
        this.b=b;
    }

    public static void getValues(int a){
        System.out.println("A: "+a);
    }

    public void getNumbers(int b){
        System.out.println("B: "+b);
    }

    public abstract void getDisplay();
}

class EClass extends AClass{

    EClass(int a, int b){
        super(a,b);
    }
    public void getDisplay(){
        System.out.println("A value : "+a);
        System.out.println("B value : "+b);
    }
}

public class DemoAbstract_1 {

    public static void main(String[] args) {
        EClass css = new EClass(10,20);
        EClass.getValues(10);
        css.getNumbers(20);
        css.getDisplay();
    }
}
