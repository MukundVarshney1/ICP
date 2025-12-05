package Assignment_10;

import java.util.Stack;

public class Maximal_Rectangle {
    public static void main(String[] args) {
        char[][] matrix = {
                        {'1','0','1','0','0'},
                        {'1','0','1','1','1'},
                        {'1','1','1','1','1'},
                        {'1','0','0','1','0'}};

        System.out.println(maxRectangle(matrix));
    }

    public static int maxRectangle(char[][] arr){
        int n = arr.length;
        int m = arr[0].length;
        int ans =0;
        int[] count = new int[m];
        for(int i=0;i<n;i++){
            for(int j=0 ; j<m ; j++){
                if(arr[i][j] == '0'){
                    count[j] = 0;
                }else{
                    count[j]++;
                }
            }
            ans = Math.max(ans , Largest_Histogram(count));
        }
        return ans;
    }
    public static int Largest_Histogram(int[] arr){
        Stack<Integer> st = new Stack<>();
        int ans =0;
        for(int i=0;i<arr.length;i++){
            while( !st.isEmpty() && arr[i]<arr[st.peek()]){
                int  h = arr[st.pop()];
                int r =i;
                if(st.isEmpty()){
                    ans = Math.max(ans, h*r);
                }else{
                    int l = st.peek();
                    ans = Math.max(ans , h*(r-l-1));
                }

            }
            st.push(i);
        }
        int r = arr.length;
        while( !st.isEmpty()){
            int  h = arr[st.pop()];
            if(st.isEmpty()){
                ans = Math.max(ans, h*r);
            }else{
                int l = st.peek();
                ans = Math.max(ans , h*(r-l-1));
            }

        }
        return ans;
        
    }
}