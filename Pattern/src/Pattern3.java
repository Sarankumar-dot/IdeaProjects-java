public class Pattern3 {
    public static void main(String[] args) {
        Pattern3(5);

    }

    static void Pattern3(int n){
        for (int row = 1; row <= n; row++) {
            for (int col = 1; col <= n-row+1 ; col++) {
                System.out.print("* ");

            }
            System.out.println();
        }
    }
}
