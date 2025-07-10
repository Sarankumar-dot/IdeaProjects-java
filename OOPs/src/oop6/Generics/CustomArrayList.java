package oop6.Generics;

import java.util.ArrayList;
import java.util.Arrays;

public class CustomArrayList {
    private int[] arr;
    private static int  DEFAULT_SIZE = 10;
    private  int size = 0;

    public CustomArrayList(){
        arr = new int[DEFAULT_SIZE];
    }
    // we are creating an add method
    public void add(int n){
        if(isFull()){
            resize();
        }

        arr[size++] = n;
    }

    boolean isFull(){
        if(size == arr.length){
            return true;
        }

        return false;
    }

    private void resize(){
        int[] temp = new int[2*arr.length];

        for (int i = 0; i < arr.length; i++) {
            temp[i] = arr[i];
        }
        arr = temp;
    }


    public int remove(){
        int removed = arr[size--];

        return removed;
    }

    public int get(int n){
        return arr[n];
    }

    public void set(int i , int value){
        arr[i] = value;
    }

    public boolean contains(int n){
        for (int i = 0; i <arr.length ; i++) {
            if(arr[i] == n){
                return true;
            }
        }
        return false;
    }

    @Override
    public String toString() {
        return "CustomArrayList{" +
                "arr=" + Arrays.toString(arr) +
                ", size=" + size +
                '}';
    }

    public static void main(String[] args) {
        CustomArrayList list = new CustomArrayList();

        list.add(2);
        list.add(1);
        list.add(5);

        System.out.println(list);

        System.out.println(list.get(2));

        System.out.println(list.contains(10));

      
    }

    // the probelem we are facing here is the arraylist internally contains only integer values so you cannot store stings and other characters
    // for this we are going to use generics



}
