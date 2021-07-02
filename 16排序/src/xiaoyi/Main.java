package xiaoyi;

import java.util.Arrays;

import xiaoyi.sort.CountingSort;
import xiaoyi.sort.RadixSort;
import xiaoyi.sort.Sort;
import xiaoyi.sort.cmp.BubbleSort1;
import xiaoyi.sort.cmp.BubbleSort2;
import xiaoyi.sort.cmp.BubbleSort3;
import xiaoyi.sort.cmp.HeapSort;
import xiaoyi.sort.cmp.InsertionSort1;
import xiaoyi.sort.cmp.InsertionSort2;
import xiaoyi.sort.cmp.InsertionSort3;
import xiaoyi.sort.cmp.MergeSort;
import xiaoyi.sort.cmp.QuickSort;
import xiaoyi.sort.cmp.SelectionSort;
import xiaoyi.sort.cmp.ShellSort;
import xiaoyi.tools.Asserts;
import xiaoyi.tools.Integers;
import xiaoyi.tools.Integers;

@SuppressWarnings({ "rawtypes", "unchecked" })
public class Main {
	public static void main(String[] args) {
		
//		int[] array1 = {2, 4, 8, 8, 8, 12, 14};
//		Asserts.test(BinarySearch.search(array1, 5)==2);
//		Asserts.test(BinarySearch.search(array1, 1)==0);
//		Asserts.test(BinarySearch.search(array1, 15)==7);
//		Asserts.test(BinarySearch.search(array1, 8)==5);
		
//		Integer[] array = Integers.random(10000, 1, 10000);	
		Integer[] array = Integers.random(100000, 1, 10000);
//		Integer[] array = {5,4,8,9,1,6,8,2};
		testSorts(array, 
//				new BubbleSort1(),		// 冒泡排序
//				new BubbleSort2(),		// 冒泡排序-优化1
//				new BubbleSort3(),		// 冒泡排序-优化2
//				new SelectionSort(), 	// 选择排序
				new HeapSort(),  		// 堆排序
//				new InsertionSort1(),   // 插入排序
//				new InsertionSort2(), 	// 插入排序-挪动优化
				new InsertionSort3(),	// 插入排序-二分查找优化
				new MergeSort(), 		// 归并排序
				new QuickSort(),     	// 快速排序
				new ShellSort()		// 希尔排序
//				new CountingSort(),		// 计数排序
//				new RadixSort()			// 基数排序
				);
	}
	
	static void testSorts(Integer[] array, Sort... sorts) {
		for (Sort sort : sorts) {
			Integer[] newArray = Integers.copy(array);
			sort.sort(newArray);
			Asserts.test(Integers.isAscOrder(newArray));
		}
		Arrays.sort(sorts);
		for (Sort sort : sorts) {
			System.out.println(sort);
		}
	}

}
