package xiaoyi.sort.cmp;

import xiaoyi.sort.Sort;

/**
 * 冒泡排序-优化2
 * 如果序列尾部已经局部有序，可以记录最后1次交换的位置，减少比较次数
 */
public class BubbleSort3<T extends Comparable<T>> extends Sort<T>{
	
	@Override
	protected void sort() {
		for (int end = array.length - 1; end > 0; end--) {
			//设置初始值为1，当数组完全有序的时候扫描一轮就结束
			int sortedIndex = 1;
			for (int begin = 1; begin <= end; begin++) {
				if (cmp(begin, begin - 1) < 0) {
					swap(begin, begin - 1);
					sortedIndex = begin;
				}
			}
			end = sortedIndex;
		}
	}

}
