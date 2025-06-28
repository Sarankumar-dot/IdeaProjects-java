public class Nto0 {
    public static void main(String[] args) {
        zero(5);
        System.out.println();
        //zeroton(5);

    }

    static void zero(int n){
        if(n==0){
            return;
        }

        System.out.println(n);// this will print the  numbers before the func ends so
        //the output will be 5 4 3 2 1
        zero(n-1);

    }
    static void zeroton(int n){
        if(n==0){
            return;
        }
        zeroton(n-1);
        // this will print the  numbers after the func ends so
        //the output will be 1 2 3 4 5
        System.out.println(n);

    }

}
