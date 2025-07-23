package oop7.Enums;

public class Basic {

    enum Week implements Inter{
        monday , tuesday , wednesday , thursday , friday , saturday;

        Week() {
            System.out.println("constructor called for "+this);
        }
        // these are enums
        // every single one over here is public , static , final
        // since its final you cannot create child enums
        // type is week[reference variable name]

        // internally this works as public static final Week Monday = new Monday();

        // enum can implement as many interface it wants
        @Override
        public void print(){
            System.out.println("this is running");
        }
    }


    public static void main(String[] args) {
        Week week;
        week = Week.monday;

        Week weeek  = Week.saturday;
        System.out.println(weeek);

        week.print();

//        System.out.println(week);

//        for(Week day : Week.values()){
//            System.out.println(day);
//        }

      //  System.out.println(week.ordinal()); // gives 0 because monday index is 0
        // ordinal is used to give the position of the value stored in the enum Week
    }
}
