import java.util.*;
public class Maze {
    public static void main(String[] args) {
//        System.out.println(maze(4,4));

//        ArrayList<String> ans = mazePathList("",3,3);
//        System.out.println(ans);

//        System.out.println(mazeDiagonals(3,3));


//
//        ArrayList<String> ans = mazePathListDiagonal("",2,2);
//        System.out.println(ans);

       boolean[][] maze = {
               {true,true,true},
               {true,false,true},
               {true,true,true}
     };
        mazePathObstacles("",maze,0,0);

//        ArrayList<String> ans = mazePathObstaclesRET("",maze,0,0);
//        System.out.println(ans);


    }

    static int maze(int r , int c){
        if(r==1 || c ==1){
            return 1;
        }

        int down = maze(r-1,c);
        int right = maze(r,c-1);

        return down+ right;
    }

    // print all paths of the maze
    static void mazePath(String p,int r,int c){
        if(r==1 && c==1){
            System.out.print(p+ " ");
            return;
        }

        if(r > 1){
            mazePath(p+'D' , r-1,c);
        }

        if(c > 1){
            mazePath(p + 'R',r,c-1);
        }
    }

    static ArrayList<String> mazePathList(String p,int r,int c){
        if(r==1 && c==1){
           ArrayList<String> list = new ArrayList<>();
           list.add(p);
           return list;
        }

        ArrayList<String> list = new ArrayList<>();
        if(r > 1){
            list.addAll(mazePathList(p+'D' , r-1,c));
        }

        if(c > 1){
            list.addAll(mazePathList(p + 'R',r,c-1));
        }

        return list;
    }

    // just count of paths also includes diagonal
    static int mazeDiagonals(int r , int c) {
        if (r == 1 || c == 1) {
            return 1;
        }

        int down = mazeDiagonals(r - 1, c);
        int right = mazeDiagonals(r, c - 1);
        int diagonal = 0;
        if (r > 1 && c > 1) {
            diagonal = mazeDiagonals(r - 1, c - 1);
        }
        return down + right + diagonal;
    }

    static ArrayList<String> mazePathListDiagonal(String p,int r,int c){
        if(r==1 && c==1){
            ArrayList<String> list = new ArrayList<>();
            list.add(p);
            return list;
        }

        ArrayList<String> list = new ArrayList<>();

        if(r>1 && c>1){
            list.addAll(mazePathListDiagonal(p+'D',r-1,c-1)); // d stands for diagonal
        }
        if(r > 1){
            list.addAll(mazePathListDiagonal(p+'V' , r-1,c)); // v stands for vertical
        }

        if(c > 1){
            list.addAll(mazePathListDiagonal(p + 'H',r,c-1)); // h stands for horizontal
        }

        return list;
    }

    // maze with obstacles
    static void mazePathObstacles(String p,boolean[][] maze,int r,int c){
        if(r==maze.length-1 && c==maze[0].length-1){
            System.out.print(p+ " ");
            return;
        }

        if(maze[r][c]==false){
            return;
        }

        if(r < maze.length-1){
            mazePathObstacles(p+'D' ,maze, r+1,c);
        }

        if(c < maze[0].length-1){
            mazePathObstacles(p + 'R',maze,r,c+1);
        }
    }

    //storing these in arraylist
    static ArrayList<String> mazePathObstaclesRET(String p,boolean[][] maze,int r,int c){
        if(r==maze.length-1 && c==maze[0].length-1){
            ArrayList<String> list = new ArrayList<>();
            list.add(p);
            return list;
        }
        ArrayList<String> list = new ArrayList<>();
        if(maze[r][c]==false){
            return list;
        }

        if(r < maze.length-1){
            list.addAll(mazePathObstaclesRET(p+'D' ,maze, r+1,c));
        }

        if(c < maze[0].length-1){
            list.addAll(mazePathObstaclesRET(p + 'R',maze,r,c+1));
        }

        return list;
    }

}