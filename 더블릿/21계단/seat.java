import java.util.Scanner;

public class Main{

    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int m = in.nextInt();
        int[] arr = new int[n+1];
        arr[0] = 1;
        arr[1] = 1;
        arr[2] = 2;
        for(int i=3;i<=n;i++){
            arr[i] = arr[i-1] + arr[i-2];
        }
        int sub = 0;
        int result = 1;
        for(int i=0;i<m;i++){
            int tmp = in.nextInt();
            result *= arr[tmp-sub-1];
            sub = tmp;
        }
        result *= arr[n-sub];
        System.out.println(result);
    }
}
