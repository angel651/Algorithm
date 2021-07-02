package LinkedList源码分析;

import java.util.NoSuchElementException;

/**
 * @author boyas
 * @create 2021/6/22 21:37
 */
public class LinkedList {
    java.util.LinkedList list = new java.util.LinkedList();
//    public E getFirst() {
//        final Node<E> f = first;
//        if (f == null)
//            throw new NoSuchElementException();
//        return f.item;
//    }
//public E getLast() {
//    final Node<E> l = last;
//    if (l == null)
//        throw new NoSuchElementException();
//    return l.item;
//}
//public E removeFirst() {
//    final Node<E> f = first;
//    if (f == null)
//        throw new NoSuchElementException();
//    return unlinkFirst(f);
//}
//public E removeLast() {
//    final Node<E> l = last;
//    if (l == null)
//        throw new NoSuchElementException();
//    return unlinkLast(l);
//}
//public void addFirst(E e) {
//    linkFirst(e);
//}
//    public void addLast(E e) {
//        linkLast(e);
//    }
    //迭代器是gc root对象，遍历的时候指向这些节点，这些节点不会挂
/*public void clear() {
    // Clearing all of the links between nodes is "unnecessary", but:
    // - helps a generational GC if the discarded nodes inhabit
    //   more than one generation
    // - is sure to free memory even if there is a reachable Iterator
    for (Node<E> x = first; x != null; ) {
        Node<E> next = x.next;
        x.item = null;
        x.next = null;
        x.prev = null;
        x = next;
    }
    first = last = null;
    size = 0;
    modCount++;
}*/
}
