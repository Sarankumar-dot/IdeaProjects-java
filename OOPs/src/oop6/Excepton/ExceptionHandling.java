package oop6.Excepton;

public class ExceptionHandling {
    //there are two types of exception
    // 1. checked exception - are exception which occurs at compile time eg - file not found exception
    // 2. unchecked - are exception occurs at runtime eg - divide  by zero

    public static void main(String[] args) {
        int a = 5;
        int b = 0;


        try{
            sum(a,b);
        } catch(ArithmeticException e) { // so more strict rules should come above [read the next cmt*****]
            System.out.println(e.getMessage());
        } catch (Exception e) { // here exception class contains every single exception if you want to add some important exceptions you can add it in the above with another catch block
            System.out.println("this finds all the exceptions");
        }finally{
            System.out.println("no matter what will happen this will always execute " +
                    "and you can contain only one finally block");
        }

    }

    static int sum(int a , int b) throws ArithmeticException{
        if(b== 0){
            throw  new ArithmeticException("do not divide by zero");
        }

        return a+b;
    }
}
