package introduction1;

public class WrapperExamples {
    public static void main(String[] args) {
        // for creating a variable of integer you can use
        Integer a = 45; // by using this you cannot access the functions of integer using . operator
        Integer b=35;
        // you can also use
        Integer num = 45;// by using this you can access the functions of integer using . operator
        System.out.println(num.compareTo(a));

        // swap func
        swap(a,b);
        System.out.println(a+"  "+ b); // the values will be not swapped because there is no pass by reference in java for primitives there is only pass by value
        // by using wrapper classes we still not able to swap because Integer is a final class so we cannot change it

        // final keyword
        // by using final keyword you cannot change the value of the variable
        final int INCREASE = 2;
        // INCREASE = 3; // IT gives you an error because it is declared as final

        // making an object as final

        final New saran = new New("karthi");
        // after making an obj you can change the values by using objnames in final
        saran.name="saran";
        // but if you create another object using the above obj
        // saran = new New("new object"); you cant do it
        System.out.println(saran.name);
    }

    static void swap(Integer a , Integer b){
        Integer temp = a;
        a=b;
        b=temp;
    }

}

class New{
    // final int num;  always a final keyword should be initialized as the below one
    final int num = 10;// always inititalize while declaring it...

    String name;

    New(String name){
        this.name = name;
    }
}
