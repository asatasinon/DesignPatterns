package factorypatterns.simplefactory;

/**
 * @Classname NoteFactory
 * @Description TODO
 * @Date 2021/2/25 16:27
 * @Created by sinon
 * @Author <a href="huangyanzhi@wxchina.com">Sinon</a>
 */
public class NoteFactory {
    public  INote createNote(String name){
        if("java".equals(name)){
            return new JavaNote();
        }else {
            return new PythonNote();
        }
    }
}
