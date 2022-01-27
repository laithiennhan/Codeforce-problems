package topic1.museum;
import java.util.*;
public class solution {
    
    //ASCII: 97-122
    public static int getNumTurn(String input){
        int output = 0;
        if (input.charAt(0) != 'a'){
            int val1 = Math.abs(input.charAt(0) - 'a');
            int val2 = 26 - val1;
            output += Math.min(val1, val2);
        }
        for (int i = 0; i < input.length() - 1; i++){
            int val1 = Math.abs(input.charAt(i) - input.charAt(i+1));
            int val2 = 26 - val1;
            output += Math.min(val1, val2);
        }
        return output;
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        System.out.println(getNumTurn(input));
    }

}
