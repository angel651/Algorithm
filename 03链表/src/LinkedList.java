/*  Linked List链表是一种链式存储的线性表，所有元素的内存地址不一定是连续的
*   动态数组有个明显的缺点---->可能浪费大量存储空间
*   链表的接口和动态数组的大部分一样的
* */
public class LinkedList<E> {
    private int size;
    private Node<E> first;
    private static class Node<E>{
        E element;
        Node<E> next;
        public Node(E element,Node<E> next){
            this.element=element;
            this.next=next;
        }
    }

}
