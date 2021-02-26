package Singleton;

/**
 * 创建人：Sinon
 * 创建时间：2021/2/26
 * <p>
 * 5.饿汉式单例
 * <p>
 * 优点：
 * 执行效率高，性能好，没有任何的锁，线程安全。
 * <p>
 * 缺点：
 * 1.在某些特殊情况下，可能会造成内存浪费（系统的类过多的情况下，极端一点：几万个类）；
 * 2.可以被 反射 绕过 普通类的 private 构造方法 从而创建出多个实例；
 * 3.可以被 序列化+反序列化 破坏单例，即：json转换
 * <p>
 * java 类的加载顺序：
 * 先 静态 后 动态
 * 从 上 往 下
 * 先 属性 后 方法
 */
public class HungrySingleton {
    //创建 一个 静态的 HungrySingleton 对象
    private static final HungrySingleton instance = new HungrySingleton();

    //让构造函数为 private，这样该类就不会被实例化，但可以被反射绕过private，从而多实例化
    //下面的构造方法可以禁止调用
    private HungrySingleton() {
    }

    /*
    // 可以通过报错禁止调用构造方法
    private HungrySingleton(){
        throw new RuntimeException("请不要使用反射调用privte构造方法！");
    }
    */

    //获取唯一可用的对象
    public static HungrySingleton getInstance() {
        return instance;
    }

    public void showMessage() {
        System.out.println("Hello HungrySingleton!");
    }
}
