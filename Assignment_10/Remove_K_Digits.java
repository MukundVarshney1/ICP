package Assignment_10;

import java.util.Stack;

public class Remove_K_Digits {
    public static void main(String[] args) {
        String num = "10200";
        int k =1;
        System.out.println(remove_digits(num, k));
    }

    public static String remove_digits(String num, int k){
        Stack<Character> st = new Stack<>();
        for(int i=0;i<num.length() ;i++){
            char ch = num.charAt(i);

            while(!st.isEmpty() && k>0 && (ch-'0' < st.peek()-'0')){
                st.pop();
                k--;
            }
            st.push(ch);
        }
        while(k>0){
            st.pop();
            k--;
        }

        //if stack is empty then answer zero hoga
        if(st.isEmpty()){
            return "0";
        }

        StringBuilder sb = new StringBuilder();


        while(!st.isEmpty()){
            sb.insert(0, st.pop());
        }

        //removing leading zeroes
        while (sb.length() > 1 && sb.charAt(0) == '0') {
            sb.deleteCharAt(0);
        }

        return sb.toString();

    }
}