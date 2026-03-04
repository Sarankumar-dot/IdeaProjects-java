package TwoPointers;

public class pascalTriangle {
    public static void main(String[] args) {
        int row = 5;
        int col = 5;
        System.out.println(pascal1(row-1,col-1));
    }

    static int pascal1(int row,int col){
        int res = 1;

        for (int i = 0; i <col ; i++) {
            res = res * (row -i);
            res = res / (i+1);
        }
        return res;
    }
}








