package xiaoyi.queue;

import java.util.Comparator;
import xiaoyi.heap.BinaryHeap;
import xiaoyi.heap.BinaryHeap;

/**
 * 二叉堆实现优先级队列
 * @author yusael
 */
public class PriorityQueue<E> {
	// 利用二叉堆实现优先级队列
	private BinaryHeap<E> heap;
	
	// 通过 comparator 自定义优先级高低
	public PriorityQueue(Comparator<E> comparator) {
		heap = new BinaryHeap<>(comparator);
	}
	
	public PriorityQueue() {
		this(null);
	}
	
	public int size() {
		return heap.size();
	}

	public boolean isEmpty() {
		return heap.isEmpty();
	}
	
	public void clear() {
		heap.clear();
	}

	public void enQueue(E element) {
		heap.add(element);
	}

	public E deQueue() {
		return heap.remove();
	}

	public E front() {
		return heap.get();
	}
}
