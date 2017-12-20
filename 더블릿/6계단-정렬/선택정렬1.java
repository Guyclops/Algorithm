import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int step = in.nextInt();
		int[] arr = new int[n];
		for(int i=0;i<n;i++){
			arr[i] = in.nextInt();
		}
		int min_index=0;
		for(int i=0;i<step;i++){
			for(int j=i;j<n;j++){
				if(arr[min_index]>arr[j]){
					min_index=j;
				}
			}
			int tmp=arr[min_index];
			arr[min_index] = arr[i];
			arr[i] = tmp;
		}
		
		for(int i=0;i<n;i++){
			System.out.print(arr[i]+" ");
		}
	}
}
