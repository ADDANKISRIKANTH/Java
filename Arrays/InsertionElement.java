package test.Arrays;

public class InsertionElement {


    public int insertionEle(int[] arr,int n,int key,int capacity){
        if(n >= capacity){
            return n;
        }
        arr[n] = key;
        return (n+1);
    }

    public void insertionAtParticulerPos(int [] arr,int n,int ele,int position){

        for(int i=n-1; i >= position; i--){
            arr[i+1] = arr[i];
        }
        arr[position] = ele;
    }

    public static void main(String[] args) {
        InsertionElement insert = new InsertionElement();
        int [] num = new int[20];
        num[0] = 10;
        num[1] = 20;
        num[2] = 30;
        num[3] = 40;
        num[4] = 50;
        num[5] = 60;
        int n = 6;
        int capacity = 20;
        int key = 26;
//        System.out.println("Before inserting array: ");
//        for(int i=0; i < n; i++){
//            System.out.println("Array: "+num[i]);
//        }
//        System.out.println("After inserting array: ");
//        n = insert.insertionEle(num,n,key,capacity);
//        for(int i=0; i < n; i++){
//            System.out.println("Array: "+num[i]);
//        }
      System.out.println("************");
        insert.insertionAtParticulerPos(num,n,22,2);
        n+=1;
        for(int i=0; i< n; i++){
            System.out.println(num[i]);
        }


    }
}
