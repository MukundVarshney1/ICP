
package Assignment_11;
import java.util.*;
public class Dreamoon_and_WiFi {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s1 = sc.next();
        String s2 = sc.next();

        double ans = findProbability(s1, s2);
        System.out.printf("%.12f\n", ans);
    }

    // to find factorial
    public static double fact(int n) {
        double f = 1;
        for (int i = 2; i <= n; i++) f *= i;

        return f;
    }

    //ye function probability find karega
    public static double findProbability(String s1, String s2) {
        int target = 0, cur = 0, q = 0;

        for (char c : s1.toCharArray())
            target += (c == '+') ? 1 : -1;

        for (char c : s2.toCharArray()) {
            if (c == '+') cur++;
            else if (c == '-') cur--;
            else q++;
        }

        int diff = target - cur;

        if ((diff + q) % 2 != 0 || Math.abs(diff) > q)
            return 0.0;

        int need = (diff + q) / 2;
        double ways = fact(q) / (fact(need) * fact(q - need));
        return ways / Math.pow(2, q);
    }

    
}