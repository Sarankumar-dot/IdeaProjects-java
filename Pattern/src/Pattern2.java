public class Pattern2 {
    public static void main(String[] args) {
        Pattern2num(5);
    }

    static void Pattern2(int n){
        for (int row = 1; row <= n; row++) {
            for (int col = 1; col <= row; col++) {
                System.out.print("* ");

            }
            System.out.println();

        }
    }

    static void Pattern2num(int n){
        for (int row = 1; row <= n; row++) {
            for (int col = 1; col <= row; col++) {
                System.out.print(col + " ");

            }
            System.out.println();

        }
    }

}
