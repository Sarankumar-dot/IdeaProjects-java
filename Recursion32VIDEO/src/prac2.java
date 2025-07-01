import java.util.ArrayList;

public class prac2 {
    public static void main(String[] args) {
//        ArrayList<String> ans = sub2("","abc");
//        System.out.println(ans);

        ascii("sar");


    }

    static void strSkip(String p , String up){
        if(up.isEmpty()){
            System.out.println(p);
            return;
        }

        char ch = up.charAt(0);

        if(ch == 'a'){
            strSkip(p , up.substring(1));
        }else{
            strSkip(p+ch , up.substring(1));
        }
    }

    static String strSkip2(String p , String up){
        if(up.isEmpty()){
            return p;
        }

        char ch = up.charAt(0);

        if(ch == 'a'){
            return strSkip2(p , up.substring(1));
        }else {
            return strSkip2(p + ch, up.substring(1));
        }

    }
    static String skipapple(String  s){
        if(s.isEmpty()){
            return "";
        }

        if(s.startsWith("apple")){
            return skipapple(s.substring(5));
        }else{
            return s.charAt(0) + skipapple(s.substring(1));
        }

    }

    static String skipapp(String s){
        if(s.isEmpty()){
            return "";
        }

        if(s.startsWith("app") && !s.startsWith("apple")){
            return skipapp(s.substring(3));
        }else{
            return s.charAt(0) + skipapp(s.substring(1));
        }
    }

    // string subsquence

    static void subsequence(String p , String up){
        if(up.isEmpty()){
            System.out.println(p);
            return;
        }

        char ch = up.charAt(0);

         subsequence(p+ ch , up.substring(1));
         subsequence(p,up.substring(1));
    }

    // returning in an arraylist

    static ArrayList<String> subsequence1(String p , String up ,ArrayList<String> list){
        if(up.isEmpty()){
            list.add(p);
            return list;
        }

        char ch = up.charAt(0);

        subsequence1(p+ ch , up.substring(1),list);
        subsequence1(p,up.substring(1),list);

        if(list.contains("")){
            list.remove("");
        }
        return list;
    }


    static ArrayList<String> sub2(String p, String up){
        ArrayList<String> list = new ArrayList<>();

        if(up.isEmpty()){
            list.add(p);
            return list;
        }

        char ch = up.charAt(0);

        list.addAll(sub2(p+ch , up.substring(1)));
        list.addAll(sub2(p , up.substring(1)));

        return list;
    }

    // ascii value of a char

    static void ascii(String a){
        if(a.isEmpty()){
            return;
        }
        char ch = a.charAt(0);
        System.out.println(ch + 0);
        ascii(a.substring(1));
    }




}
