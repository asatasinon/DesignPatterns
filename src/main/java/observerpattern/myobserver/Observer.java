package observerpattern.myobserver;

/**
 * @Classname Observer
 * @Description TODO
 * @Date 2021/3/30 15:31
 * @Created by sinon
 * @Author <a href="huangyanzhi@wxchina.com">Sinon</a>
 */
public abstract class Observer {
    protected Subject subject;

    public abstract void update();
}
