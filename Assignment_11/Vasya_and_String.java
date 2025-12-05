package Assignment_11;

import java.util.Scanner;

public class Vasya_and_String {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in=new Scanner(System.in);
		int n=in.nextInt();
		int k=in.nextInt();
		String s=in.next();
		int a=helper(s,'a',k);
		int b=helper(s,'b',k);
		System.out.println(a>b?a:b);
	}
	public static int helper(String s,char ch,int k) {
		int si = 0;
        int ei = 0;
        int maxlen = 0;
        int used = 0;
        while (ei < s.length()) {
            if (s.charAt(ei) != ch) used++;
            while (used > k) {
                if (s.charAt(si) != ch) used--;
                si++;
            }
            maxlen = Math.max(maxlen, ei - si + 1);
            ei++;
        }

        return maxlen;
	}

}
