package decoratorpattern;

/**
 * @Classname BasicHouse
 * @Description TODO
 * @Date 2021/2/26 14:18
 * @Created by sinon
 * @Author <a href="huangyanzhi@wxchina.com">Sinon</a>
 */
public class BasicHouse extends House {

    @Override
    public void decorateHouse() {
        super.setDecorate("毛坯房");
    }

    @Override
    public void payMoney() {
        super.setMoney(100);
    }

}
