package org.example;

import factorypatterns.abstractfactory.ICourseFactory;
import factorypatterns.abstractfactory.INote;
import factorypatterns.abstractfactory.ITest;
import factorypatterns.abstractfactory.JavaFactory;

/**
 * @Classname FactoryTest3
 * @Description TODO
 * @Date 2021/2/26 10:05
 * @Created by sinon
 * @Author <a href="huangyanzhi@wxchina.com">Sinon</a>
 */
public class FactoryTest3 {
    public static void main(String[] args) {
        ICourseFactory factory = new JavaFactory();

        INote note = factory.createNote();
        ITest test = factory.createTest();

        note.writeNote();
        test.Test();
    }
}
