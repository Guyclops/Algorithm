import java.util.Scanner;
 
public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int step = in.nextInt();
        int[] arr = new int[n];
        for(int i=0;i<n;i++){
            arr[i] = in.nextInt();
        }
         
        for(int i=0;i<step;i++){
            for(int j=0;j<n-1;j++){
                if(arr[j]>arr[j+1]){
                    int tmp=arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = tmp;
                }
            }
        }
         
        for(int i=0;i<n;i++){
            System.out.print(arr[i]+" ");
        }
    }
}