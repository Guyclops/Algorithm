import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        String str = in.next();
        int result = 0;
        String first = str.substring(0,str.indexOf("$"));
        String middle = str.substring(str.indexOf("$")+1,str.lastIndexOf("$"));
        String last = str.substring(str.lastIndexOf("$")+1);
        StringBuffer buffer = new StringBuffer(first);
        first = buffer.reverse().toString();
        buffer = new StringBuffer(last);
        last = buffer.reverse().toString();
        result += Integer.parseInt(first);
        result += Integer.parseInt(middle);
        result += Integer.parseInt(last);
        System.out.println(result);
    }
}
