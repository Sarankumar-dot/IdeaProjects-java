import java.util.ArrayList;

public class Permutations33video {
    public static void main(String[] args) {

        permutations("","abc");
//        ArrayList<String> ans =helper("","abc");
//        System.out.println(ans);

//        int ans = permutationsCount("","absc");
//        System.out.println(ans);
    }
    
    static void permutations(String p, String up){
        if(up.isEmpty()){
            System.out.print(p+ " ");
            return;
        }
        
        char ch = up.charAt(0);

        for (int i = 0; i <=p.length() ; i++) {
            String first = p.substring(0,i);
            String second = p.substring(i,p.length());
            permutations(first + ch + second , up.substring(1));
        }
    }

    // adding answers in a list
    static ArrayList<String> helper(String p,String up){
        return permutationsList(p,up,new ArrayList<>());
    }

    static ArrayList<String> permutationsList(String p, String up,ArrayList<String> list ){
        if(up.isEmpty()){
            list.add(p);
            return list;
        }

        char ch = up.charAt(0);

        for (int i = 0; i <=p.length() ; i++) {
            String first = p.substring(0,i);
            String second = p.substring(i,p.length());
            permutationsList(first + ch + second , up.substring(1),list);
        }

        return list;
    }

    // counting number of permutations
    static int  permutationsCount(String p, String up){
        if(up.isEmpty()){
           return 1;
        }
        int count = 0;
        char ch = up.charAt(0);

        for (int i = 0; i <=p.length() ; i++) {
            String first = p.substring(0,i);
            String second = p.substring(i,p.length());
            count = count + permutationsCount(first + ch + second , up.substring(1));
        }

        return count;
    }
}
