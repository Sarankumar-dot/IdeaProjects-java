public class AstrologyNum {
    public static void main(String[] args) {
        int m = 7654;
        int n = 7654;
        int sum  = 0;
        while(n > 0){
            int last = n %10;
            sum +=last;
            n = n /10;
        }
        System.out.println("sum of digits :" +sum);

        int numerology = sum;
        while(numerology > 9) {
            int ans = 0;

            while (numerology > 0) {
                int last = numerology % 10;
                ans += last;
                numerology = numerology / 10;
            }
            numerology = ans;
        }

        System.out.println(numerology);

        int odd = 0;
        int even = 0;

        while(m > 0){
            int last = m % 10;

            if((last & 1) == 1){
                odd++;
            }else{
                even++;
            }
            m = m /10;
        }

        System.out.println("odd: " + odd + " even: " + even);



    }
}
