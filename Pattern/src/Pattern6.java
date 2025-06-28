public class Pattern6 {
    public static void main(String[] args) {
        pattern6(5);

    }

    static void pattern6(int n) {
        for (int row = 0; row < n; row++) {
            // Printing spaces
            for (int s = 0; s < n - row - 1; s++) {
                System.out.print(" ");
            }
            // Printing stars
            for (int col = 0; col <= row; col++) {
                System.out.print("*");

            }
            // Moving to the next line after printing a row
            System.out.println();
        }
    }
}
