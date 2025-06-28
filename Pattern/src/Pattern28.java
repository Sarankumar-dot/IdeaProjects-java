public class Pattern28 {
    public static void main(String[] args) {
        pattern28(5);

    }

    static void pattern28(int n){
        for (int row = 0; row <2 * n; row++) {

            int totalcol = row > n ? 2 * n - row : row;
            int spaces = n - totalcol;

            for (int s = 0; s < spaces; s++) {
                System.out.print(" ");

            }
            for (int col = 0; col < totalcol; col++) {
                System.out.print("* ");

            }
            System.out.println();



        }
    }
}
