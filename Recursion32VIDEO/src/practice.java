import java.util.ArrayList;
import java.util.List;

public class practice {
    public static void main(String[] args) {
//        System.out.println(skipApple("bcappappledaa"));

//          ArrayList<String> ans = subs2("","abc");
//          System.out.println(ans);

//        ascii1("ab");
//        int[] arr = {4,4,4,1,4};
//        List<List<Integer>> ans = subset1(arr);
//        System.out.println(ans);

//        ArrayList<String> ans = permutationsRET("","abc");
//        System.out.println(ans);

//        int ans = permutationsCount("","abc");
//        System.out.println(ans);

//        pad("","12");

//        ArrayList<String> ans = padRET("","12");
//        System.out.println(ans);

//        int ans = padCount("","12");
//        System.out.println(ans);

//        dice("",4);
//        ArrayList<String> ans = diceRET("",4);
//        System.out.println(ans);

//        diamond(5);

//        int ans =pad2("","12");
//        System.out.println(ans);

    }

    static void ans(String p,String up){
        if(up.isEmpty()){
            System.out.println(p + " ");
            return;
        }

        char ch = up.charAt(0);

        if(ch == 'a'){
            ans(p,up.substring(1));
        }else{
            ans(p+ch,up.substring(1));
        }
    }

    static String ans1(String up){
        if(up.isEmpty()){
            return "";
        }

        char ch = up.charAt(0);

        if(ch == 'a'){
            return ans1(up.substring(1));
        }else{
            return ch + ans1(up.substring(1));
        }
    }

    static String skipApple(String up){
        if(up.isEmpty()){
            return "";
        }

        char ch = up.charAt(0);

        if(up.startsWith("app") && !up.startsWith("apple") ){
            return skipApple(up.substring(3));
        } else{
            return ch + skipApple(up.substring(1));
        }
    }

    // string subsquence

    static void subs1(String p ,String up){
        if(up.isEmpty()){
            System.out.println(p+" ");
            return;
        }

        char ch = up.charAt(0);

        subs1(p+ch , up.substring(1));
        subs1(p,up.substring(1));
    }

    static ArrayList<String> subs2(String p, String up){
        if(up.isEmpty()){
            ArrayList<String> list = new ArrayList<String>();
            list.add(p);
            return list;
        }
        ArrayList<String> list = new ArrayList<String>();
        char ch = up.charAt(0);

        list.addAll(subs2(p+ch,up.substring(1)));
        list.addAll(subs2(p,up.substring(1)));

        return list;

    }

    // ascii value of a char
    static void ascii1(String up){
        if(up.isEmpty()){
            return;
        }

        char ch = up.charAt(0);
        System.out.println(ch+0);
        ascii1(up.substring(1));
    }
  // ascii value returned in a list
    static ArrayList<Integer> ascii2(String up){
        if(up.isEmpty()){
            ArrayList<Integer> list = new ArrayList<>();
            return list;
        }
        ArrayList<Integer> list = new ArrayList<>();
        char ch = up.charAt(0);
        list.add(ch+0);
        list.addAll(ascii2(up.substring(1)));

        return list;
    }

    // subset using integers
    static List<List<Integer>> subset1(int[] arr){
        List<List<Integer>> outer  = new ArrayList<>();
        outer.add(new ArrayList<>());

        for(int num : arr){
            int n =  outer.size();

            for (int i = 0; i < n; i++) {
                List<Integer> inner = new ArrayList<>(outer.get(i));
                inner.add(num);
                outer.add(inner);
            }
        }

//        List<List<Integer>> finalans = new ArrayList<>();
//        finalans.add(new ArrayList<>());
//        for (int i = 0; i <outer.size() ; i++) {
//            if(!finalans.contains(outer.get(i))){
//                finalans.add(outer.get(i));
//            }
//        }

        return outer ;
    }

    // string permutations

    // just printing them
    static void permutations(String p,String up){
        if(up.isEmpty()){
            System.out.println(p + " ");
            return;
        }

        char ch = up.charAt(0);

        for (int i = 0; i <=p.length() ; i++) {
            String first = p.substring(0,i);
            String second = p.substring(i,p.length());
            permutations(first+ch+second,up.substring(1));
        }
    }

    // return a list
    static ArrayList<String> permutationsRET(String p,String up){
        if(up.isEmpty()){
            ArrayList<String> list = new ArrayList<>();
            list.add(p);
            return list;
        }

        char ch = up.charAt(0);
        ArrayList<String> list = new ArrayList<>();
        for (int i = 0; i <=p.length() ; i++) {
            String first = p.substring(0,i);
            String second = p.substring(i,p.length());
            list.addAll(permutationsRET(first+ch+second,up.substring(1)));
        }

        return list;
    }

    // count the number of permutations
    static int  permutationsCount(String p,String up){

        if(up.isEmpty()){
            return 1;
        }

        char ch = up.charAt(0);
        int count  = 0 ;
        for (int i = 0; i <=p.length() ; i++) {
            String first = p.substring(0,i);
            String second = p.substring(i,p.length());
            count += permutationsCount(first+ch+second,up.substring(1));
        }

        return count;
    }

    // phone pad
    //just printing

    static void pad(String p,String up){
        if(up.isEmpty()){
            System.out.print(p+" ");
            return;
        }

        int digit = up.charAt(0) - '0';

        for (int i = (digit-1)*3; i < digit*3 ; i++) {
            char ch = (char) ('a' + i) ;
            pad(p+ch,up.substring(1));
        }
    }
    // store it in a list
    static ArrayList<String> padRET(String p, String up){
        if(up.isEmpty()){
            ArrayList<String> list = new ArrayList<>();
            list.add(p);
            return list;
        }

        int digit = up.charAt(0) - '0';
        ArrayList<String> list = new ArrayList<>();
        for (int i = (digit-1)*3; i < digit*3 ; i++) {
            char ch = (char) ('a' + i );
            list.addAll(padRET(p+ch,up.substring(1)));
        }

        return list;
    }
    // count
    static int  padCount(String p,String up){
        if(up.isEmpty()){
            return 1;
        }

        int digit = up.charAt(0) - '0';
        int count = 0;
        for (int i = (digit-1)*3; i < digit*3 ; i++) {
            char ch = (char) ('a' + i) ;
            count += padCount(p+ch,up.substring(1));
        }

        return count;
    }

    // dice just print

    static void dice(String p,int target){
        if(target ==0){
            System.out.println(p+" ");
            return;
        }

        for (int i = 1; i <=6 && i<=target ; i++) {
            dice(p+i,target-i);
        }
    }

    // dice add ito list
    static ArrayList<String> diceRET(String p,int target){
        if(target ==0){
            ArrayList<String> list = new ArrayList<>();
            list.add(p);
            return list;
        }
        ArrayList<String> list = new ArrayList<>();
        for (int i = 1; i <=6 && i<=target ; i++) {
            list.addAll(diceRET(p+i,target-i));
        }

        return list;
    }

    static void diamond(int n){
        //upper half
        for (int i = 1; i <=n ; i++) {
            // print spaces
            for (int j = 1; j <= n - i; j++) {
                System.out.print(" ");
            }

            //print stars
            for (int j = 1; j <=i; j++) {
                System.out.print("* ");
            }

            System.out.println();
        }

        // lower half
        for (int i = 1; i <n ; i++) {
            //print spaces
            for (int j = 1; j <=i ; j++) {
                System.out.print(" ");
            }
            //print stars
            for (int j = 1; j <=n-i ; j++) {
                System.out.print("* ");
            }

            System.out.println();
        }
    }



}
