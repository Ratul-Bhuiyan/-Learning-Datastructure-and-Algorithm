public class QuickSort {
    public static int piviot(int st,int end,int arr[]){
        int i = st;
        int j = end;
        int piviot = arr[st];
        while(j>i){
        do{
            i++;
        }while(arr[i]<=piviot);
        do{
            j--;
        }while(arr[j]>piviot);
        if(j>i){
            int temp = arr[j];
            arr[j] = arr[i];
            arr[i] = temp;
        }
    }
    int temp = arr[st];
     arr[st] = arr[j];
     arr[j] = temp;
     return j;
    }
    public static void quickSort(int arr[],int si,int ei){
    if(si >= ei){
        return;
    }
        int mid = piviot(si,ei,arr);
        quickSort(arr,si,mid);
        quickSort(arr,mid+1,ei);
    }
    public static void printArray(int arr[]){
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]);
        }
        System.out.println();
    }
    public static void main(String args[]){
        int array[] = {4,2,6,5,3,1,7,8};
        quickSort(array,0,array.length-1);
        printArray(array);
    }
}
