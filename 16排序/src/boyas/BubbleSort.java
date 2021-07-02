package boyas;

/**
 * @author boyas
 * @create 2021/6/28 1:11
 */
public class BubbleSort {
    public static void main(String[] args) {
        int[] array = {2, 3, 1, 5, 8, 4};
        System.out.println("排序前：");
        for (int i:array
             ) {
            System.out.print(i+" ");
        }
        System.out.println();
        //如果序列尾部已经局部有序，可以记录最后1次交换的位置，减少比较次数
        for (int j = array.length - 1; j > 0; j--) {
            //设置初始值为1，当数组完全有序的时候扫描一轮就结束
            int sortIndex = 1;
            for (int i = 1; i <= j; i++) {
                if (array[i] < array[i - 1]) {
                    int tmp = array[i - 1];
                    array[i - 1] = array[i];
                    array[i] = tmp;
                    sortIndex = i;
                }
            }
            j = sortIndex;//记录最后一次交换的记录
        }
        System.out.println("冒泡排序后：");
        for (int k = 0; k < array.length; k++) {
            System.out.print(array[k]+" ");
        }
    }
}
