package Assignment_10;

import java.util.Stack;

public class Basic_Calculator_II {
    public static void main(String[] args) {
        String s = "3+2*2";
        System.out.println(answer(s));
    }

    public static int answer(String s){
        int n = s.length();
        Stack<Integer> st = new Stack<>();
        
        int curr =0;
        char op = '+';

        for(int i=0 ; i<n ;i++){
            char ch = s.charAt(i);
            if(ch >= '0' && ch <='9'){
                curr = curr*10 + (ch-'0');
            }

            if(( !Character.isDigit(ch) && ch != ' ') || i==n-1){
                if(op == '+'){
                    st.push(curr);
                }
                else if(op == '-'){
                    st.push(-curr);
                }
                else if(op == '*'){
                    st.push(st.pop() * curr);
                }
                else if(op == '/'){
                    st.push(st.pop() / curr);
                }
                
                curr =0;
                op = ch;
                

            }

        }

        int ans = 0;
        while(!st.isEmpty()){
            ans += st.pop();
        }
        return ans;
    }
}