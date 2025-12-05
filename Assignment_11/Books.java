package Assignment_11;

import java.util.Scanner;

public class Books {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in=new Scanner(System.in);
		int n=in.nextInt();
		int t=in.nextInt();
		int[] arr=new int[n];
		for(int i=0;i<n;i++) {
			arr[i]=in.nextInt();
		}
		int ei=0;
		int si=0;
		int used=0;
		int max=0;
		while(si<=ei && ei<n) {
			used+=arr[ei];
			while(si<=ei && used>t) {
				used-=arr[si];
				si++;
			}
			max=Math.max(max, ei-si+1);
			ei++;
		}
		System.out.println(max);
	}

}
