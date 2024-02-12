public class Solution {

    public ListNode deleteDuplicates(ListNode head) {
        ListNode firstSolid = null;
        ListNode lastSolid = null;

        while (head != null && head.next != null){
            if(head.val == head.next.val){
                while(head.next != null && head.val == head.next.val){
                   if(lastSolid != null) {
                       lastSolid.next = null;
                   }
                    head = head.next;
                }
                head = head.next;

            }else{
                if(firstSolid == null){
                    firstSolid = head;
                    lastSolid = head;
                }else {
                    lastSolid.next = head;
                    lastSolid = lastSolid.next;
                }
                head = head.next;
            }


        }
        if(head != null){
            if(firstSolid == null){
                return head;
            }else {
                lastSolid.next = head;

            }

        }

        return firstSolid;
    }
}

class ListNode {
    int val;
    ListNode next;

    ListNode() {
    }

    ListNode(int val) {
        this.val = val;
    }

    ListNode(int val, ListNode next) {
        this.val = val;
        this.next = next;
    }

    @Override
    public String toString() {
        return "ListNode{" +
                "val=" + val +
                '}';
    }
}
