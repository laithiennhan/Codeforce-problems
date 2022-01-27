package topic1.fashionInBerland;
import java.util.*;
public class solution {
    public static boolean check(int total, int fastened){
        if (total == 1){
            if (fastened == 1) return true;
            else return false;
        }
        else {
            if (fastened == total - 1){
                return true;
            } else return false;
        }
    }
    public static int getFastened(String input){
        input = input.replaceAll("\\s", "");
        int count = 0;
        for (int i = 0; i < input.length(); i++){
            if (input.charAt(i) == '1'){
                count++;
            }
        }
        return count;
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        String total = sc.nextLine();
        String fastened = sc.nextLine();
        boolean result = check(Integer.parseInt(total), getFastened(fastened)); 
        if (result == true){
            System.out.println("YES");
        } else System.out.println("NO");
    }
}
