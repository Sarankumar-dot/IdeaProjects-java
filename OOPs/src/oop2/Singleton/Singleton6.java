package oop2.Singleton;

public class Singleton6 {
    String name;

    // sometime you have a class and you only want to create only one object, use private while creating a constructor

    private static Singleton6 instance;
    
    // by using a private keyword you can create a singleton class
     private Singleton6(){

    }
    
    public static Singleton6 getInstance(){
         if(instance == null){
             instance = new Singleton6();
         }

         return instance;
    }
}
