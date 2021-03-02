package delegatepattern;

/**
 * @Classname ConcreteTaskA
 * @Description TODO
 * @Date 2021/3/1 10:53
 * @Created by sinon
 * @Author <a href="huangyanzhi@wxchina.com">Sinon</a>
 */
public class EmployeeJava extends AbstractEmployee {
    @Override
    public void doTask(String task) {
        System.out.println("do " + task + " by java");
    }
}
