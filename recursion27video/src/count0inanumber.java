public class count0inanumber {
    public static void main(String[] args){
        int ans =count(10101011);
        System.out.println(ans);

    }

    static int countzero(int n){
        int count = 0;
        while(n>0){
            int rem = n%10;
            if(rem == 0){
                count++;
            }
            n = n/10;
        }
        return count;
    }

    // recursive way

    static int count(int n){
        return helper(n,0);
    }

    static int helper(int n,int c){
        if(n==0){
            return c;
        }

        int rem = n%10;
        if(rem == 0){
            return helper(n/10,c+1);
        }
        return helper(n/10,c);
    }
}
