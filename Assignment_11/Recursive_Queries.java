package Assignment_11;

import java.util.*;

public class Recursive_Queries {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		int q = in.nextInt();
		while (q-- > 0) {
			int l = in.nextInt();
			int r = in.nextInt();
			int k = in.nextInt();
			int c=0;
			for(int i=l;i<=r;i++) {
				if(helper(i,k)) {
					c++;
				}
			}
			System.out.println(c);
		}
	}
	public static boolean helper(int n,int k) {
		int prod=1;
		while(n>0) {
			int rem=n%10;
			if(rem!=0) {
				prod*=rem;
			}
			n/=10;
		}
		if(prod==k) {
			return true;
		}
		if(prod<10) {
			return false;
		}
		return helper(prod,k);
	}

}
