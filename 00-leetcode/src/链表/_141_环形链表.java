package 链表;

/**
 * https://leetcode-cn.com/problems/linked-list-cycle/
 *
 * @author boyas
 * @create 2021/6/19 2:09
 */
//采用快慢指针:例如慢指针slow走一步，快指针fast走两步,slow和fast(slow和fast指向的节点一样)相遇即有环
public class _141_环形链表 {
    //为了表示给定链表中的环，我们使用整数 pos 来表示链表尾连接到链表中的位置（索引从 0 开始）。
    // 如果 pos 是 -1，则在该链表中没有环。
    public boolean hasCycle(ListNode head) {
        if (head == null || head.next == null) return false;
        ListNode slow = head;//头节点为慢指针slow
        ListNode fast = head.next;//第二个节点为快指针fast
        while (fast != null && fast.next != null) {
            if (fast == slow) return true;
            slow = slow.next;
            fast = fast.next.next;
        }
        return false;
    }
}
