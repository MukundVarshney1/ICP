package Assignment_10;

import java.util.Stack;

public class Remove_All_Adjacent_Duplicates_in_String_II {
    public static void main(String[] args) {
        String s = "deeedbbcccbdaa";
        int k =3;

        System.out.println(removeDuplicates(s, k));
    }

    public static String removeDuplicates(String s, int k) {
        Stack<Pair> st = new Stack<>();
        
        for(char ch : s.toCharArray()){
            if(!st.isEmpty() && st.peek().ch == ch){
                st.peek().count++;
                if(st.peek().count == k){
                    st.pop();
                }
            } else {
                st.push(new Pair(ch, 1));
            }
        }

        StringBuilder sb = new StringBuilder("");
        for(Pair p : st){
            for(int i=0;i<p.count;i++){
                sb.append(p.ch);
            }
        }
        return sb.toString();
    }

    static class Pair{
        char ch;
        int count;
        public Pair(char ch, int count){
            this.ch = ch;
            this.count = count;
        }
    }
}