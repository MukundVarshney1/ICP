package Assignment_11;

import java.util.Arrays;
import java.util.Scanner;

public class Binary_String_Minimizing {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in=new Scanner(System.in);
		 int q = in.nextInt();
	        while (q-- > 0) {
	            int n = in.nextInt();
	            long k = in.nextLong();
	            char[] s = in.next().toCharArray();

	            int zerosPassed = 0;
	            for (int i = 0; i < n; i++) {
	                if (s[i] == '0') {
	                    long move = Math.min(i - zerosPassed, k);
	                    if (move > 0) {
	                        s[i] = '1';
	                        s[(int)(i - move)] = '0';
	                        k -= move;
	                    }
	                    zerosPassed++;
	                }
	            }

	            System.out.println(new String(s));
		}

	}

}
