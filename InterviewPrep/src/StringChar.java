import java.util.Arrays;

public class StringChar {
    public static void main(String[] args) {
        String s = "sarankumar";
        int[] arr  = new int[26];

        for (int i = 0; i <s.length();i++) {
            int charPlace = s.charAt(i);
           // System.out.println(charPlace);
            arr[charPlace - 97]+=1;

        }
        System.out.println(Arrays.toString(arr));

        for (int i = 0; i <arr.length ; i++) {
            if(arr[i] > 0){
                char ch = (char) (i + 97);
                System.out.println(ch + " " + arr[i]);
            }
        }


    }
}
