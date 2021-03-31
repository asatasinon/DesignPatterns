package visitorpattern;

/**
 * @Classname CEOVisitor
 * @Description TODO
 * @Date 2021/3/31 10:14
 * @Created by sinon
 * @Author <a href="huangyanzhi@wxchina.com">Sinon</a>
 */
public class CEOVisitor implements IVisitor {
    @Override
    public void visit(Engineer engineer) {
        System.out.println(engineer.getEmployeeName() + ": kpi" + engineer.getKpi());
    }

    @Override
    public void visit(Manager manager) {
        System.out.println(manager.getEmployeeName() + ": kpi" + manager.getKpi());
    }
}
