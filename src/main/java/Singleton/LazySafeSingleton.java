package Singleton;

/**
 * 创建人：Sinon
 * 创建时间：2021/2/26
 * <p>
 * 2.懒汉式单例-线程安全版
 * <p>
 * 优点：懒加载（第一次调用才初始化），避免内存浪费，线程安全
 * <p>
 * 缺点：性能效率低
 * 可以被 序列化+反序列化 破坏单例，即：json转换
 */
public class LazySafeSingleton {

    private static LazySafeSingleton instance;

    private LazySafeSingleton() {
    }

    public static synchronized LazySafeSingleton getInstance() {
        if (instance == null) {
            instance = new LazySafeSingleton();
        }
        return instance;
    }

    public void showMessage() {
        System.out.println("Hello LazySafeSingleton!");
    }

}
