public class AtoZwithStringbuilder {
    public static void main(String[] args) {
        StringBuilder series = new StringBuilder();

        for(int i= 0;i<26;i++){
            char ch = (char) ('a'+i);
            series.append(ch).append(" ");
        }
        System.out.println(series);
       // series.deleteCharAt(0);
        //System.out.println(series);

        StringBuilder name = new StringBuilder("Saran");

        name.reverse();
        System.out.println(name);

    }
}
