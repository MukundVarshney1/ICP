package Assignment_11;
import java.util.*;
public class Little_Elephant_and_Function {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.print(n + " ");
        for (int i = 1; i < n; i++) {
            System.out.print(i + (i == n - 1 ? "" : " "));
        }
	}

}
