import java.util.ArrayList;

public class Dice34 {
    public static void main(String[] args) {
        System.out.println(diceRET("",4));
        dice("",3);
    }

    static void dice(String p,int target){
        if(target ==0){
            System.out.print(p+ " ");
            return;
        }

        for (int i = 1; i <=6 && i<=target ; i++) {
            dice(p+i,target-i);
        }
    }

    // adding in arraylist

    static ArrayList<String> diceRET(String p, int target){
        if(target ==0){
            ArrayList<String> list = new ArrayList<>();
            list.add(p);
            return list;
        }
        ArrayList<String> list = new ArrayList<>();
        for (int i = 1; i <=6 && i<=target ; i++) {
            list.addAll(diceRET(p+i,target-i));
        }

        return list;
    }
}
