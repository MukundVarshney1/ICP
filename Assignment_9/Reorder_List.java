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
    public void reorderList(ListNode head) {
        Stack<ListNode> st=new Stack<>();
        int c=x(st,head)/2;
        ListNode temp=head;
        ListNode temp1=head.next;
        while(c-->0){
            temp.next=st.pop();
            temp=temp.next;
            temp.next=temp1;
            temp1=temp1.next;
            temp=temp.next;
        }
        temp.next=null;

    }
    public static int x(Stack<ListNode> st,ListNode temp){
        if(temp==null){
            return 0;
        }
        st.push(temp);
        int r=x(st,temp.next);
        return r+1;
    }

}