public class practice {
    public static void main(String[] args) {
        int num =100;

        int[] arr = {1,1,3,4,4,5,5,3,114};

        int ans = findUnique(arr);
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


}
