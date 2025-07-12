package LinearSearch;

public class MaxWealthLinear {
    public static void main(String[] args) {
        int[][] arr = {{1,2,3},{45,6,7},{33,66,77}};
        System.out.println(MaxWealth(arr));
    }

    static int MaxWealth(int[][] accounts){
        int ans = Integer.MIN_VALUE;

        for (int i = 0; i < accounts.length; i++) {
            int rowsum = 0;
            for (int j = 0; j < accounts[i].length; j++) {
                rowsum += accounts[i][j];

            }

            if(rowsum>ans){
                ans = rowsum;
            }

        }return ans;
    }

}
