package xiaoyi;

import list.LinkedList;
import list.List;

/**
 * @author boyas
 * @create 2021/6/25 13:02
 */
public class Stack<E> {
    private List<E> list =  new LinkedList<>();
    public int size(){
        return list.size();
    }
    public boolean isEmpty(){
        return list.isEmpty();
    }
    public void push(E element){
        list.add(element);
    }
    public E pop(){
        return list.remove(list.size()-1);
    }
    public E top(){
        return list.get(list.size()-1);
    }

}
