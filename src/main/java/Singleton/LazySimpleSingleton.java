package Singleton;

/**
 * 创建人：Sinon
 * 创建时间：2020/7/20
 * <p>
 * 1.懒汉式单例-非线程安全版
 * <p>
 * 优点：懒加载（第一次调用才初始化），避免内存浪费
 * <p>
 * 缺点：非线程安全，在多线程不能正常工作。
 * 可以被 序列化+反序列化 破坏单例，即：json转换
 */
public class LazySimpleSingleton {

    private static LazySimpleSingleton instance;

    private LazySimpleSingleton() {
    }

    /**
     * 多线程情况下，如有线程1、线程2，两个线程，假定：1先进，2后进，会有3种结果：
     * <p>
     * 1. 顺序执行，线程1执行完了再执行线程2，线程2无法进去生成实例的方法，只有一个线程1的实例，这个是正常的结果；
     * <p>
     * 2. 线程2的实例覆盖线程1的实例：线程1、2同时进去生成实例的方法，线程1先生成，但还未return，线程2后生成，然后再返回线程的1、2，最终只有一个实例,，由线程2生成；
     * <p>
     * 3. 线程1与线程2各有一个实例化的类，线程1、2同时进去实例化的方法，线程1生成并返回了实例1，线程2生成并返回了实例2
     */
    public static LazySimpleSingleton getInstance() {
        if (instance == null) {
            instance = new LazySimpleSingleton();
        }
        return instance;
    }


    public void showMessage() {
        System.out.println("Hello LazySingleton!");
    }

}
