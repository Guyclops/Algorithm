import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        String str = in.next();
        int length = str.length();
        String[][] arr = new String[length][2];
        for(int i=0;i<length;i++){
            arr[i][0] = str.substring(i,length);
            arr[i][1] = ""+i;
        }
        Arrays.sort(arr, new Comparator<String[]>() {
            @Override
            public int compare(String[] o1, String[] o2) {
                return o1[0].compareTo(o2[0]);
            }
        });
        for(int i=0;i<length;i++){
            System.out.println(arr[i][0]+" "+arr[i][1]);
        }
    }
}
