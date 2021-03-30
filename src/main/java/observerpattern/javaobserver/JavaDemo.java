package observerpattern.javaobserver;

/**
 * @Classname JavaDemo
 * @Description TODO
 * @Date 2021/3/30 16:08
 * @Created by sinon
 * @Author <a href="huangyanzhi@wxchina.com">Sinon</a>
 */
public class JavaDemo {
    public static void main(String[] args) {
        MessageBoard messageBoard = new MessageBoard();
        messageBoard.setProjectName("数学");

        Teacher teacher1 = new Teacher("asina");
        Teacher teacher2 = new Teacher("kirito");

        messageBoard.addObserver(teacher1);
        messageBoard.addObserver(teacher2);

        Question question = new Question();
        question.setStudentName("sinon");
        question.setContent("1 + 1 = ?");

        messageBoard.publishQuestion(question);
    }
}
