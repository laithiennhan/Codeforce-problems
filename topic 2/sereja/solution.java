import java.util.*;

public class solution {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        ArrayList<Integer> list = new ArrayList<Integer>();
        ArrayList<Integer> s = new ArrayList<Integer>();
        ArrayList<Integer> d = new ArrayList<Integer>();

        for (int i = 0; i < n; i++){
            list.add(sc.nextInt());
        }
        //Serja go first
        while (list.size() >= 2){
            int first = list.get(0);
            int last = list.get(list.size() - 1);
            s.add(Math.max(first, last));
            if (first > last){
                list.remove(0);
            } else {
                list.remove(list.size() - 1);
            }
            first = list.get(0);
            last = list.get(list.size() - 1);
            d.add(Math.max(first, last));
            if (first > last){
                list.remove(0);
            } else {
                list.remove(list.size() - 1);
            }
            
        }  
        //Neu so turn bang nhau -> luot cua 1
        if (list.size() == 1){
            s.add(list.get(0));
        }
        int totalS = 0;
        int totalD = 0;
        for (int i = 0; i < s.size(); i++){
            totalS += s.get(i);
        }
        for (int i = 0; i < d.size(); i++){
            totalD += d.get(i);
        }
        System.out.printf("%d %d", totalS, totalD);
    }
}
