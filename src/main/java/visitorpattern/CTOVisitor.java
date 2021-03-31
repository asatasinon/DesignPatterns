package visitorpattern;

/**
 * @Classname CTOVisitor
 * @Description TODO
 * @Date 2021/3/31 10:37
 * @Created by sinon
 * @Author <a href="huangyanzhi@wxchina.com">Sinon</a>
 */
public class CTOVisitor implements IVisitor {
    @Override
    public void visit(Manager manager) {
        System.out.println(manager.toString());
    }

    @Override
    public void visit(Engineer engineer) {
        System.out.println(engineer.toString());
    }
}
