package free.fgq.demo;

/**
 * @Package: free.fgq.demo
 * @ClassName: GetSingleton
 * @Author: fgq
 * @Description: 测试获取单例的几种方式
 * @Date: 2019/10/28 13:21
 */
public class GetSingleton {
    public static void main(String[] args) {
        Singleton instance = Singleton.getInstance1();
        Singleton instance2 = Singleton.getInstance2();
        Singleton instance3 = Singleton.getInstance3();
        System.err.println(instance.toString());
        System.err.println(instance2.toString());
        System.err.println(instance3.toString());
    }
}
