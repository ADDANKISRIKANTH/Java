package test.Strings;

public class CompareTwoStrings {

    public static boolean getStrings(String str1,String str2){
        int len1 = str1.length();
        int len2 = str2.length();
        int min = Math.min(len1,len2);
        for(int i=0; i < min; i++){
            int ch1 = (int)str1.charAt(i);
            int ch2 = (int)str2.charAt(i);

            if(ch1 != ch2){
                return false;
            }
        }
        if(len1 != len2){
            return false;
        }else{
            return true;
        }
    }

    public static void main(String[] args) {
        String str1 = "Geeks";
        String str2 = "GeeksForGeeks";
        String str3 = "Geeks";
        boolean a = getStrings(str1,str2);
        System.out.println("compare a : "+a);
        boolean b = getStrings(str1,str3);
        System.out.println("compare b : "+b);
    }
}
