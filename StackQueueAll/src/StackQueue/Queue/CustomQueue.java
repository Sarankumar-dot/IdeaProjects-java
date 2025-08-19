package Saran.StackQueue.Queue;

public class CustomQueue {
    protected int[] data;
    private static final int DEFAULT_SIZE = 10;
     int end = 0;

    public CustomQueue(){
        this(DEFAULT_SIZE);
    }

    public CustomQueue(int size){
        this.data = new int[size];
    }

    public boolean push(int n){
        if(isFull()){
            System.out.println("queue is full");
            return false;
        }

        data[end] = n;
        end++;
        return true;
    }

    // o(n)time comp for removing an item it is not that much great
    // o(1) for add an element
    public boolean pop(){
        if(isEmpty()){
            System.out.println("No elements available");
            return false;
        }

        for (int i = 1; i <end ; i++) {
            data[i-1] = data[i];
        }
        end--;
        return true;
    }

    public int front() throws Exception{
        if(isEmpty()){
            throw new Exception("empty");

        }

        return data[0];
    }

    public void display(){
        for (int i = 0; i <end ; i++) {
            System.out.print(data[i] +" ");
        }
        System.out.println();
    }

    public boolean isFull(){
        return end == data.length;
    }

    public boolean isEmpty(){
        return end ==0;
    }
}
