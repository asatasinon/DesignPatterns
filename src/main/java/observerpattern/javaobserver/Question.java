package observerpattern.javaobserver;

/**
 * @Classname Question
 * @Description TODO
 * @Date 2021/3/30 15:59
 * @Created by sinon
 * @Author <a href="huangyanzhi@wxchina.com">Sinon</a>
 */
public class Question {
    private String studentName;
    private String content;

    public String getStudentName() {
        return studentName;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }
}
