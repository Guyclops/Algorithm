import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int[] arr = new int[n];
		for(int i=0;i<n;i++){
			arr[i] = in.nextInt();
		}
		
		for(int i=0;i<n;i++){
			int count=1;
			for(int j=0;j<n;j++){
				if(arr[i]<arr[j]){
					count++;
				}
			}
			System.out.println(count);
		}
		
	}
}
