package Recursion35;

import java.util.Arrays;

public class PrintMatrixAndPAth {
    public static void main(String[] args) {
        boolean[][] maze = {
                {true,true,true},
                {true,true,true},
                {true,true,true}
        };

        int[][] path = new int[maze.length][maze[0].length];

        allPathsMatrix("",maze,0,0,path,1);
    }

    static void allPathsMatrix(String p,boolean[][] maze,int r,int c,int[][] path,int step){
        if(r==maze.length-1 && c==maze[0].length-1){
            path[r][c] = step;
            for(int[] arr: path){
                System.out.println(Arrays.toString(arr));
            }
            System.out.print(p+ " ");
            System.out.println();
            return;
        }

        if(maze[r][c]==false){
            return;
        }
        // iam considering it is false
        maze[r][c] = false;
        path[r][c] = step;

        if(r < maze.length-1){
            allPathsMatrix(p+'D' ,maze, r+1,c,path,step+1);
        }

        if(c < maze[0].length-1){
            allPathsMatrix(p + 'R',maze,r,c+1,path,step+1);
        }

        if(r>0){
            allPathsMatrix(p+'U' ,maze,r-1,c,path,step+1);
        }

        if(c>0){
            allPathsMatrix(p+'L',maze,r,c-1,path,step+1);
        }

        // this line is where the function will be over
        // so before the function gets removed, also remove the changes that were made by that function

        maze[r][c] = true;
        path[r][c]= 0;
    }
}
