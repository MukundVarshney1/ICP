package Assignment_12;

import java.util.ArrayList;
import java.util.List;

public class Reorder_List {
    public class ListNode {
        int val;
        ListNode next;
        ListNode() {}
        ListNode(int val) { this.val = val; }
        ListNode(int val, ListNode next) { this.val = val; this.next = next; }
    }

    public static void answer(ListNode head){
        if(head == null || head.next == null){
            return;
        }
        List<ListNode> ll = new ArrayList<>();
        ListNode temp = head;
        while(temp != null){
            ll.add(temp);
            temp = temp.next;
        }

        int i=0;
        int j = ll.size()-1;
        List<ListNode> l2 = new ArrayList<>();
        while(i<j){
            l2.add(ll.get(i));
            l2.add(ll.get(j));
            i++;
            j--;
        }
        if(i==j){
            l2.add(ll.get(i));
        }
        head = l2.get(0);
        for(i=1;i<ll.size();i++){
            // if(head.next == null){
            //     break;
            // }
            head.next = l2.get(i);
            head = head.next;
            
        }
        head.next = null;
        
        

    }
}