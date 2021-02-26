package factorypatterns.abstractfactory;

/**
 * @Classname JavaFactory
 * @Description TODO
 * @Date 2021/2/26 9:48
 * @Created by sinon
 * @Author <a href="huangyanzhi@wxchina.com">Sinon</a>
 */
public class JavaFactory implements ICourseFactory {
    @Override
    public INote createNote() {
        return new JavaNote();
    }

    @Override
    public ITest createTest() {
        return new JavaTest();
    }
}
