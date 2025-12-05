package Assignment_12;

import java.util.Stack;

public class Next_Greater_Element_II {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,3};
        int[] res = Greater_Element(arr);

        for(int a : res){
            System.out.print(a+" ");
        }
    }

    public static int[] Greater_Element(int[] nums){
        Stack<Integer> st = new Stack<>();
        int n = nums.length;
        int[] ans = new int[n];
        for(int i=0;i<2*n;i++){
            int ele = nums[i%n]; //circular ke karan mod n kiya hai
            while(!st.isEmpty() && nums[st.peek()]<ele){
                ans[st.pop()] = ele;

            }
            if(i<n){
                st.push(i);
            }
        }
        while (!st.isEmpty()) {
			ans[st.pop()] = -1;
		}
        return ans;
    }
}