package Intro;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class FreqOfChar {
    public static void main(String[] args) {
        String s = "geeksforgeeks";
        System.out.println(freq(s));
        System.out.println(nonRepeating(s));

    }

    static String freq(String s){
        LinkedHashMap<Character,Integer> map = new LinkedHashMap<>();

        StringBuilder sb = new StringBuilder();
        for(char ch : s.toCharArray()){
            map.put(ch,map.getOrDefault(ch,0)+1);
        }

        for(Map.Entry<Character,Integer> entry : map.entrySet()){
            String key = String.valueOf(entry.getKey());
            String value = String.valueOf(entry.getValue());
            sb.append(key);
            sb.append(value);
        }

        return sb.toString();
    }

    static ArrayList<Character> nonRepeating(String s){
        LinkedHashMap<Character,Integer> map = new LinkedHashMap<>();

        ArrayList<Character> list = new ArrayList<>();
        for(char ch : s.toCharArray()){
            map.put(ch,map.getOrDefault(ch,0)+1);
        }

        for(Map.Entry<Character,Integer> entry : map.entrySet()){
            if(entry.getValue() == 1){
                list.add(entry.getKey());
            }
        }

        return list;

    }


}
