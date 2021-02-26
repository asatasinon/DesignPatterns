package proxypatterns.staticproxy;

/**
 * @Classname RealSubject
 * @Description TODO
 * @Date 2021/2/26 11:20
 * @Created by sinon
 * @Author <a href="huangyanzhi@wxchina.com">Sinon</a>
 */
public class RealSubject implements ISubject{

    @Override
    public void create() {
        System.out.println("created subject");
    }
}
