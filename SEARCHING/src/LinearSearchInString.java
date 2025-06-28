public class LinearSearchInString {
    public static void main(String[] args) {
        String name = "saran";
        char target = 'k';
        System.out.println(searchinstr(name,target));
    }

    static boolean searchinstr(String str, char target) {
        if(str.length()==0){
            return false;
        }

        for (int i = 0; i < str.length(); i++) {
            if(target==str.charAt(i)){
                return true;

            }
        }return false;

    }
}
