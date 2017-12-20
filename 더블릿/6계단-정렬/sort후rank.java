import java.util.Arrays;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int[] arr = new int[n];
		for(int i=0;i<n;i++){
			arr[i] = in.nextInt();
		}
		Arrays.sort(arr);
		for(int i=n-1;i>=0;i--){
			int count=1;
			for(int j=n-1;j>=0;j--){
				if(arr[i]<arr[j]){
					count++;
				}
			}
			System.out.println(arr[i]+" "+count);
		}
		
	}
	
}
