package Assignment_11;

import java.util.*;

public class Nastya_and_Door {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		int t = in.nextInt();
		while (t-- > 0) {
			int n = in.nextInt();
			int k = in.nextInt();
			int[] arr=new int[n];
			for(int i=0;i<n;i++) {
				arr[i]=in.nextInt();
			}
			int peaks=0;
			int max=0;
			int left=1;
			for(int i=1;i<k-1;i++) {
				if(arr[i]>arr[i-1] && arr[i]>arr[i+1]) {
					peaks++;
				}
			}
			max=peaks;
			int ei=k-1;
			int si=1;
			while(ei<arr.length-1) {
				if((arr[si]>arr[si-1] && arr[si]>arr[si+1])){
					peaks--;
				}
				si++;
				if(arr[ei]>arr[ei-1] && arr[ei]>arr[ei+1]) {
					peaks++;
				}
				if(peaks>max) {
					max=peaks;
					left=si;
				}
				ei++;
			}
			System.out.println(max+1+" "+left);
		}
	}

}
