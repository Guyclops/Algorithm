import java.io.IOException;
public class Main{
    public static void qsort(int[] arr, int start, int end){
        if(start>=end)
            return;
        int pivot = arr[start];
        int j = start;
        int tmp = 0;
        for(int i=j+1; i<end; i++){
            if(arr[i]<pivot){
                tmp = arr[i];
                arr[i] = arr[j+1];
                arr[j+1] = tmp;
                j++;
            }
        }
        tmp = arr[j];
        arr[j] = arr[start];
        arr[start] = tmp;
        qsort(arr,start,j);
        qsort(arr,j+1,end);
    }
    public static void main(String[] args) throws IOException {
        int[] arr = {5,4,3,2,1};
        qsort(arr,0,arr.length);
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }
}
