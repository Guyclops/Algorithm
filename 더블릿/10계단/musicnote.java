import java.util.Scanner;

public class Main{
    static int bsearch(int[][] arr, int start, int end, int find){
        int mid = (start+end)/2;
        if(arr[mid][0]<=find&&find<=arr[mid][1]){
            return mid+1;
        }else if(arr[mid][0]>find){
            return bsearch(arr,start,mid-1,find);
        }else if(arr[mid][1]<find){
            return bsearch(arr,mid+1,end,find);
        }else{
            return 0;
        }
    }
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int q = in.nextInt();
        int[][] arr = new int[n][2];
        int count=0;
        for(int i=0;i<n;i++){
            arr[i][0] = count;
            arr[i][1] = in.nextInt()+count-1;
            count=(arr[i][1]+1);
        }
        for(int i=0;i<q;i++){
            int tmp = in.nextInt();
            System.out.println(bsearch(arr,0,n,tmp));
        }
    }
}
