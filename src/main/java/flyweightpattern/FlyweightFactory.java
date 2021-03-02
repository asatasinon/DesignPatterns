package flyweightpattern;

/**
 * @Classname FlyweiightFactory
 * @Description TODO
 * @Date 2021/3/2 15:57
 * @Created by sinon
 * @Author <a href="huangyanzhi@wxchina.com">Sinon</a>
 */
public class FlyweightFactory {

    public static IFlyweight getFlyweight(){
        return new ConcreteFlyweight();
    }
}
