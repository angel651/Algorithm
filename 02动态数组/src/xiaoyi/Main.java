package xiaoyi;

//能循环利用的留下，不能循环利用的滚蛋
public class Main {
    public static void main(String[] args) {

        //new是向堆空间申请内存
      //  ArrayList list = new ArrayList();
        ArrayList<Person> list = new ArrayList<>();
//        list.add(1);
//        System.out.println(list);
//        //提醒JVM进行垃圾回收
        System.gc();
//        int[] array = new int[]{11, 22, 33};
        list.add(new Person(10,"张三"));
        list.add(new Person(20,"李四"));
        list.add(new Person(30,"王五"));
        list.clear();
        System.gc();
//        list.add(88);
//        list.add(77);
//        list.add(66);
//        list.add(55);
//        list.set(3,80);
//        System.out.println(list);
    }
}
