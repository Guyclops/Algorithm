import java.util.Scanner;

public class Main{
    static int[][] arr;
    static int pink = 0;
    static int white = 0;
    static void color(int n, int x1, int y1, int x2, int y2){
        int w = 0;
        int p = 0;

        for(int i=x1;i<x2;i++){
            for(int j=y1;j<y2;j++){
                if(arr[i][j]==1)
                   p++;
                else
                    w++;
            }
        }
        if(w==(n*n)){
            white++;
        }else if(p==(n*n)){
            pink++;
        }else{
            color(n/2,x1,y1,(x2+x1)/2,(y2+y1)/2);
            color(n/2,x1,(y2+y1)/2,(x2+x1)/2,y2);
            color(n/2,(x2+x1)/2,y1,x2,(y2+y1)/2);
            color(n/2,(x2+x1)/2,(y2+y1)/2,x2,y2);
        }
    }
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        arr = new int[n][n];
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                arr[i][j] = in.nextInt();
            }
        }
        color(n,0,0, n , n);
        System.out.println(white);
        System.out.println(pink);
    }
}
