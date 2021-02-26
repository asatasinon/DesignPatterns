package org.example;

import Singleton.*;

/**
 * 创建人：Sinon
 * 创建时间：2021/2/26
 */
public class SingletonTest {
    public static void main(String[] args) {
        //1.懒汉式单例-非线程安全
        //LazySingleton.getInstance().showMessage();
        //测试是否线程安全，如果不安全，则会有不同的实例出现，如果电脑的性能比较好，可以将 10 -> 20+
        //如果线程安全，则所有的实例都是一致的
        for(int i = 0; i<10;i++){
            new Thread(()->{
                System.out.println(LazySimpleSingleton.getInstance());
            }).start();
        }

        //2.懒汉式单例-线程安全
        //LazySafeSingleton.getInstance().showMessage();
        for(int i = 0; i<10;i++){
            new Thread(()->{
                System.out.println(LazySafeSingleton.getInstance());
            }).start();
        }

        //3.懒汉式单例-双校验
        //LazyDoubleCheckSingleton.getInstance().showMessage();
        for(int i = 0; i<10;i++){
            new Thread(()->{
                System.out.println(LazyDoubleCheckSingleton.getInstance());
            }).start();
        }

        //4.懒汉式单例-静态内部类
        //LazyStaticInnerClassSingleton.getInstance().showMessage();
        for(int i = 0; i<10;i++){
            new Thread(()->{
                System.out.println(LazyStaticInnerClassSingleton.getInstance());
            }).start();
        }

        //5.饿汉式单例
        //HungrySingleton.getInstance().showMessage();
        for(int i = 0; i<10;i++){
            new Thread(()->{
                System.out.println(HungrySingleton.getInstance());
            }).start();
        }

        //6.枚举式单例的使用
        //EnumSingleton.INSTANCE.showMessage();
        for(int i = 0; i<10;i++){
            new Thread(()->{
                System.out.println(EnumSingleton.INSTANCE);
            }).start();
        }

    }
}
