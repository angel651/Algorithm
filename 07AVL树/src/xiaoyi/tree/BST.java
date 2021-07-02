package xiaoyi.tree;

import java.util.Comparator;
/**
 * 二叉搜索树
 */
@SuppressWarnings("unchecked")
public class BST<E> extends BinaryTree<E> {
	
	// 比较器，根据传入的比较器实现 compareTo() 方法
	private Comparator<E> comparator;
	
	public BST (Comparator<E> comparator){ // 可以传一个比较器
		this.comparator = comparator;
	}
	public BST(){ // 不传比较器，相当于传入一个 null
		this(null); //
	}
	
	/**
	 * 添加元素
	 */
	public void add(E element) {
		elementNotNullCheck(element); // 不能传入空节点
		// 传入第一个节点
		if(root == null){
			root = createNode(element, null);
			size++;
			// 新添加节点之后的处理
			afterAdd(root);
			return;
		}
		// 添加的不是第一个节点
		// 找到父节点
		Node<E> parent = root;
		Node<E> node = root;
		int cmp = 0;
		do {
			cmp = compareTo(node.element, element); // 方向
			parent = node; // 父节点
			if(cmp < 0){
				node = node.right;
			}else if(cmp > 0){
				node = node.left;
			}else{ // 相等，最好是覆盖掉，也可以采取其他操作，看具体需求
				node.element = element;
				return;
			}
		} while (node != null);
		// 插入到父节点的哪个位置
		Node<E> newNode = createNode(element, parent);
		if(cmp < 0){
			parent.right = newNode;
		}else{
			parent.left = newNode;
		}
		size++;
		
		// 新添加节点之后的处理
		afterAdd(newNode);
	}
	/**
	 * 根据传入的值删除元素
	 */
	public void remove(E element) {
		remove(node(element));
	}
	// 根据节点删除元素
	private void remove(Node<E> node) {
		if (node == null) return;
		
		size--;
		
		if (node.hasTwoChildren()) { // 度为2的节点
			// 找到后继节点
			Node<E> s = successor(node);
			// 用后继节点的值覆盖度为2的节点的值
			node.element = s.element;
			// 删除后继节点
			node = s;
		}
		
		// 删除node节点（node的度必然是1或者0）
		Node<E> replacement = node.left != null ? node.left : node.right;
		
		if (replacement != null) { // node是度为1的节点
			// 更改parent
			replacement.parent = node.parent;
			// 更改parent的left、right的指向
			if (node.parent == null) { // node是度为1的节点并且是根节点
				root = replacement;
			} else if (node == node.parent.left) {
				node.parent.left = replacement;
			} else { // node == node.parent.right
				node.parent.right = replacement;
			}
			
			// 删除节点后的调整
			afterRemove(node);
		} else if (node.parent == null) { // node是叶子节点并且是根节点
			root = null;
			
			// 删除节点后的调整
			afterRemove(node);
		} else { // node是叶子节点，但不是根节点
			if (node == node.parent.left) {
				node.parent.left = null;
			} else { // node == node.parent.right
				node.parent.right = null;
			}
			
			// 删除节点后的调整
			afterRemove(node);
		}
	}
	/**
	 * 添加node之后的调整
	 */
	protected void afterAdd(Node<E> node){}
	/**
	 * 删除node之后的调整
	 */
	protected void afterRemove(Node<E> node){}
	
	// 根据元素值获取节点元素
	private Node<E> node(E element){
		elementNotNullCheck(element);
		
		Node<E> node = root;
		while(node != null){
			int cmp = compareTo(element, node.element);
			if(cmp < 0){
				node = node.left;
			}else if (cmp > 0){
				node = node.right;
			}else{ // cmp == 0
				return node;
			}
		}
		return null;
	}
	// 节点元素比较
	private int compareTo(E e1, E e2) {
		if (comparator != null) { // 传入比较器则通过比较器比较
			return comparator.compare(e1, e2);
		}
		// 没传比较器，元素内部必须自行实现了 Comparable 接口
		return ((Comparable<E>)e1).compareTo(e2);
	}
	// 检测传入的节点是否为空
	private void elementNotNullCheck(E element) {
		if (element == null) { // 不能传入空节点
			throw new IllegalArgumentException("element must not null");
		}
	}
	
}
