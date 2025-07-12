package BinarySearch;

public class SmallestLetterBS3 {
    public static void main(String[] args) {
        char[] arr = {'c','d','e'};
        char target = 'c';

        char ans = SmallestLetterBS3(arr,target);
        System.out.println(ans);
    }
    // smallest letter greater than target

    static char SmallestLetterBS3(char[] letters, char target){
        int start = 0;
        int end = letters.length -1;

        while(start<=end){
            int mid = start + (end - start)/2;

            if(target<letters[mid]){
                end = mid-1;
            }else{
                start = mid+1;
            }

        }return letters[start % letters.length];

    }
}
