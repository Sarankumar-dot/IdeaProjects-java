import java.util.ArrayList;

public class practice {
    public static void main(String[] args) {
        int num =100;

        int[] arr = {1,1,3,4,4,5,5,3,114};

//        int ans = findUnique(arr);
//        System.out.println(ans);

        ArrayList<Integer> ans = factors(10000000);
        System.out.println(ans);


    }

    static void oddeven(int n){
        if((n & 1)==1){
            System.out.println("odd");
        }else{
            System.out.println("even");
        }
    }

    static int findUnique(int[] arr){
        int unique = 0;

        for (int j : arr){
            unique = unique ^ j;
        }

        return unique;
    }

    static ArrayList<Integer> factors(int n){
        ArrayList<Integer> list = new ArrayList<>();

        for (int i = 1; i <=n ; i++) {

            if((n%i) == 0){
                list.add(i);
            }


        }
        return  list;
    }


}
