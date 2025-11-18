package Strings;

public class Strings {
    public static void main(String[] args) {
        String s = "saran";

        int count = 0;
        for (int i = 0; i <s.length() ; i++) {
            if(Character.isLowerCase(s.charAt(i))){
                count++;
            }
        }

        System.out.println(count);
    }
}
