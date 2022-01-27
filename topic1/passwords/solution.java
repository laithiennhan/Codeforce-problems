import java.util.*;
public class solution {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        String[] password = new String[n];
        for (int i = 0; i < n; i++){
            password[i] = sc.next();
        }
        String realPassword = sc.next();
        int less = 0;
        int equal = 0;
        for (String p: password){
            if (p.length() < realPassword.length()){
                less++;
            }
            if (p.length() == realPassword.length()){
                equal++;
            }
        }
        int best = 1 + less + less/k*5;
        int worst = less + equal + (less + equal -1)/k*5;
        System.out.println(best + " " + worst);
        sc.close();

    }
}