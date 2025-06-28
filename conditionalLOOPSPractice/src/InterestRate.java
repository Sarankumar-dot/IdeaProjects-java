public class InterestRate {
    public static void main(String[] args) {
        float ans = interest(10000,50,3);
        System.out.println(ans);

    }

    static float interest(int principle,float interestrate,int timePeriod){
        interestrate = interestrate /100;
        float interest = principle * interestrate *timePeriod;

        return interest;
    }

}
