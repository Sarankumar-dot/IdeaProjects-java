package Intro;

import java.util.HashMap;

public class HashMa {
    public static void main(String[] args) {
        HashMap<String,Integer> map = new HashMap<>();

        map.put("saran" ,88);
        map.put("rahul" ,77);
        map.put("kunal" ,99);

        System.out.println(map.size());
        System.out.println(map.get("saran"));
        System.out.println(map.values());  // [88, 77, 99] prints values

        System.out.println(map.keySet()); // return keys

        System.out.println(map.entrySet()); // returns both keys and values

        System.out.println(map.getOrDefault("karthi" ,99));

        System.out.println(map.containsKey("saran"));
        System.out.println(map.containsValue(99));

        map.put("saran",map.get("saran")+1); // to change existing values in hashmap

        map.replace("saran",map.get("saran"),map.get("saran") +19);

        // or else you can also use

        map.replace("saran",map.get("saran") +10);

        System.out.println(map.entrySet());

    }
}
