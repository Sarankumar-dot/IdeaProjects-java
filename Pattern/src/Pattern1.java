public class Pattern1 {
    public static void main(String[] args) {
        Pattern1(4);
        System.out.println();
        pattern1(4);


    }

    static void Pattern1(int n){
        for(int row = 1; row<=n;row++){
            for(int col = 1;col<=n;col++){
                System.out.print("*  ");
            }
            System.out.println();
        }

    }

    static void pattern1(int n){
        for(int row = 1;row<=n;row++){
            for(int col = 1;col<=n;col++){
                System.out.print(row + " ");
            }
            System.out.println();
        }
    }
}
