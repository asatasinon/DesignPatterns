package factorypatterns.abstractfactory;

/**
 * @Classname PythonNote
 * @Description TODO
 * @Date 2021/2/25 16:25
 * @Created by sinon
 * @Author <a href="huangyanzhi@wxchina.com">Sinon</a>
 */
public class PythonNote implements INote {
    @Override
    public void writeNote() {
        System.out.println("write python note");
    }
}
