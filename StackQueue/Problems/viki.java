package Saran.StackQueue.Problems;

public class viki {
    public static void main(String[] args){
        String s = "saran";
int n = s.length();
        for (int i = 1; i <= s.length() ; i++) {
            for (int j = 1; j <=s.length() ; j++) {
                if(i == j){
                    System.out.print(s.charAt(i));
                } else if (j == n-i+1) {
                    System.out.print(s.charAt(n-i));
                }else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}
