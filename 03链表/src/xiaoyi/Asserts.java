package xiaoyi;

/**
 * @author boyas
 * @create 2021/6/23 9:31
 */
public class Asserts {
    public static void test(boolean value){
        try{
            if (!value)throw new Exception("测试未通过");
        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
