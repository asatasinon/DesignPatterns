package visitorpattern;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

/**
 * @Classname BussinessReport
 * @Description TODO
 * @Date 2021/3/31 10:20
 * @Created by sinon
 * @Author <a href="huangyanzhi@wxchina.com">Sinon</a>
 */
public class BussinessReport {
    private List<Employee> employeeList = new ArrayList<>();

    public BussinessReport() {
        this.employeeList.add(new Engineer("工程师 - 1"));
        this.employeeList.add(new Engineer("工程师 - 2"));
        this.employeeList.add(new Engineer("工程师 - 3"));
        this.employeeList.add(new Engineer("工程师 - 4"));
        this.employeeList.add(new Engineer("工程师 - 5"));
        this.employeeList.add(new Manager("项目管理 - 1"));
        this.employeeList.add(new Manager("项目管理 - 2"));
    }

    public void showReport(IVisitor visitor){
        for (Employee employee : employeeList){
            employee.accept(visitor);
        }
    }
}
