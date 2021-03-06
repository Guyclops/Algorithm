﻿import java.util.Scanner;

public class Main{
    static int[][] arr;
    static int[] result;
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        arr = new int[n+1][n+1];
        result = new int[n+1];
        int[] topo = new int[n+1];
        while(in.hasNextInt()){
            int x = in.nextInt();
            int y = in.nextInt();
            arr[y][x]=1;
        }

        int k = 1;
        for(int i=1;i<=n;i++){
            int tmp = 0;
            if(result[i]==0){
                for(int j=1;j<=n;j++){
                    if(arr[i][j]==1)
                        tmp++;
                }
                if(tmp==0){
                    result[i] = 1;
                    topo[k++] = i;
                    for(int j=1;j<=n;j++){
                        if(arr[j][i]==1)
                            arr[j][i] = 0;
                    }
                    i = 1;
                }
            }
        }

        if(topo[n]!=0){
            for(int i=1;i<=n;i++){
                System.out.print(topo[i]+" ");
            }
        }else{
            System.out.println("impossible");
        }
    }
}
