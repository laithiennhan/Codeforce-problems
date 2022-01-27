import java.util.*;
public class solution {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n1 = sc.nextInt();
        int n2 = sc.nextInt();
        int k = sc.nextInt();
        int m = sc.nextInt();
        int value;
        ArrayList<Integer> a = new ArrayList<Integer>();
        ArrayList<Integer> b = new ArrayList<Integer>();
        for (int i = 0; i < n1; i++){
            value = sc.nextInt();
            a.add(value);
        }
        for (int i = 0; i < n2; i++){
            value = sc.nextInt();
            b.add(value);
        }
        if (a.get(k-1) < b.get(n2 - m)){
            System.out.println("YES");
        } else System.out.println("NO");
    }
}
