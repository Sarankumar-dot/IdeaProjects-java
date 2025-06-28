public class practice {
    public static void main(String[] args) {
        boolean[][] arr = {
                {true,true,true},
                {true,false,true},
                {true,true,true}
        };

        maze1("",arr,0,0);
    }

    static void maze1(String p,boolean[][] arr,int r ,int c){
        if(r == arr.length-1 && c == arr[0].length-1){
            System.out.println(p);
            return;
        }

        if(arr[r][c] == false){
            return;
        }

        if(r<arr.length-1){
            maze1(p + 'D',arr,r+1,c);
        }

        if(c<arr[0].length-1){
            maze1(p+ 'R',arr,r,c+1);
        }
    }
}
