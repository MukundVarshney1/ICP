class Solution {
    public int evalRPN(String[] tokens) {
        Stack<Integer> ans=new Stack<>();
        for(int i=0;i<tokens.length;i++){
            if(tokens[i].equals("+")){
                int b=ans.pop();
                int a=ans.pop();
                ans.push(a+b);
            }
            else if(tokens[i].equals("-")){
                int b=ans.pop();
                int a=ans.pop();
                ans.push(a-b);
            }
            else if(tokens[i].equals("*")){
                int b=ans.pop();
                int a=ans.pop();
                ans.push(a*b);
            }
            else if(tokens[i].equals("/")){
                int b=ans.pop();
                int a=ans.pop();
                ans.push(a/b);
            }
            else{
                ans.push(Integer.parseInt(tokens[i]));
            }
        }
        return ans.pop();
    }
}