package visitorpattern;

/**
 * @Classname VisitorDemo
 * @Description TODO
 * @Date 2021/3/31 10:19
 * @Created by sinon
 * @Author <a href="huangyanzhi@wxchina.com">Sinon</a>
 */
public class VisitorDemo {

    public static void main(String[] args) {
        BussinessReport bussinessReport = new BussinessReport();
        bussinessReport.showReport(new CEOVisitor());
        bussinessReport.showReport(new CTOVisitor());

    }
}
