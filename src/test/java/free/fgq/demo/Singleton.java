package free.fgq.demo;

/**
 * @Package: free.fgq.demo
 * @ClassName: Singleton
 * @Author: fgq
 * @Description: 单利模式的三种创建方式
 * @Date: 2019/10/28 13:09
 */
public class Singleton {
    /**
     * 饿汉
     */
    private Singleton() {

    }

    private static Singleton singleton1 = new Singleton();

    public static Singleton getInstance1() {
        return singleton1;
    }

    /**
     * 懒汉
     */
//    private Singleton() {
//
//    }
//
    private static Singleton singleton2 = null;

    public static Singleton getInstance2() {
        if (null == singleton2) {
            singleton2 = new Singleton();
        }
        return singleton2;
    }

    /**
     * 静态内部类方式
     */
//    private Singleton() {
//    }

    /**
     * 内部类创建对象
     */
    private static class SingletonHolder {// 静态内部类
        private static Singleton singleton = new Singleton();
    }

    /**
     * 获取实例
     * @return
     */
    public static Singleton getInstance3() {
        return SingletonHolder.singleton;
    }

}


