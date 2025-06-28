public class Main {
    public static void main(String[] args) {
        String name = "sissss";
        System.out.println(palin1(name));
        palin(name);
    }

    static void palin(String name){

        String rev = "";

        for (int i = name.length() -1; i >=0 ; i--) {
            rev = rev + name.charAt(i);


        }

        if(name.equals(rev)){
            System.out.println("is palin");
        }else{
            System.out.println("not palin");
        }
    }

    static boolean palin1(String name){

        for (int i = 0; i < name.length()/2; i++) {
            char start =name.charAt(i);
            char end = name.charAt(name.length()-1-i);

            if(start!=end){
                return false;
            }

        }
        return true;
    }

}