public class NumberPrintRecursion1 {
    public static void main(String[] args) {
        print(1);
    }
    static void print(int n){
        // base condition
        // the base condition is used to stop the execution of recursive calls if it is not used the function will call it infinite times
        //and then stack overflow will occur
        if(n>=5){
            System.out.println(5);
            return;
        }
        /* this will print 1 2 3 4 5 */
        System.out.println(n);

        // recursive calls
        // it is called as tail recursion because it is the last function call
        print(n+1);
        //this will print 5 4 3 2 1
        //System.out.println(n);
    }
}