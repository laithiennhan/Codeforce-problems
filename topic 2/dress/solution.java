import java.util.*;
public class solution {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int x = sc.nextInt();
        int y = sc.nextInt();
        int[] a = new int[n];
        // ArrayList<Integer> b = new ArrayList<Integer>();
        int[] b = new int[m];
        int[] a_copy = new int[n];
        for (int i = 0; i < n; i++){
            a[i] = sc.nextInt();
            a_copy[i] = -1;
        }
        for (int i = 0; i < m; i++){
            b[i] = sc.nextInt();
        }
        int k = 0;

        int count = 0;
        // for (int i = 0; i < n; i++){
        //     int lower = a[i] - x;
        //     int upper = a[i] + y;
        //     a_copy[i] = -1;
        //     innerloop:
        //     for (int j = 0; j < b.size(); j++){
        //         if (b.get(j) >= lower && b.get(j) <= upper){
        //             a_copy[i] = j + count + 1;
        //             count++;
        //             b.remove(j);
        //             break innerloop;
        //         } 
                
        //     }
        // }
        int i = 0;
        int j = 0;
        while (i < n && j < m){
            int lower = a[i] -x;
            int upper = a[i] + y;
            if (b[j] >= lower && b[j] <= upper){
                a_copy[i] = j + 1;
                j++;
                i++;
                count++;
            }
            else if (b[j] < lower) {
                j++;
            }
            else if (b[j] > lower){
                i++;
            }
        }
        System.out.println(count);
        for (int f = 0; f < n; f++){
            if (a_copy[f] != -1){
                System.out.println((f + 1) +" "+a_copy[f]);
            }
        }
    }
}
