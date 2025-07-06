package Recursion35;

public class BackTracking {
    public static void main(String[] args) {
        boolean[][] maze = {
                {true,true,true},
                {true,true,true},
                {true,true,true}
        };

        allPaths("",maze,0,0);
    }

    static void allPaths(String p,boolean[][] maze,int r,int c){
        if(r==maze.length-1 && c==maze[0].length-1){
            System.out.print(p+ " ");
            return;
        }

        if(maze[r][c]==false){
            return;
        }
        // iam considering it is false
        maze[r][c] = false;

        if(r < maze.length-1){
            allPaths(p+'D' ,maze, r+1,c);
        }

        if(c < maze[0].length-1){
            allPaths(p + 'R',maze,r,c+1);
        }

        if(r>0){
            allPaths(p+'U' ,maze,r-1,c);
        }

        if(c>0){
            allPaths(p+'L',maze,r,c-1);
        }

        // this line is where the function will be over
        // so before the function gets removed, also remove the changes that were made by that function

        maze[r][c] = true;
    }


}
