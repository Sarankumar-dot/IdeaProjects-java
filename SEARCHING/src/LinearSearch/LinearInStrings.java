package LinearSearch;

import java.util.Arrays;

public class LinearInStrings {
    public static void main(String[] args) {
        char target = 'n';
        String name = "saran";
        boolean ans = Search2(name,target);
        System.out.println(ans);

        System.out.println(Arrays.toString((name.toCharArray())));

    }

    static boolean Search1(String str,char target) {
        if (str.length() == 0) {
            return false;
        }

        for (int i = 0; i <= str.length(); i++) {
            if (target == str.charAt(i)) {
                return true;
            }
        }
        return false;
    }
   // by using for each loop
    static boolean Search2(String str,char target) {
        if (str.length() == 0) {
            return false;
        }

        for (char ch :str.toCharArray()) {
            if (target == ch) {
                return true;
            }
        }
        return false;
    }
}
