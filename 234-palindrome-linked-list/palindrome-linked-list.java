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
    public ListNode middleNode(ListNode head){
        ListNode f = head;
        ListNode s = head;
      while ( f != null && f.next != null){
        f = f.next.next;
        s = s.next;
      }
        return s;
    }
    public ListNode reverseList(ListNode head){
        ListNode prev = null;
        ListNode present = head;
        while( present != null){
            ListNode next = present.next;
            present.next = prev;
            prev = present;
            present = next;
        }
        return prev;
    }
    public boolean isPalindrome(ListNode head) {
        ListNode mid = middleNode(head);
        ListNode headSecond = reverseList(mid);
        ListNode reversehead = headSecond;

        while(head != null && headSecond != null){
            if(head.val  != headSecond.val){
                break;
            }
            head = head.next;
            headSecond = headSecond.next;
        }
        reverseList(reversehead);
        return head == null || headSecond == null;
    }
}