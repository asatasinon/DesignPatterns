package org.example;

import factorypatterns.factorymethod.INote;
import factorypatterns.factorymethod.INoteFactory;
import factorypatterns.factorymethod.JavaFactory;


/**
 * @Classname FactoryTest2
 * @Description TODO
 * @Date 2021/2/26 9:51
 * @Created by sinon
 * @Author <a href="huangyanzhi@wxchina.com">Sinon</a>
 */
public class FactoryTest2 {
    public static void main(String[] args) {
        INoteFactory factory = new JavaFactory();
        INote note = factory.createNote();
        note.writeNote();
    }
}
