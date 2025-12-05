package Assignment_11;

import java.util.*;

public class Nastya_and_Rice {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int t = in.nextInt();
		while (t-- > 0) {
			int n = in.nextInt();
			int a = in.nextInt();
			int b = in.nextInt();
			int c = in.nextInt();
			int d = in.nextInt();
			int min = c - d;
			int max = c + d;
			if (n * (a - b) <= max && n * (a + b) >= min) {
				System.out.println("Yes");
			} else {
				System.out.println("No");
			}
		}
	}
}
