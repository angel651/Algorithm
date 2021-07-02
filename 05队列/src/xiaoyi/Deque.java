package xiaoyi;

import list.LinkedList;
import list.List;

/**
 * @author boyas
 * @create 2021/6/25 19:51
 */
//双端队列(double ended queue)是能在头尾两端添加，删除的队列
public class Deque<E> {
    private List<E> list = new LinkedList<>();
    public int size(){
        return list.size();
    }
    public boolean isEmpty(){
        return list.isEmpty();
    }
    public void enQueueFront(E element){
        list.add(0,element);
    }
    public  void enQueueRear(E element){
        list.add(element);
    }
    public E deQueueFront(){
        return list.remove(0);
    }
    public E deQueueRear(){
        return list.remove(list.size()-1);
    }
    public E front(){
        return list.get(0);
    }
    public E rear(){
        return list.get(list.size()-1);
    }
}
