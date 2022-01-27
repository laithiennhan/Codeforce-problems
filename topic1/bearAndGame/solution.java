import java.util.*;
public class solution {
    
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n+2];
        arr[0] = 0;
        arr[n+1] = 90;
        for (int i = 0; i < n; i++){
            arr[i+1] = sc.nextInt();
        }
        int total = 0;
        for (int i = 1; i <= n + 1; i++){
            int interval = arr[i] - arr[i-1];
            if (interval <= 15){
                total += interval;

            } else {
                total+= 15;
                break;
            }
        }
        System.out.println(total);
    }
}
