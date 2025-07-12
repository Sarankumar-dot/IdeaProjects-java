package oop6.Generics;

import java.util.Arrays;

// if we use wildcards then we can restrict what data type can be used
// use CustomGenericArrayList<T extends Number> or you can use integer also
public class CustomGenericArrayList<T extends Integer> {
    private Object[] arr;
    private static int  DEFAULT_SIZE = 10;
    private  int size = 0;

    public CustomGenericArrayList(){

        arr = new Object[DEFAULT_SIZE];
    }
    // we are creating an add method
    public void add(T n){
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
        Object[] temp = new Object[2*arr.length];

        for (int i = 0; i < arr.length; i++) {
            temp[i] = arr[i];
        }
        arr = temp;
    }


    public T remove(){
        T removed =(T) (arr[--size ]) ;

        return removed;
    }

    public T get(int n){
        return (T) arr[n];
    }

    public void set(int i , T value){
        arr[i] = value;
    }

    public int size(){
        return arr.length;
    }



    @Override
    public String toString() {
        return "CustomArrayList{" +
                "arr=" + Arrays.toString(arr) +
                ", size=" + size +
                '}';
    }

    public static void main(String[] args) {
        // the probelem we are facing here is the arraylist internally contains only integer values so you cannot store stings and other characters
        // for this we are going to use generics
        // we have used generics to add any type of values in our custom arraylist

        CustomGenericArrayList<Integer> list = new CustomGenericArrayList<>();
        list.add(10);
        System.out.println(list.get(0));

        System.out.println(list.size);

        for (int i = 0; i <=133 ; i++) {
             list.add(i);
        }

        System.out.println(list);




      
    }





}
