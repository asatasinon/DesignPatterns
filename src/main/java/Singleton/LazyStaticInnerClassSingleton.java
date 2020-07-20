package Singleton;

/**
 * 创建人：Sinon
 * 创建时间：2020/7/20
 * <p>
 * 4.懒汉式单例-静态内部类版
 * java的 类初始加载：
 * 会先加载外部类，即 LazyStaticInnerClassSingleton.class
 * 但不会加载内部类，内部类的路径为：LazyStaticInnerClassSingleton$LazyHolder.class
 * <p>
 * 优点：懒加载（第一次调用才初始化），避免内存浪费，线程安全，能保持高性能
 * 缺点：能被反射破坏
 */
public class LazyStaticInnerClassSingleton {

    private LazyStaticInnerClassSingleton() {
    }

    /*
    // 可以通过报错禁止调用构造方法
    private LazyStaticInnerClassSingleton(){
        if (LazyHolder.INSTANCE != null) {
            throw new RuntimeException("请不要使用反射调用privte构造方法！");
        }
    }*/

    public static final LazyStaticInnerClassSingleton getInstance() {
        return LazyHolder.INSTANCE;
    }

    private static class LazyHolder {
        private static final LazyStaticInnerClassSingleton INSTANCE = new LazyStaticInnerClassSingleton();
    }

    public void showMessage() {
        System.out.println("Hello LazyStaticInnerClassSingleton!");
    }
}
