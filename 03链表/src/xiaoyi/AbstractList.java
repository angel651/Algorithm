package xiaoyi;

/**
 * @author boyas
 * @create 2021/6/23 9:38
 */
//抽象线性表，为ArrayList和LinkedList的父类,抽取公共代码
//在java中，子类是非抽象类，则必须实现接口中的所有方法，
// 子类是抽象类，则可以不实现接口中的所有方法，因为抽象类中允许有抽象方法的存在
public abstract class AbstractList<E> implements List<E> {
    protected int size;
    //下标越界抛出的异常
    protected void outOfBounds(int index){
        throw new IndexOutOfBoundsException("Index:"+index+"Size:"+size);
    }
    //检查下标越界(不可访问或删除size位置）
    protected void rangeCheck(int index){
        if (index<0||index>=size){
            outOfBounds(index);
        }
    }
    //检查add()的下标越界(可以在size位置添加元素)
    protected void  rangeCheckForAdd(int index){
        if (index<0||index>size){
            outOfBounds(index);
        }
    }

    @Override
    public int size() {
        return size;
    }

    @Override
    public boolean isEmpty() {
        return size==0;
    }

    @Override
    public void add(E element) {
        add(size,element);
    }
    @Override
    public boolean contains(E element) {
        return indexOf(element) != ELEMENT_NOTFOUND;
    }
}
