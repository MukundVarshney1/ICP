package Assignment_10;

import java.util.Stack;

public class Asteroid_Collision {
    public static void main(String[] args) {
        int[] asteroids = {3,5,-6,2,-1,4};
        int[] ans = answer(asteroids);
        for (int i : ans) {
            System.err.print(i+" ");
        }
    }

    public static int[] answer(int[] arr){
        int n = arr.length;
        Stack<Integer> st = new Stack<>();
        for(int i =0;i<n;i++){
            if(arr[i]>0){
                st.push(arr[i]);
            }else{
                while(!st.isEmpty() && st.peek()>0 && st.peek()<Math.abs(arr[i])){
                    st.pop();
                }
                if(!st.isEmpty() && st.peek() == Math.abs(arr[i])){
                    st.pop();
                }else if(st.isEmpty() || st.peek()<0){
                    st.push(arr[i]);

                }

            }
        }
        int[] ans = new int[st.size()];
        for(int i = ans.length-1;i>=0;i--){
            ans[i] = st.pop();
        }
        return ans;
    }
}