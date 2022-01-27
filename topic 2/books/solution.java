import java.util.Arrays;
import java.util.Scanner;

public class solution {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++){
            arr[i] = sc.nextInt();
        }
        int maxBook = 0;
        //Min Sum
        for (int i = 0; i < n; i++){
            int time = 0;
            innerloop:
            for (int j = i; j < n; j++){
                time+=arr[j];
                if (time <= k){
                    maxBook = Math.max(maxBook, j - i + 1);              
                } else {
                    break innerloop;
                }
            }
        }
        System.out.println(maxBook);
    }
}
