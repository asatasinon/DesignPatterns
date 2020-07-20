package org.example;

import Singleton.*;

/**
 * 创建人：Sinon
 * 创建时间：2020/7/20
 */
public class SingletonTest {
    public static void main(String[] args) {
        //1.懒汉式单例-非线程安全
        LazySingleton.getInstance().showMessage();

        //6.枚举式单例的使用
        EnumSingleton.INSTANCE.showMessage();
    }
}
