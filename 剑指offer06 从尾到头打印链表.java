//自己的解法
/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution {
    public int[] reversePrint(ListNode head) {
        int len = 0;
        int j = 0;
        ListNode phead = head;
        while(head != null){
            head = head.next;
            len++;
        }
        int[] a = new int[len];
        while(phead != null){
            a[j++] = phead.val;
            phead = phead.next;
        }
        int left = 0,right = len - 1;
        while(left < right){
                int temp = a[left];
                a[left] = a[right];
                a[right] = temp;
                left++;
                right--;
        }
        return a;
    }
}

//栈(stack)
class Solution {
    public int[] reversePrint(ListNode head) {
      //记住不能List<ListNode> stack = new LinkedList<>();
      //因为List里面没有LinkedList封装的关于Stack、Queue等方法
        LinkedList<ListNode> stack = new LinkedList<>();//或者Stack<ListNode> stack = new Stack<>();
        int len = 0;
        int i = 0;
        ListNode phead = head;
        while(phead != null){
            stack.push(phead);
            phead = phead.next;
        }
        int[] arr = new int[stack.size()];
        while(!(stack.isEmpty())){
            arr[i++] = stack.pop().val;
        }
        return arr;        
    }
}
