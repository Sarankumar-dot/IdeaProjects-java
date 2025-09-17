package TicTacToe;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        char[][] arr = {
                {' ',' ',' '},
                {' ',' ',' '},
                {' ',' ',' '}
        };

        char player = 'X';
        boolean isOver = false;

        while(!isOver){   // FIXED
            print(arr);

            System.out.println("Player " + player + ", enter row and column (0-2):");
            int row = sc.nextInt();
            int col = sc.nextInt();

            if(row < 0 || row > 2 || col < 0 || col > 2 || arr[row][col] != ' '){
                System.out.println("Invalid move, try again!");
                continue;
            }

            arr[row][col] = player;
            isOver = over(arr,player);

            if(isOver){
                print(arr);
                System.out.println("Player " + player + " wins!");
            } else if(isBoardFull(arr)) {
                print(arr);
                System.out.println("It's a draw!");
                break;
            } else {
                // Switch player
                player = (player == 'X') ? 'O' : 'X';
            }
        }
    }

    // Check win condition
    static boolean over(char[][] board , char player){
        // Check rows
        for(int i=0;i<3;i++){
            if(board[i][0]==player && board[i][1]==player && board[i][2]==player)
                return true;
        }

        // Check cols
        for(int j=0;j<3;j++){
            if(board[0][j]==player && board[1][j]==player && board[2][j]==player)
                return true;
        }

        // Check diagonals
        if(board[0][0]==player && board[1][1]==player && board[2][2]==player) return true;
        if(board[0][2]==player && board[1][1]==player && board[2][0]==player) return true;

        return false;
    }

    // Check if board is full
    static boolean isBoardFull(char[][] board){
        for(int i=0;i<3;i++){
            for(int j=0;j<3;j++){
                if(board[i][j]==' ') return false;
            }
        }
        return true;
    }

    // Print board
    static void print(char[][] board){
        for(int i=0;i<3;i++){
            for(int j=0;j<3;j++){
                System.out.print(board[i][j]);
                if(j<2) System.out.print(" | ");
            }
            System.out.println();
            if(i<2) System.out.println("---------");
        }
    }
}
