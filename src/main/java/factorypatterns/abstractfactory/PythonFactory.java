package factorypatterns.abstractfactory;

/**
 * @Classname PythonFactory
 * @Description TODO
 * @Date 2021/2/26 9:48
 * @Created by sinon
 * @Author <a href="huangyanzhi@wxchina.com">Sinon</a>
 */
public class PythonFactory implements ICourseFactory {
    @Override
    public INote createNote() {
        return new PythonNote();
    }

    @Override
    public ITest createTest() {
        return new PythonTest();
    }
}
