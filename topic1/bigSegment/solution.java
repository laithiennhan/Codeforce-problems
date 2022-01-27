import java.util.*;
public class solution {
    private static int findArea(int[][] list, int n){

        int min = list[0][0];
        int max = list[0][1];
        for (int i = 0; i < n; i++){
            if (list[i][0] < min){
                min = list[i][0];
            }
            if (list[i][1] > max){
                max = list[i][1];
            }
        }
        int[] target = new int[2];
        target[0] = min;
        target[1] = max;
        int result = -1;
        for (int i = 0; i < n; i++){
            if(list[i][0] <= min && list[i][1] >= max){
                result = i + 1;
            }
        } 
        return result;
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[][] list = new int[n][2];
        for (int i = 0; i < n; i++){
            list[i][0] = sc.nextInt();
            list[i][1] = sc.nextInt();
        }
        System.out.println(findArea(list, n));
    }
}
