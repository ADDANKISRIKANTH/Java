package test.Strings;

public class FindPositionOfString {

    public static char getPosition(String str, int index){
        return str.charAt(index);
    }

    public static void insertAtPosition(String str,String ch,int pos){
        StringBuilder sb = new StringBuilder(str);
        sb.insert(pos,ch);
        String modified = sb.toString();
        System.out.println(modified);
    }

    public static void getChangeStringAtPosition(String str,char ch, int index){
        str = str.substring(0, index) + ch
                + str.substring(index + 1);
        System.out.println(str);
    }

    public static void main(String[] args) {
        String  str = "Geeks Gor Geeks";
        String ch = "For";
        int len = 6;
        char f= 'F';
        char k = getPosition(str,len);
        System.out.println(k);
        System.out.println("***********");
        insertAtPosition(str,ch,len);
        System.out.println("Get String index position to change: ");
        getChangeStringAtPosition(str,f,len);
    }
}
