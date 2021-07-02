package list;

/**
 * @author boyas
 * @create 2021/6/23 10:08
 */
public class LinkedList<E> extends AbstractList<E> {
    private Node<E> first;
    private static class Node<E>{
        E element;//每个节点存储一个元素
        Node<E> next;//指向下一个节点
        public Node(E element,Node<E> next){
            this.element=element;
            this.next=next;
        }
    }
    @Override
    public void clear() {
        size = 0;
        first = null;//next没必要设为为null
    }

    @Override
    public int size() {
        return size;
    }

    @Override
    public E get(int index) {//获取某个位置对应的元素
        return node(index).element;
    }

    @Override
    public E set(int index, E element) {
        Node<E> node = node(index);
        E old = node.element;//把之前的元素保存在old
        node.element = element;//覆盖
        return old;
    }
    //在编写链表过程中，要注意边界测试，比如index为0，size-1,size时
    @Override
    public void add(int index, E element) {//在index位置插入一个元素
        if(index == 0){//添加到0位置
            first = new Node<>(element,first);
        }else {
            Node<E> prev = node(index-1);//获取上一个节点
            prev.next = new Node<>(element,prev.next);//插入一个节点
        }
        size++;//链表长度+1
    }
    private Node<E> node(int index){//获取某个位置对应的节点
        rangeCheck(index);
        Node<E> node = first;
        for (int i = 0; i < index ; i++) {
            node = node.next;
        }
        return node;
    }

    @Override
    public E remove(int index) {
        Node<E> node = first;//保存删除的元素
        if (index == 0){//删除0位置的元素
            first = first.next;
        }else{
            Node<E> prev= node(index-1);
            node = prev.next;
            prev.next=node.next;
        }
        size--;//链表长度减一
        return node.element;
    }

    @Override
    public int indexOf(E element) {
        if(element == null){
            Node<E> node = first;
            for (int i = 0; i <size ; i++) {//遍历节点
                if (node.element == null) return i;
                node = node.next;
            }
        }else{
            Node<E> node = first;
            for (int i = 0; i < size; i++) {
                if(element.equals(node.element)) return i ;
                node = node.next;
            }
        }
        return ELEMENT_NOTFOUND;
    }

    @Override
    public String toString() {
        StringBuilder string = new StringBuilder();
        string.append("size=").append(size).append(",[");
        Node<E> node = first;
        for (int i = 0; i < size; i++) {
            if (i!=0){
                string.append(",");
            }
            string.append(node.element);
            node = node.next;
        }
        string.append("]");
        return string.toString();
    }
}
