package facadepattern;

/**
 * @Classname Facade
 * @Description TODO
 * @Date 2021/2/26 13:47
 * @Created by sinon
 * @Author <a href="huangyanzhi@wxchina.com">Sinon</a>
 */
public class Facade {
    private SystemA systemA = new SystemA();
    private SystemB systemB = new SystemB();
    private SystemC systemC = new SystemC();

    //对外接口
    public void doA(){
        systemA.doA();
    }

    //对外接口
    public void doB(){
        systemB.doB();
    }

    //对外接口
    public void doC(){
        systemC.doC();
    }

}
