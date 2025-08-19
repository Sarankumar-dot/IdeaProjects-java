package Saran.StackQueue.Stsck;

public class CustomStack {
    protected int[] data;
    private static final int DEFAULT_SIZE = 10;

    int index = -1;


    // WHEN THE SIZE IS NOT PASSED THEN IT USES THIS
    public CustomStack(){
        // this.data = new int[DEFAULT_SIZE]; ANOTHER WAY IS USING THE BELOW CONSTRUCTOR
        this(DEFAULT_SIZE);
    }

    // IF THE SIZE IS PASSED THEN IT USES THIS
    public CustomStack(int size) {
        this.data = new int[size];
    }

    public boolean push(int val){
        if(isFull()){
            System.out.println("Stack Overflow!!");
            return false;
        }
        this.data[++index] = val;
        return true;
    }

    public int pop() throws Exception{
        if(isEmpty()){
           throw new Exception("CANNOT POP");
        }
        int removed = data[index];
        index--;
        return removed;
    }

    public int peek() throws Exception{
        if(isEmpty()){
            throw new Exception("nO ELEMENT TO PEEK");
        }

        return data[index];
    }

    public void display(){
        for (int i = 0; i <= index; i++) {
            System.out.print(data[i]+" ");
        }
        System.out.println();
    }

    public boolean isFull(){
        return index == data.length-1;
    }

    public boolean isEmpty(){
        return index == -1;
    }
}
