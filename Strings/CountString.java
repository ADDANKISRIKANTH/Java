package test.Strings;

public class CountString {

    public static void getValue(String str){
        int len = str.length();
        int count = 1;
        char ch = 0;
        for(int i=0; i < len; i++){
            for(int j=i+1; j< len; j++){
                if(str.charAt(i) == str.charAt(j)){
                    count++;
                    ch = str.charAt(i);
                }
            }
        }
        System.out.println("char: "+ch+" "+count);
    }

    public static void main(String[] args) {
        String str = "Srriikanth";
        getValue(str);
    }
}

// srrttjk;
