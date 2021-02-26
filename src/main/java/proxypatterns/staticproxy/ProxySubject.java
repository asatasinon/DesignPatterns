package proxypatterns.staticproxy;

/**
 * @Classname ProxySubject
 * @Description TODO
 * @Date 2021/2/26 11:20
 * @Created by sinon
 * @Author <a href="huangyanzhi@wxchina.com">Sinon</a>
 */
public class ProxySubject implements ISubject {

    private ISubject iSubject;

    public ProxySubject(ISubject subject){
        this.iSubject = subject;
    }

    @Override
    public void create() {
        before();
        iSubject.create();
        after();

    }

    public void before(){
        System.out.println("before create");
    }

    public void after(){
        System.out.println("after created");
    }
}
