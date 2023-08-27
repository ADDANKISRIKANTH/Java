package test.Arrays;

public class ElementSearching {

    public int findElements(int arr[], int n, int key){

        for(int i=0; i <= n-1; i++){
            if(arr[i] == key){
                return i;
            }
        }
        return -1;
    }

    public static void main(String[] args) {

        ElementSearching ele = new ElementSearching();


        int [] arr = {10,20,30,40,50};
        int len = arr.length;
        int position = ele.findElements(arr,len,70);
        if(position == -1){
            System.out.println("Element is not found: "+position);
        }else{
            System.out.println("Element is found at: "+position);
        }
    }
}


