package factorypatterns.factorymethod;

/**
 * @Classname PythonFactory
 * @Description TODO
 * @Date 2021/2/26 9:48
 * @Created by sinon
 * @Author <a href="huangyanzhi@wxchina.com">Sinon</a>
 */
public class PythonFactory implements INoteFactory {
    @Override
    public INote createNote() {
        return new PythonNote();
    }
}
