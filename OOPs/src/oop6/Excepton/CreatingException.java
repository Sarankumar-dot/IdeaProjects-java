package oop6.Excepton;

public class CreatingException extends  Exception{
    public CreatingException(String name){
        super(name);
    }

    public static void main(String[] args) throws CreatingException {
        String name = "sara";

        if(!name.equals("saran")){
            throw new CreatingException("this is my exception name is not equals");
        }

        System.out.println( );
    }
}
