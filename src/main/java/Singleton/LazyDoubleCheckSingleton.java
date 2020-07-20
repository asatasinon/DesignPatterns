package Singleton;

/**
 * 创建人：Sinon
 * 创建时间：2020/7/20
 * <p>
 * 3.懒汉式单例-双重校验版
 * 双重校验锁（DCL，即 double-checked locking）
 * <p>
 * 优点：懒加载（第一次调用才初始化），避免内存浪费，线程安全，能保持高性能
 * <p>
 * 缺点：代码不优雅
 */
public class LazyDoubleCheckSingleton {
    //volatile 解决指令重排序
    private volatile static LazyDoubleCheckSingleton instance;

    private LazyDoubleCheckSingleton() {
    }

     /*
    // 可以通过报错禁止调用构造方法
    private LazyDoubleCheckSingleton(){
        if(this.instance != null){
            throw new RuntimeException("请不要使用反射调用privte构造方法！");
        }
    }
    */


    public static LazyDoubleCheckSingleton getInstance() {
        //检查是否需要阻塞线程
        if (instance == null) {
            synchronized (LazyDoubleCheckSingleton.class) {
                //检查是否需要赋值
                if (instance == null) {
                    instance = new LazyDoubleCheckSingleton();
                }
            }
        }
        return instance;
    }

    public void showMessage() {
        System.out.println("Hello LazyDoubleCheckSingleton!");
    }
}
