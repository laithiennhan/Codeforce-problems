import java.util.*;
public class solution {
    private static void getAlphabet (int[] arr, String s){
        for (int i = 0; i < s.length(); i++){
            int current = (int)(s.charAt(i) - 97);
            arr[current]+=1;
        }
    }
    
    private static boolean checkNeedTree(int[] s, int[] t){
        for (int i = 0; i < 26; i++){
            if (t[i] > s[i]){
                return true;
            }
        }
        return false;
    }
    private static boolean checkAutomaton(int[] s, int[] t){
        for (int i = 0; i < 26; i++){
            if (t[i] < s[i]){
                return true;
            }
        }
        return false;
        
    }
    private static boolean checkArray(String s, String t){
        int current = -1;
        for (int i = 0; i < t.length(); i++){
            if (s.indexOf(t.charAt(i), current + 1) > current){
                current = s.indexOf(t.charAt(i), current + 1);
            } else {
                return true;
            }
        }
        return false;
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        String t = sc.nextLine();
        String result = "";
        
        int[] sAlphabet = new int[26];
        int[] tAlphabet = new int[26];
        getAlphabet(sAlphabet, s);
        getAlphabet(tAlphabet, t);

        if (checkNeedTree(sAlphabet, tAlphabet)){
            result = "need tree";
        } else {
            if (checkAutomaton(sAlphabet, tAlphabet)){
                result = "automaton";
            }
            if (checkArray(s, t)){
                result = "array";
            }
            if (checkAutomaton(sAlphabet, tAlphabet) && checkArray(s, t))
                result = "both";
        }
        System.out.println(result);
        
        sc.close();
    }
}
