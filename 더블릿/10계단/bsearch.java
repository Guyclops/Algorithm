import java.io.IOException;
import java.util.Scanner;

public class Main{
    static boolean check=false;
    static int result;
    static void bsearch(int[] arr, int start, int end, int findNum)
    {
        if(start>=end)
            return;
        int mid = (start+end)/2;
        if(arr[mid]==findNum){
            check=true;
            result = mid;
            return;
        }else if(arr[mid]>findNum){
            bsearch(arr,start,mid,findNum);
            return;
        }else{
            bsearch(arr,mid+1,end,findNum);
            return;
        }
    }
    public static void main(String[] args) throws IOException {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] arr = new int[n];
        for(int i=0;i<n;i++){
            arr[i] = in.nextInt();
        }
        int findNum = in.nextInt();
        bsearch(arr,0,arr.length,findNum);
        if(check){
            System.out.println(result+1);
        }else{
            System.out.println("not found");
        }
    }
}
