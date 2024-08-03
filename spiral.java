public class spiral {
    public static void sprl(int ar[][]){
        int stClm = 0;
        int endClm = ar[0].length-1;
        int stRow = 0;
        int endRow = ar.length-1;
        while(stClm<=endClm && stRow<=endRow){
            for(int i= stClm;i<=endClm;i++){
                System.out.print(ar[stRow][i] + " ");
            }
            for(int j= stRow+1;j<=endRow;j++){
                System.out.print(ar[j][endClm] + " ");
            }
            for(int k= endClm-1;k>=stClm;k--){
                if(stRow==endRow){
                    break;
                } 
                System.out.print(ar[endRow][k] + " ");
            }
            for(int l= endRow-1;l>=stRow+1;l--){
                 if(stClm==endClm){
                    break;
                } 
                System.out.print(ar[l][stClm] + " ");
            }
            stClm++;
            stRow++;
            endClm--;
            endRow--;


        }

    }
    public static void main(String args[]) {
        int array[][] = {{1,2,3,4},{5,6,7,8},{9,10,11,12},{13,14,15,16}};
        sprl(array);
    }
}
