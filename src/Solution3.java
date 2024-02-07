public class Solution3{

    public boolean hasCycle(ListNode head){

        if(head == null ){
            return false;
        }

        ListNode hare = head;
        ListNode tuertle = head;

        while (hare != null && hare.next != null){
            hare = hare.next.next;
            tuertle = tuertle.next;

            if(hare == tuertle){
                return true;
            }
        }
        return false;
    }
}