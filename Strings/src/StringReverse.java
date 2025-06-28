public class StringReverse {
    public static void main(String[] args) {
        String name = "sis";
        String reverse = "";

        for (int i = name.length() -1; i >=0; i--) {
            reverse = reverse + name.charAt(i);
        }

        if(name.equals(reverse)){
            System.out.println("it is palin");
        }else{
            System.out.println("not palin");
        }
    }
}
