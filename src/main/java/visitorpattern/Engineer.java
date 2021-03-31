package visitorpattern;

import java.util.Random;

/**
 * @Classname Engineer
 * @Description TODO
 * @Date 2021/3/31 10:09
 * @Created by sinon
 * @Author <a href="huangyanzhi@wxchina.com">Sinon</a>
 */
public class Engineer extends Employee {

    private int codeLines;

    public Engineer(String employeeName) {
        super(employeeName);
        codeLines = new Random().nextInt(100) * 100;
    }

    @Override
    public void accept(IVisitor visitor) {
        visitor.visit(this);
    }

    public int getCodeLines() {
        return codeLines;
    }

    public void setCodeLines(int codeLines) {
        this.codeLines = codeLines;
    }

    @Override
    public String toString() {
        return super.toString() + ", job is Engineer{" +
                "codeLines=" + codeLines +
                '}';
    }
}
