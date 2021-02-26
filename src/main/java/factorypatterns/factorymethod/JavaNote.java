package factorypatterns.factorymethod;

/**
 * @Classname JavaBook
 * @Description TODO
 * @Date 2021/2/25 16:24
 * @Created by sinon
 * @Author <a href="huangyanzhi@wxchina.com">Sinon</a>
 */
public class JavaNote implements INote {
    @Override
    public void writeNote() {
        System.out.println("write java note");
    }
}
