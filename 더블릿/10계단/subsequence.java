import java.util.Scanner;

public class Main{

    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int s = in.nextInt();
        int[] arr = new int[n+1];
        int[] sub = new int[n+1];
        for(int i=1;i<=n;i++){
            arr[i] = in.nextInt();
            sub[i] = arr[i];
        }
        for(int i=2;i<=n;i++){
            int max = 0;
            int[] next = new int[n+1];
            for(int j=i;j<=n;j++){
                next[j] = sub[j-1] + arr[j];
                if(max < next[j])
                    max = next[j];
                if(max >= s){
                    System.out.println(i);
                    return;
                }
            }
            if(i==n){
                if(max < s)
                    System.out.println(0);
                break;
            }
            sub = next;
        }
    }
}
