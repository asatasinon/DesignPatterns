package org.example;


import factorypatterns.simplefactory.INote;
import factorypatterns.simplefactory.NoteFactory;

/**
 * @Classname FactoryTest
 * @Description TODO
 * @Date 2021/2/25 16:46
 * @Created by sinon
 * @Author <a href="huangyanzhi@wxchina.com">Sinon</a>
 */
public class FactoryTest {
    public static void main(String[] args) {
        NoteFactory factory = new NoteFactory();
        INote note = factory.createNote("java");
        note.writeNote();

    }

}
