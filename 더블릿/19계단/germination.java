import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int n = 5;
        int[][] arr = new int[n][2];
        String[] flower = {"Poppy","Carnation","Sunflower","Daisy","Pansy"};
        int[] flowercheck = new int[n];
        int[] input = new int[n];
        int[] check = new int[n];
        String[] result = new String[n];
        for(int i=0;i<n;i++){
            arr[i][0] = in.nextInt();
            arr[i][1] = in.nextInt();
        }
        for(int i=0;i<n;i++){
            input[i] = in.nextInt();
        }
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                int count = 0;
                int m = 0;
                if(check[j]==0){
                    for(int k=0;k<n;k++){
                        if(flowercheck[k]==0&&arr[k][0]<=input[j]&&input[j]<=arr[k][1]){
                            count++;
                            m = k;
                        }
                    }
                    if(count==1){
                        result[j] = flower[m];
                        flowercheck[m] = 1;
                        check[j] = 1;
                    }
                }
            }
        }
        for(int i=0;i<n;i++){
            if(check[i] == 0){
                System.out.println("Ambiguous");
                return;
            }
        }
        for(int i=0;i<n;i++){
            System.out.print(result[i]+" ");
        }

    }
}
