public class SecondLar{
    public static void main(String[] args) {
        int[] arr = {50,90,30,40,10};

        int f = 0;
        int s = 0;

        for (int i = 0; i <arr.length ; i++) {
            if(arr[i] > f){
                s = f;
                f =arr[i];
            }else if(arr[i] > s && f != arr[i]){
                s = arr[i];
            }
        }

        System.out.println(f +" "+s);
    }
}
