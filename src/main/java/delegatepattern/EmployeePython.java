package delegatepattern;

/**
 * @Classname ConcreteTaskB
 * @Description TODO
 * @Date 2021/3/2 9:54
 * @Created by sinon
 * @Author <a href="huangyanzhi@wxchina.com">Sinon</a>
 */
public class EmployeePython extends AbstractEmployee {
    @Override
    public void doTask(String task) {
        System.out.println("do " + task + " by python");
    }
}