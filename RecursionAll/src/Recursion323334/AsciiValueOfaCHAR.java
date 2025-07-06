package Recursion323334;

public class AsciiValueOfaCHAR {
    public static void main(String[] args) {
     char ch = 'a';
        System.out.println(ch+0);

        ascii("sar");
    }
    //specific char ascii value of a string
    static void ascii(String up){
        if(up.isEmpty()){
            return;
        }

        System.out.println(up.charAt(0)+0);
        ascii(up.substring(1));
    }

}
