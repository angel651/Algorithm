package boyas;

/**
 * @author boyas
 * @create 2021/6/28 1:40
 */
//选择排序的交换次数要远远少于冒泡排序，平均性能优于冒泡排序
    //最好，最坏，平均时间复杂度：O(n^2)，空间复杂度：O(1)，属于稳定排序
public class SelectionSort {
    public static void main(String[] args) {
        int[] array = {2,3,1,5,7,8,6};
        System.out.println("排序前：");
        for (int i:array
             ) {
            System.out.print(i+" ");
        }
        //从序列中找出最大的那个元素，然后与最末尾的元素交换位置
        for (int i = array.length - 1; i > 0; i--) {
            int maxIndex = 0;
            for (int j = 1; j <= i; j++) {
                if (array[maxIndex] <= array[j]) {
                    maxIndex = j;
                }
            }
            int tmp = array[maxIndex];
            array[maxIndex] = array[i];
            array[i] = tmp;
        }
        System.out.println();
        System.out.println("选择排序后：");
        for (int k = 0; k < array.length; k++) {
            System.out.print(array[k]+" ");
        }
    }
}
