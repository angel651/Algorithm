package xiaoyi.sort.cmp;

import xiaoyi.sort.Sort;
import xiaoyi.sort.Sort;

/**
 * 冒泡排序-无优化
 */
public class BubbleSort1<T extends Comparable<T>> extends Sort<T> {
	@Override
	protected void sort() {
		for (int end = array.length - 1; end > 0; end--) {
			for (int begin = 1; begin <= end; begin++) {
				if (cmp(begin, begin - 1) < 0) {
					swap(begin, begin - 1);
				}
			}
		}
	}
}
