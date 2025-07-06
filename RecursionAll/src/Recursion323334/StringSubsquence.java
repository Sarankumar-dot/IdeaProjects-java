package Recursion323334;

import java.util.ArrayList;

public class StringSubsquence {
    public static void main(String[] args) {
//        ArrayList<String> result = subsRET("", "abc");
//        System.out.println(result);

          subs("","abc");

    }

    static void subs(String p, String up){
        if(up.isEmpty()){
            System.out.print(p+ " ");
            return;
        }

        char ch = up.charAt(0);

        subs(p + ch , up.substring(1));
        subs(p , up.substring(1));
    }

    // adding this in arraylist
    static ArrayList<String> subs1(String p, String up, ArrayList<String> list){
        if(up.isEmpty()){
            list.add(p);
            return list;
        }

        char ch = up.charAt(0);

        subs1(p + ch , up.substring(1),list);
        subs1(p , up.substring(1),list);

        return list;
    }

    static ArrayList<String> subsRET(String p, String up){
        if(up.isEmpty()){
            ArrayList<String> list = new ArrayList<>();
            list.add(p);
            return list;
        }

        char ch = up.charAt(0);
        ArrayList<String> list = new ArrayList<>();

        list.addAll(subsRET(p + ch , up.substring(1)));
        list.addAll(subsRET(p , up.substring(1)));

        return list;
    }
}
