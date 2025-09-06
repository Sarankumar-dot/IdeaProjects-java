public class Mac {
    public static void main(String[] args) {
        int[] arr = {33, 22, 66, 77, 11};

        int first = Integer.MIN_VALUE;
        int second = Integer.MIN_VALUE;

        for (int num : arr) {
            if (num > first) {
                second = first;   // update second
                first = num;      // update first
            } else if (num > second && num != first) {
                second = num;
            }
        }

        if (second == Integer.MIN_VALUE) {
            System.out.println("No second largest (all elements same)");
        } else {
            System.out.println("Second largest: " + second);
        }
    }
}
