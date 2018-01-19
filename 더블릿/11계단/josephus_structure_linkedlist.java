import java.util.Scanner;

public class Main{
    static class LinkedList{
        int value;
        LinkedList next;
        LinkedList(int v){
            value = v;
            next = null;
        }
    }
    static LinkedList head;
    static LinkedList tail;
    static int n,m,k;
    static void push(int value){
        if(head == null){
            head = new LinkedList(value);
            tail = head;
        }else{
            tail.next = new LinkedList(value);
            tail = tail.next;
            tail.next = head;
        }
    }

    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        n = in.nextInt();
        m = in.nextInt();
        k = in.nextInt();
        LinkedList list = null;
        for(int i=1;i<=n;i++){
            push(i);
        }
        list = head;
        for(int i=1;i<m-1;i++){
            list = list.next;
        }
        LinkedList before = list;
        list = list.next;
        while(n != 0){
            System.out.print(list.value+" ");
            before.next = list.next;
            for(int i=1;i<=k;i++){
                list = list.next;
                if(i==k-1)
                    before = list;
            }
            n--;

        }
    }
}
