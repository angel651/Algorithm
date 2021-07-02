package 红黑树;

/**
 * @author boyas
 * @create 2021/6/27 2:26
 */
//红黑树必须满足以下5条性质
//1.结点是RED或者BLACK
//2.根结点是BLACK
//3.叶子结点（外部结点，空结点）都是BLACK
//4.RED结点的子结点都是BLACK
// --RED结点的parent都是BLACK
// --从根结点到叶子结点的所有路径上不能有2个连续的RED结点
//从任一结点到叶子结点(null结点)的所有路径都包含相同数目的BLACK结点
//红黑树的等价变换
//红黑树和4阶B树（2-3-4树）具有等价性
//BLACK结点与它的RED子结点融合在一起，形成1个B树结点
//红黑树的BLACK结点个数与4阶B树的结点总个数相等
public class RBTree {
}
