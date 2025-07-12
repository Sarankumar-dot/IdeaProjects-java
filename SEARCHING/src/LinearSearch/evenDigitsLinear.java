package LinearSearch;

public class evenDigitsLinear {

    public static void main(String[] args) {
        int[] arr = {1,33,4445,555,6633};
        System.out.println(findnumber(arr));



    }

    static int findnumber(int[] nums){
        int count = 0;

        for(int i: nums){
            if(even(i)) {
                count++;
            }

        }return count;

    }
//method to find the no of digits is even
    static boolean even(int num){
        int numberofDigits = digits(num);
        if(numberofDigits %2 ==0){
            return true;
        }
        return false;
    }

//method to find number of digits in aumber
    static int digits(int num){
        int count = 0;
        while(num>0){
            count++;
            num = num/10;
        }return count;
    }


}
