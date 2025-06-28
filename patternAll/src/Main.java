public class Main {
    public static void main(String[] args) {
        pattern(5);

    }

    static void pattern(int n) {
        //upper half
        for (int i = 1; i <=n ; i++) {
            //spaces
            for (int j = 1; j <=i-1 ; j++) {
                System.out.print(" ");
            }
            // stars
            for (int j = 1; j <=n-i+1 ; j++) {
                if(i==1 || j==1 || j==n-i+1){
                    System.out.print("* ");
                }else{
                    System.out.print("  ");
                }

            }
            System.out.println();
        }
        //lower half
        for (int i = 1; i < n ; i++) {
            //print spaces
            for (int j = 1; j <=n-i-1 ; j++) {
                System.out.print(" ");
            }
            //print stars
            for (int j = 1; j <=i+1; j++) {
                if(i==n-1||j==1 || j==i+1){
                    System.out.print("* ");
                }else{
                    System.out.print("  ");
                }
            }
            System.out.println();
        }

    }
}