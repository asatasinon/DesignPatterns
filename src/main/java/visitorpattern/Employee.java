package visitorpattern;

import java.util.Random;

/**
 * @Classname Employee
 * @Description TODO
 * @Date 2021/3/31 10:06
 * @Created by sinon
 * @Author <a href="huangyanzhi@wxchina.com">Sinon</a>
 */
public abstract class Employee {
    private String employeeName;
    private int kpi;

    public Employee(String employeeName) {
        this.employeeName = employeeName;
        kpi = new Random().nextInt(100);
    }

    //核心代码
    public abstract void accept(IVisitor visitor);

    @Override
    public String toString() {
        return "Employee{" +
                "employeeName='" + employeeName + '\'' +
                ", kpi=" + kpi +
                '}';
    }

    public String getEmployeeName() {
        return employeeName;
    }

    public int getKpi() {
        return kpi;
    }
}
