public class basicShorting {
    public static void bubleShort(int ar[]){
        for(int i = 0;i<ar.length-1;i++){
            for(int j = 0;j<ar.length-1-i;j++){
                int meaw = 0;
            if(ar[j]>ar[j+1]){
                 meaw = ar[j];
                ar[j] = ar[j+1];
                ar[j+1] = meaw;
            }
        }
     }
    }
    public static void printAr(int ar[]){
        for(int i=0;i<ar.length;i++){
            System.out.println(ar[i]);
        }
    }  
    public static void main(String args[]){
        int array[] = {4,3,5,2,1};
        bubleShort(array);
        printAr(array);
    }
}
