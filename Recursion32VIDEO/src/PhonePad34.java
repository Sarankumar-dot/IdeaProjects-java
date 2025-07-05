import java.util.ArrayList;

public class PhonePad34 {
    // leetcode 17

    public static void main(String[] args) {
        pad("","12");

//        ArrayList<String> ans = pad3("","12");
//        System.out.println(ans);

//        int ans = pad4("","12");
//        System.out.println(ans);

    }

    static void pad(String p, String up){
        if(up.isEmpty()){
            System.out.print(p+" ");
            return;
        }

        int digit = up.charAt(0) - '0';

        for (int i = (digit-1)*3; i < digit*3 ; i++) {
            char ch = (char) ('a' + i );
            pad(p+ch,up.substring(1));
        }
    }

    // adding them into an arraylist

    static ArrayList<String> helper1(String up){
        return helper2("",up);
    }

    static ArrayList<String> helper2(String p,String up){
        return pad2(p,up,new ArrayList<String>());
    }
    static ArrayList<String> pad2(String p, String up,ArrayList<String> list){
        if(up.isEmpty()){
            list.add(p);
            return list;
        }

        int digit = up.charAt(0) - '0';

        for (int i = (digit-1)*3; i <digit*3 ; i++) {
            char ch = (char) ('a' + i );
            pad2(p+ch,up.substring(1),list);
        }

        return list;
    }

    // easy way to return list
    static ArrayList<String> pad3(String p, String up){
        if(up.isEmpty()){
            ArrayList<String> list = new ArrayList<>();
            list.add(p);
            return list;
        }
        ArrayList<String> list = new ArrayList<>();
        int digit = up.charAt(0) - '0';

        for (int i = (digit-1)*3; i <digit*3 ; i++) {
            char ch = (char) ('a' + i );
            list.addAll(pad3(p+ch,up.substring(1)));
        }
        return list;
    }

    //return the count
    static int pad4(String p, String up){
        if(up.isEmpty()){
            return 1;
        }
        int count = 0;
        int digit = up.charAt(0) - '0';

        for (int i = (digit-1)*3; i <digit*3 ; i++) {
            char ch = (char) ('a' + i );
            count = count + pad4(p+ch,up.substring(1));
        }

        return count;
    }



}
