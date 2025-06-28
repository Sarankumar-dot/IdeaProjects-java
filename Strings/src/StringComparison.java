import java.util.Arrays;

public class StringComparison {
    public static void main(String[] args){
        String name = "saran";
        String name1 = "saran";
        String c = name;
        System.out.println(c == name1);

        String n = new String("saran");
        String m = new String("saran");
        System.out.println(n==m); // this gives false
        int mid = n.length()/2;

        System.out.println(n.charAt(2)); //printing char in a string 
        System.out.println(n.equals(m));

        // a line of code which is used for printing first half to small and second half to caps
        System.out.println(n.substring(0,mid).toLowerCase() + n.substring(mid).toUpperCase());
        // contains of method
        System.out.println(n.contains("sarankumar"));
        //the below code is used to convert a string into a character array
        char[] arr = n.toCharArray();
        System.out.println(Arrays.toString(arr));

        // converting a string into a hash code
        System.out.println(n.hashCode());

        System.out.println(n.indexOf('a'));
    }
}
