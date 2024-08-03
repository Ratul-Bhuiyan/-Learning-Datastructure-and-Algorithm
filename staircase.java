import java.util.*;
public class staircase {
    
    public static void search(int arr[][], int key){
        int row = arr.length-1;
        int clm = 0;

        while(row >=0 && clm <= arr[0].length-1){
            if(arr[row][clm] == key){
                 System.out.println("Row is" + row + " " + "Collam is" + clm );
                 break;
            }
            else if(key > arr[row][clm]){
                clm++;
            }
            else if(key < arr[row][clm]){
                row--;
            }
        }
    }
    
    public static void main(String args[]) {
        int array[][] = {{1,2,3,4},{5,6,7,8},{9,10,11,12},{13,14,15,16}};
        Scanner sc = new Scanner(System.in);
        int key = sc.nextInt();
        search(array,key);
         sc.close();
    }
}

