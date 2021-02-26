package Singleton;

/**
 * 创建人：Sinon
 * 创建时间：2021/2/26
 * <p>
 * 6.枚举式单例
 * <p>
 * 优点：写法优雅，自动支持序列化机制，绝对防止多次实例化
 * <p>
 * 缺点：与饿汉式单例差不多，也是程序初始化时就加载，但是写法更优雅
 * <p>
 * 枚举方法可以有自己的属性、方法；
 * <p>
 * 这种方式是 Effective Java 作者 Josh Bloch 提倡的方式，它不仅能避免多线程同步问题，
 * 而且还自动支持序列化机制，防止反序列化重新创建新的对象，绝对防止多次实例化。
 * 不过，由于 JDK1.5 之后才加入 enum 特性，用这种方式写不免让人感觉生疏，在实际工作中，也很少用。
 * 不能通过 reflection attack 来调用私有构造方法。
 */
public enum EnumSingleton {
    // 单枚举： 确保单例
    INSTANCE;

    private String myField = "这是枚举的属性!";

    public void showMethod() {
        System.out.println("这是枚举的方法!");
    }

    public void showMessage() {
        System.out.println("Hello EnumSingleton!");
    }
}