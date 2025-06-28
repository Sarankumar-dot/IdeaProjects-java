public class Armstrong {
    public static void main(String[] args) {
        for (int i = 1; i <990 ; i++) {
            boolean ans = strong(i);
            if(ans == true){
                System.out.println(i);
            }



        }

    }

    static boolean strong(int n){
        int original = n;
        int arm = 0;
        while(n>0){
            int rem = n %10;
            arm = arm + rem*rem*rem;
            n = n/10;
        }
        if(arm ==original){
            return true;
        }return false;
    }
}
