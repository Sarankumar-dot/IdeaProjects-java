public class largestamongthreenumbers {
    public static void main(String[] args) {
        int a =115;
        int b =2225;
        int c =335;

        int largest = a>b ? a:b;
        largest = c>largest ? c:largest;

        System.out.println(largest);
    }
}
