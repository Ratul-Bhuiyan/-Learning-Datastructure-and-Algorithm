public class NQueens {
    public static boolean canSit(char bdr[][],int row,int clm){
        for(int i=row-1;i>=0;i--){
            if(bdr[i][clm]=='Q'){
                return false;
            }
        }
        for(int i=row-1,j=clm-1;i>=0 && j>=0;i--,j--){
            if(bdr[i][j] == 'Q'){
                return false;
            }
        }
        for(int i=row-1,j=clm+1;i>=0 && j<bdr.length;i--,j++){
            if(bdr[i][j] == 'Q'){
                return false;
            }
        }
        return true;
    }
    public static void nQueens(char brd[][],int row){
        //base
        if(row == brd.length){
            printBrd(brd);
            return;
        }
        //recursion
        for(int i=0;i<brd.length;i++){
            if(canSit(brd,row,i)){
                brd[row][i] = 'Q';
                nQueens(brd,row+1);
                brd[row][i] = 'X';
            }
        }
    }
    public static void printBrd(char brd[][]){
        System.out.println("--------new board---------");
        for(int i=0;i<brd.length;i++){
            for(int j=0;j<brd.length;j++){
                System.out.print(brd[i][j]);
            } System.out.println();
        }
    }
    public static void main(String args[]){
        int n = 4;
        char board[][] = new char[n][n];
        for(int i=0;i<board.length;i++){
            for(int j=0;j<board.length;j++){
                board[i][j] = 'X';
            }
        }
        nQueens(board,0);
    }
}
