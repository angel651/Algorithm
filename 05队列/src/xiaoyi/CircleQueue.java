package xiaoyi;

/**
 * @author boyas
 * @create 2021/6/25 20:41
 */
//循环队列底层用数组实现
    //循环双端队列：可以进行两端添加，删除的循环队列
    //队列底层也可以使用动态数组实现，并且各项接口可以优化到O(1)的时间复杂度，
    //这个用数组实现并且优化之后的队列也叫做循环队列
public class CircleQueue<E> {
    private int front;//存储元素的下标
    private int size;
    private E[] elements;
    private static final int DEFAULT_CAPACITY = 10;
    public CircleQueue(){
        elements = (E[]) new Object[DEFAULT_CAPACITY];
    }
    public int size(){
        return size;
    }
    public boolean isEmpty(){
        return size==0;
    }
    public void enQueue(E element){
    }
    public E deQueue(){
        return null;
    }
    public E front(){//获取队列的头元素
        return elements[front];
    }
}
