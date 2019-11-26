package free.fgq.demo;

import com.google.common.base.Function;

import java.text.DateFormat;

/**
 * @Package: free.fgq.demo
 * @ClassName: GetSingleton
 * @Author: fgq
 * @Description: 测试获取单例的几种方式
 * @Date: 2019/10/28 13:21
 */
public class GetSingleton {
    public static void main(String[] args) throws ClassNotFoundException {
//        Singleton instance = Singleton.getInstance1();
//        Singleton instance2 = Singleton.getInstance2();
//        Singleton instance3 = Singleton.getInstance3();
//        System.err.println(instance.toString());
//        System.err.println(instance2.toString());
//        System.err.println(instance3.toString());
//
//        Class<?> aClass = Class.forName("free.fgq.demo.GetSingleton");
//        System.err.println(aClass.getClasses());
//
//        ClassLoader systemClassLoader = ClassLoader.getSystemClassLoader();
//        systemClassLoader.clearAssertionStatus();
//        System.err.println(systemClassLoader);
//
//
//        DateFormat df = DateFormat.getDateInstance();

        /**
         * test
         */
        String s = "abcdef";
        Function<String, Object> stringObjectFunction = (String ss) -> s.length();
        boolean aaaa = stringObjectFunction.equals("abcdef");
        if (aaaa) {
            System.err.println("hahha");
        }else if (false){
            System.err.println("hfefefe");
        }
        Runnable runnable = () -> {
            System.err.println("helloweole");
        };
        runnable.run();


        Runnable r1 = () -> System.out.println("Hello World1");
        Runnable r3 = new Runnable() {
            @Override
            public void run() {
                System.err.println("匿名内部类实现");
            }
        };
        Runnable r2 = new Runnable() {
            @Override
            public void run() {
                System.out.println("Hello World2");
            }
        };

        process(r1);
        process(r2);
        process(() -> System.out.println("Hello World3"));

    }

    public static void process(Runnable r) {
        r.run();
    }

}
