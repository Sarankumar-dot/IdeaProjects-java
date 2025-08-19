package TrainingCodes;

public class ThreePalindrome {
    public static void main(String[] args) {
        String s = "aaaaabaaaaa";
        boolean found = false;

        for (int i = 1; i < s.length() - 1; i++) {
            String s1 = s.substring(0, i);
            if (isPalin(s1)) {
                for (int j = i + 1; j < s.length(); j++) {
                    String s2 = s.substring(i, j);
                    String s3 = s.substring(j);
                    if (!s2.isEmpty() && !s3.isEmpty() && isPalin(s2) && isPalin(s3)) {
                        System.out.println(s1);
                        System.out.println(s2);
                        System.out.println(s3);
                        found = true;
                        break;
                    }
                }
            }
            if (found) break;
        }

        if (!found) {
            System.out.println("Cannot be split into 3 palindromes");
        }
    }

    static boolean isPalin(String str) {
        return new StringBuilder(str).reverse().toString().equals(str);
    }
}
