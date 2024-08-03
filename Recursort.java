public class Recursort {
    public static void margeAr(int arr[],int st,int end){
        if(st>=end){
            return;
        }
        int mid = st + (end-st)/2;
        margeAr(arr,st,mid);
        margeAr(arr,mid+1,end);
        marge(arr,st,mid,end);
    }
    public static void marge(int arr[],int st, int mid,int end){
        int i = st;
        int j = mid+1;
        int k = 0;
        int temp[] = new int[end-st+1];
        while(i<=mid && end>=j){
            if(arr[i]>arr[j]){
                temp[k] = arr[j];
                j++;
            } else {
                temp[k] = arr[i];
                i++;
            }
            k++;
        }
        while(i<=mid){
            temp[k] = arr[i];
            i++;
            k++;
        }
        while(end>=j){
            temp[k] = arr[j];
            j++;
            k++;
        }
        for(i=st,k=0;i<=end;i++,k++){
            arr[i] = temp[k];
        }
    }
    public static void printAr(int arr[]){
        for(int i = 0;i<arr.length;i++){
            System.out.print(arr[i]);
        }
        System.out.println();
    }
    public static void main(String args[]){
        int array[] = {2,4,1,6,3,8,7,5};
        margeAr(array,0,array.length-1);
        printAr(array);
    }
}
