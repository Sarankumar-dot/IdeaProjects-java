public class Vowels {
    public static void main(String[] args) {
        String word = "saran";

        String vowel = "aeiouAEIOU";
//        String cha = word.charAt(1)+"";
//        System.out.println(vowel.contains(cha));

        int vow = 0;
        int cons = 0;
        for (int i = 0; i <word.length() ; i++) {
            String ch = word.charAt(i)+"";
            if(vowel.contains(ch)){
                vow++;
            }else{
                cons++;
            }
        }

        System.out.println(vow +" "+ cons);
    }
}
