package Recursion323334;

public class StringSkip {
    public static void main(String[] args){
        String s = "baccappledajh";
//        StringBuilder ans = new StringBuilder();
//
//        for (int i = 0; i <s.length() ; i++) {
//            if(s.charAt(i) != 'a'){
//                ans.append(s.charAt(i));
//            }
//        }
//
//        System.out.println(ans);

//        String ans = ans(s,0);
//        System.out.println(ans);

//        String ans = skipAppNotAPPLE(s);
//        System.out.println(ans);
        ques1("","baccaad");

      


    }
    // method 1  for ques 1
    static String ans(String s,int index){
        String ans = "";
        if(index==s.length()){
            return ans;
        }

        if(s.charAt(index)!='a'){
            ans += s.charAt(index);
        }

        return ans + ans(s,index+1);

    }
    //method 2 for ques1 --- best method
    static void ques1(String p, String up) {
        if (up.isEmpty()) {
            System.out.println(p);
            return;
        }
        char ch = up.charAt(0);

        if (ch == 'a') {
            ques1(p, up.substring(1));
        } else {
            ques1(p + ch, up.substring(1));
        }
    }

    // ques 1 with string return --- best
    static String skip(String up) {
        if (up.isEmpty()) {
            return "";
        }

        char ch = up.charAt(0);

        if (ch == 'a') {
            return skip(up.substring(1));
        } else {
            return ch + skip(up.substring(1));
        }
    }

    static String skipApple(String s) {
        if (s.isEmpty()) {
            return "";
        }

        if (s.startsWith("apple")) {
            return skipApple(s.substring(5)); // skip "apple"
        } else {
            return s.charAt(0) + skipApple(s.substring(1)); // keep current char
        }
    }

    static String skipAppNotAPPLE(String s) {
        if (s.isEmpty()) {
            return "";
        }

        if (s.startsWith("app") && !s.startsWith("apple")) {
            return skipAppNotAPPLE(s.substring(3)); // skip "apple"
        } else {
            return s.charAt(0) + skipAppNotAPPLE(s.substring(1)); // keep current char
        }
    }

}