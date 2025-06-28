public class noofdigitsd {

    public static void main(String[] args) {
        int number =123452233;

        int count = 0;
        while(number>0){
            int digit = number%10;
            count++;
            number = number/10;
        }

        System.out.println(count);
    }
}
