public class StringPalindrome {
    public static void main(String[] args) {
        String name = null;
        System.out.print(isPalin(name));

    }

    static boolean isPalin(String str){
        if(str == null ||str.length() == 0){
            return true;
        }
        str = str.toLowerCase();

        for(int i = 0;i <= str.length() /2;i++){
            char start  = str.charAt(i);
            char end = str.charAt(str.length() -1 -i);

            if(start != end){
                return false;
            }
        }
        return true;
    }
}

import java.util.Arrays;

public class WordPalin {
    // reversing the string of words 
    // wprd palindrome
    public static void main(String args[]) {
       String s = "iam saran kumar";
       String[] arr = s.split(" ");
        System.out.println(Arrays.toString(arr));

        for(int i = arr.length -1 ;i>=0;i--){
            if(i!=arr.length-1){
                System.out.print(" ");
            }

            System.out.print(arr[i]);
        }
    }
}

