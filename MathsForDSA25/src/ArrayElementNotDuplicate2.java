public class ArrayElementNotDuplicate2 {
    public static void main(String[] args) {
        int[] arr = {2,3,4,1,2,1,3,6,6,10,4};
        System.out.println(unique(arr));
    }

    static int unique(int[] arr){
        int unique = 0;
        for (int j : arr) {
            unique = unique ^ j;
        }

        return unique;
    }
}
