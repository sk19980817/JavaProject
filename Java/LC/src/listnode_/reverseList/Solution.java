package listnode_.reverseList;

import java.util.List;

public class Solution {
    public ListNode reverseList(ListNode head) {
        ListNode newhead,p,temp;
        p=head;
        newhead=null;
        while (p!=null){
            head=head.next;
            p.next=newhead;
            newhead=p;
            p=head;
        }
        return newhead;
    }
}


class ListNode {
    int val;
    ListNode next;
    ListNode() {}
    ListNode(int val) { this.val = val; }
    ListNode(int val, ListNode next) { this.val = val; this.next = next; }
}
