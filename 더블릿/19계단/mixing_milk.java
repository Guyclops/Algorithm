import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int m = in.nextInt();
        int[][] p = new int[m][2];
        int result = 0;
        for(int i=0;i<m;i++){
            p[i][0] = in.nextInt();
            p[i][1] = in.nextInt();
        }
        Arrays.sort(p, new Comparator<int[]>() {
            @Override
            public int compare(int[] o1, int[] o2) {
                return (o1[0]>o2[0])?1:-1;
            }
        });

        for(int i=0;i<m;i++){
            if(n==0)
                break;
            if(n>=p[i][1]){
                n -= p[i][1];
                result += p[i][0] * p[i][1];
            }else{
                result += n * p[i][0];
                n = 0;
            }
        }
        System.out.println(result);
    }
}
