import java.util.ArrayList;
import java.util.Scanner;

public class solution {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int[] a = new int[n];
        ArrayList<Integer> list = new ArrayList<Integer>();
        for (int i = 0; i < n ; i++){
            a[i] = sc.nextInt();
            list.add(a[i]);
        }
        int maxCount = 0;

        int current;
        for (int i = 0; i < n; i++){
            current = a[i];
            int countGreater; 
            int countLower;
            for (int j = 1; j < n; j++){
                if (a[j] == a[i] + 1){
                    countGreater++;
                } else if (a[j] == a[i] - 1){
                    countLower++;
                } else {

                }
            }
        }
    }
}
