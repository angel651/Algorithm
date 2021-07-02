package boyas;

/**
 * @author boyas
 * @create 2021/7/2 16:44
 */
//堆排序可以认为是对选择排序的一种优化
//1.对序列进行原地建堆
//2.重复执行以下操作，直到堆的元素数量为1
//3.交换堆顶元素与尾元素
//4.对0位置进行1次siftDown操作
public class HeapSort {
    public static void main(String[] args) {
        int arr[] = {2,3,1,5,4,7,9,0,8,6};
        heapSort(arr);
        System.out.println("堆排序后：");
        for (int i : arr) {
            System.out.print( i+" ");
        }
    }

    private static void heapSort(int[] arr) {
        //原地建堆
        for (int i = (arr.length - 1) / 2; i >= 0; i--) {
            //从第一个非叶子结点从下至上，从右至左调整结构
            adjustHeap(arr, i, arr.length);
        }
        System.out.println("初始化堆：");
        for (int i : arr) {
            System.out.print( i+" ");
        }
        System.out.println();
        for (int i = arr.length - 1; i > 0; i--) {
            //交换堆顶元素与尾元素
            int temp = arr[i];
            arr[i] = arr[0];
            arr[0] = temp;
            //重新对堆进行调整
            adjustHeap(arr, 0, i);
        }
    }

    private static void adjustHeap(int[] arr, int parent, int length) {
        //temp作为父结点
        int temp = arr[parent];
        //左孩子结点
        int lChild = 2 * parent + 1;
        while (lChild < length) {
            //右孩子结点
            int rChild = lChild + 1;
            //如果有右孩子结点，且右孩子结点的值大于左孩子结点的值，选右孩子结点
            if (rChild < length && arr[lChild] < arr[rChild]) {
                lChild++;
            }
            //如果父结点的值已经大于孩子结点的值，则直接结束
            if (temp >= arr[lChild]) {
                break;
            }
            //把孩子结点的值赋给父结点
            arr[parent] = arr[lChild];
            //选取孩子结点的左孩子结点，继续向下筛选
            parent = lChild;
            lChild = 2 * lChild + 1;
        }
        arr[parent] = temp;
    }
}
