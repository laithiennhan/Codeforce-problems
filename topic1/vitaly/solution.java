import java.util.*;
public class solution {
    public static ArrayList<Integer> stringToArrayList(String s){
        ArrayList<Integer> stringAsArray = new ArrayList<Integer>();
        for (int i = 0; i < s.length(); i++){
            stringAsArray.add((int)(s.charAt(i)));
        }
        return stringAsArray;
    }

    public static String arrayListToString(ArrayList<Integer> arr){
        String result = "";
        for (int i = arr.size() - 1; i > 0; i--){
            if (arr.get(i) > 122){
                arr.set(i - 1, arr.get(i - 1) + 1);
                arr.set(i, 122);
            }
        }
        for (int i = 0; i < arr.size(); i++){
            result += (char)(arr.get(i).intValue());
        }
        return result;
    }

    public static String vitaly(String s, String t){
        
        //get string next to s:
        ArrayList<Integer> sAsArray = new ArrayList<Integer>();
        sAsArray = stringToArrayList(s);
        sAsArray.set(s.length() - 1, sAsArray.get(s.length() - 1) + 1);
        String result = arrayListToString(sAsArray);
        if (result.compareTo(t) >= 0){
            return "No such string";
        }
        return result;
    }
    public static void main(String args[]){
        
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        String t = sc.nextLine();
        System.out.println(vitaly(s, t));
    }
}