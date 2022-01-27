import java.util.*;
public class solution {

    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int[] a = new int[n];
        int[] b = new int[m];
        for (int i = 0; i < n; i++){
            a[i] = (sc.nextInt());
        }
        for (int i = 0; i < m; i++){
            b[i] = (sc.nextInt());
        }
        int result = 0;
        int found = 0;
        int i = 0; int j = 0;
        while (i <= j && j < m && i < n){
            if (a[i] <= b[j]){
                found++;
                i++;
                j++;
            } else {
                j++;
            }
        }
        result = n - found;
    
        System.out.println(result);
    }
}
