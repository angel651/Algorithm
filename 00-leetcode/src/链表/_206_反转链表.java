package 链表;

/**
 * https://leetcode-cn.com/problems/reverse-linked-list/
 *
 * @author boyas
 * @create 2021/6/19 0:17
 */
public class _206_反转链表 {
    //采用递归实现
    //假设head节点为5，head.next为4
    public ListNode reverseList(ListNode head) {
        //边界条件
        if (head == null || head.next == null) return head;//节点为空或者单节点反转返回head
        //递归
        ListNode newHead = reverseList(head.next);//传入4，采用递归实现newHead->1->2->3->4>null
        head.next.next = head;//4的next指向5
        head.next = null;//5指向null
        return newHead;//最后返回1->2->3->4->5->null
    }

    //采用非递归实现,一个一个节点串起来
    public ListNode reverseList2(ListNode head) {
        if (head == null || head.next == null) return head;//节点为空或者单节点反转返回head
        ListNode newHead = null;//开始newHead指向null
        //迭代(非递归）利用head的next指向newHead
        while (head != null) {
            ListNode tmp = head.next;//一开始tmp指向head(5)的next(4)
            head.next = newHead;//head(5)的next指向newHead
            newHead = head;//newHead指向head(5)
            head = tmp;//现在head可以指向tmp所指向节点即(4),一个节点串起来了即newHead->5->null
        }//一次循环串一个节点，直至head指向null
        return newHead;//最后返回1->2->3->4->5->null
    }

}
