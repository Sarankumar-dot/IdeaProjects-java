public class MaximumSumSubarrayK {
    public static void main(String[] args) {
        // brute force o(n^2)
        int[] arr = {1,1,1,1,4,4,2,2,1};
        int k = 4;

        int ans = 0;
        for (int i = 0; i < arr.length; i++) {
            int sum = 0;
            for (int j = i; j < arr.length; j++) {
                sum = sum + arr[j];

                if(sum > k){
                    break;
                }
                if (sum == k) {
                    ans = Math.max(ans, j-i+ 1);
                }
            }
        }
        System.out.println(ans);


    }
}
