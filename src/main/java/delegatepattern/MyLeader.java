package delegatepattern;

import java.util.HashMap;
import java.util.Map;

/**
 * @Classname MyLeader
 * @Description TODO
 * @Date 2021/3/2 9:57
 * @Created by sinon
 * @Author <a href="huangyanzhi@wxchina.com">Sinon</a>
 */
public class MyLeader extends AbstractEmployee {

    private Map<String, AbstractEmployee> employeeMap = new HashMap<>();
    public MyLeader(){
        employeeMap.put("web", new EmployeeJava());
        employeeMap.put("spider", new EmployeePython());
    }

    @Override
    public void doTask(String task) {
        if(!employeeMap.containsKey(task)){
            System.out.println( "sorry! we have not employee to do " + task);
            return;
        }
        employeeMap.get(task).doTask(task);
    }
}
