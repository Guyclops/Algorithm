import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int knapsack = in.nextInt();
        int n = in.nextInt();
        double[][] value = new double[n][2];
        double result = 0;
        for(int i=0;i<n;i++){
            value[i][0] = in.nextDouble();
            value[i][1] = in.nextDouble();
        }
        Arrays.sort(value, new Comparator<double[]>() {
            @Override
            public int compare(double[] o1, double[] o2) {
                return (o1[1]/o1[0]<o2[1]/o2[0])?1:-1;
            }
        });

        for(int i=0;i<n;i++){
            if(knapsack==0)
                break;
            if(knapsack>=value[i][0]){
                knapsack -= value[i][0];
                result += value[i][1];
            }else{
                result += knapsack*(value[i][1]/value[i][0]);
                knapsack = 0;
            }
        }
        System.out.printf("%.2f", result);
    }
}
