package Intro;
import java.util.*;
public class Hash {


    public static void main(String[] args) {
        HashMap<Integer, String> map = new HashMap<>();

        map.put(1, "saran");
        map.put(2, "saran");

        for(HashMap.Entry<Integer , String> entry : map.entrySet()){
            System.out.println(entry.getKey() +" " + entry.getValue());
        }

//        System.out.println(map.size());
//        System.out.println(map.containsKey(1));
//        System.out.println(map.containsValue("saran"));
//        System.out.println(map.containsKey(1));
//        System.out.prinyln(map.getOrDefault);
//        System.out.println(map.isEmpty());

    }


}
