/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public boolean isPalindrome(ListNode head) {
        Stack<ListNode> st=new Stack<>();
        ListNode temp=head;
        int c=x(st,head)/2;
        while(c-->0){
            if(temp.val!=st.pop().val){
                return false;
            }
            temp=temp.next;
        }
        return true;
    }
    public static int x(Stack<ListNode> st,ListNode temp){
        if(temp==null){
            return 0;
        }
        st.push(temp);
        int c=x(st,temp.next)+1;
        return c;
    }
}