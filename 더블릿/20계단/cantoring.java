import java.util.Scanner;

public class Main{
    static void cantoring(double n){
        if(n==3){
            System.out.print("- -");
            return;
        }
        cantoring(n/3);
        for(int i=0;i<n/3;i++){
            System.out.print(" ");
        }
        cantoring(n/3);
    }

    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        if(n==0){
            System.out.println("-");
            return;
        }
        double i = Math.pow(3,n);
        cantoring(i);
    }
}
