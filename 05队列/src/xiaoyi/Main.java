package xiaoyi;

/**
 * @author boyas
 * @create 2021/6/25 19:15
 */
public class Main{
    public static void main(String[] args) {
//        Queue<Integer> queue = new Queue<>();
//        queue.enQueue(11);
//        queue.enQueue(12);
//        queue.enQueue(13);
//        queue.enQueue(14);
//        while (!queue.isEmpty()){
//            System.out.println(queue.deQueue());
//        }
        Deque<Integer> deque = new Deque<>();
        deque.enQueueFront(11);
        deque.enQueueFront(12);
        deque.enQueueRear(13);
        deque.enQueueRear(14);
        /*尾14 13 11 12 头*/
        while (!deque.isEmpty()){
//            System.out.println(deque.deQueueFront());
            System.out.println(deque.deQueueRear());
        }
    }
}
