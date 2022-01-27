import java.util.*;
public class solution {
        public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        int[] a = new int[n];
        int[] b = new int[100000];
        if (k == 1) {
            System.out.println("1 1");
            return;
        }
        for (int i = 0; i < n; i++){
            a[i] = sc.nextInt();

        }
        
        // 1 <= L <= X <= Y <= R <= N
        int unique = 0;
        int j = 0;
        for (int i = 0; i < n; i++){
            b[a[i]]++;
            if (b[a[i]] == 1){
                unique++;
            }
            while (unique == k){
                b[a[j]]--;
                if (b[a[j]] == 0){
                    System.out.println(Integer.toString(j+1) + " " + Integer.toString(i+1));
                    return;
                }
                j++;
            }
        }
        System.out.print("-1 -1");
        sc.close();

    }
}