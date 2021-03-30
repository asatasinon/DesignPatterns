package observerpattern.javaobserver;

import java.util.Observable;
import java.util.Observer;

/**
 * @Classname Teacher
 * @Description TODO
 * @Date 2021/3/30 16:02
 * @Created by sinon
 * @Author <a href="huangyanzhi@wxchina.com">Sinon</a>
 */
public class Teacher implements Observer {
    private String teacherProject;

    public Teacher(String teacherProject) {
        this.teacherProject = teacherProject;
    }

    public String getTeacherProject() {
        return teacherProject;
    }

    public void setTeacherProject(String teacherProject) {
        this.teacherProject = teacherProject;
    }

    @Override
    public void update(Observable o, Object arg) {
        MessageBoard messageBoard = (MessageBoard) o;
        Question question = (Question) arg;
        System.out.println("===============================");
        System.out.println(teacherProject + " 老师，您好！");
        System.out.println("学生 "+ question.getStudentName() +" 在留言板上发布了一个 "+ messageBoard.getProjectName() + " 的问题，希望您能帮忙解答一下！");
        System.out.println("问题内容如下：" + question.getContent());

    }
}
