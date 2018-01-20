import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[][] arr = new int[n][n];
        int[] visit = new int[n];
        int[] vertex = new int[n];
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                arr[i][j] = in.nextInt();
            }
            vertex[i] = 100001;
        }

        int k = 0;
        int m = 0;
        visit[0] = 1;
        vertex[0] = 0;
        for(int i=0;i<n;i++){
            int min = 100001;
            for(int j=0;j<n;j++){
                if(k == j)
                    continue;
                if(arr[k][j]>0&&vertex[j]>arr[k][j]&&visit[j]==0){
                    vertex[j] = arr[k][j];
                }
                if(min>vertex[j]&&visit[j]==0){
                    min = vertex[j];
                    m = j;
                }
            }
            k = m;
            visit[m]=1;
        }
        int result = 0;
        for(int i=0;i<n;i++){
            result += vertex[i];
        }
        System.out.println(result);
    }
}
