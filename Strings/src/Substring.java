public class Substring {
    public static void main(String[] args) {
        String name = "sarann";

        int mid = name.length()/ 2;
        String result = "";
        if(name.length() %2==0){
            result = name.substring(0,mid).toLowerCase() + name.substring(mid).toUpperCase();
        }else{
            result = name.substring(0,mid).toLowerCase() + name.substring(mid).toUpperCase();

        }

        System.out.println(result);
    }
}
