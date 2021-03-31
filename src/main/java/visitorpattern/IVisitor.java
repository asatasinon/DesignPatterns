package visitorpattern;

/**
 * @Classname IVisitor
 * @Description TODO
 * @Date 2021/3/31 10:06
 * @Created by sinon
 * @Author <a href="huangyanzhi@wxchina.com">Sinon</a>
 */
public interface IVisitor {
    void visit(Manager manager);
    void visit(Engineer engineer);
}
