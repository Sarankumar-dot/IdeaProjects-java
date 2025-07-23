package oop6.Excepton;

public class CreatingException extends  Exception{
    public CreatingException(String name){
        super(name);
    }

    public static void main(String[] args) throws CreatingException {
        String name = "sarn";

        if(!name.equals("saran")){
            throw new CreatingException("this is my exception name is not equals");
        }else{
            System.out.println("u are good to go ");
        }

        System.out.println( );
    }
}
