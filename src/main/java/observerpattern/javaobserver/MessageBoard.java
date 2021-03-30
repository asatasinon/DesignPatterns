package observerpattern.javaobserver;

import java.util.Observable;

/**
 * @Classname Student
 * @Description TODO
 * @Date 2021/3/30 15:54
 * @Created by sinon
 * @Author <a href="huangyanzhi@wxchina.com">Sinon</a>
 */
public class MessageBoard extends Observable {
    private String projectName;

    public String getProjectName() {
        return projectName;
    }

    public void setProjectName(String projectName) {
        this.projectName = projectName;
    }

    public void publishQuestion(Question question){
        System.out.println( question.getStudentName() +" 提问了一个 " + this.projectName + " 问题：" + question.getContent());
        setChanged();
        notifyObservers(question);
    }
}
