package xiaoyi;

// 斐波那契数列
// 0 1 2 3 4 5 6
// 0 1 1 2 3 5 8...
public class FIB {
    public static void main(String[] args) {
        int n = 45;
        TimeTools.check("fib1", new TimeTools.Task() {
            @Override
            public void execute() {
                System.out.println(fib1(n));
            }
        });
        TimeTools.check("fib2", new TimeTools.Task() {
            @Override
            public void execute() {
                System.out.println(fib2(n));
            }
        });
    }

    public static int fib1(int n) {
        //n<=1，第一个数和第二个数都是本身
        if (n <= 1) return n;
        //采用递归，所要的值就是前面两个数之和
        return fib1(n - 1) + fib1(n - 2);
    }

    public static int fib2(int n) {
        if (n <= 1) return n;
        int first = 0;
        int second = 1;
        //当求第n(n>1)个数的值，要加n-1次
        for (int i = 0; i < n - 1; i++) {
            int sum = first + second;
            first = second;//上一次相加的第二个数是下一次相加的第一个数
            second = sum;//上一次相加的两个数之和是下一次相加的第二个数
        }
        return second;
    }

    public static void test(int n) {
        //执行次数为1，时间复杂度为O(1)
        if (n > 10) {
            System.out.println("n>10");
        } else if (n > 5) {
            System.out.println("n>5");
        } else {
            System.out.println("n<=5");
        }
    }

    public static void test2(int n) {
        //执行次数1+3n，时间复杂度为O(N)
        for (int i = 0; i < n; i++) {
            System.out.println("test");
        }
    }

    public static void test3(int n) {
        //执行次数为3n^2+3n+1，时间复杂度为O(n^2)
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.println("test");
            }
        }
    }

    public static void test4(int n) {
        //执行次数为48n+1，时间复杂度为O(N)
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < 15; j++) {
                System.out.println("test");
            }
        }
    }

    public static void test5(int n) {
        //执行次数为log2(n)，时间复杂度为O(logn)
        while ((n = n / 2) > 0) {
            System.out.println("test");
        }
    }

    public static void test6(int n) {
        //执行次数1+3log2(n)+2*nlog2(n)，时间复杂度为O(nlogn)
        for (int i = 1; i < n; i = i * 2) {
            for (int j = 0; j < n; j++) {
                System.out.println("test");
            }
        }
    }

}