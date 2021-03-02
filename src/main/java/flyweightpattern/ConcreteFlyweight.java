package flyweightpattern;

/**
 * @Classname ConcreteFlyweight
 * @Description TODO
 * @Date 2021/3/2 15:56
 * @Created by sinon
 * @Author <a href="huangyanzhi@wxchina.com">Sinon</a>
 */
public class ConcreteFlyweight implements IFlyweight {
    @Override
    public void operation() {
        System.out.println("享元模式");
    }
}
