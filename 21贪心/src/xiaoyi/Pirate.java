package xiaoyi;

import java.util.Arrays;

/**
 * 有一天，海盗们截获了一艘装满各种各样古董的货船，每一件古董都价值连城，一旦打碎就失去了它的价值
 * 海盗船的载重量为 W，每件古董的重量为 𝑤i，海盗们该如何把尽可能多数量的古董装上海盗船？
 * 比如 W 为 30，Wi 分别为 3、5、4、10、7、14、2、11
 */
public class Pirate {
	public static void main(String[] args) {
		int[] weights = {3, 5, 4, 10, 7, 14, 2, 11};
		Arrays.sort(weights); // 排序, 默认从小到大

		int capacity = 30; // 最大容量
		int weight = 0, count = 0;
		// 每次优先选择重量最小的古董
		for (int i = 0; i < weights.length && weight < capacity; i++) {
			int newWeight = weights[i] + weight;
			if (newWeight <= capacity) {
				weight = newWeight;
				count++;
				System.out.println(weights[i]);
			}
		}
		System.out.println("最多装了" + count + "件古董。");
	}
}
