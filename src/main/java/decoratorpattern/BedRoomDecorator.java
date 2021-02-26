package decoratorpattern;

/**
 * @Classname BedRoomDecorator
 * @Description TODO
 * @Date 2021/2/26 14:59
 * @Created by sinon
 * @Author <a href="huangyanzhi@wxchina.com">Sinon</a>
 */
public class BedRoomDecorator extends BasicDecorator {
    public BedRoomDecorator(House basicHouse) {
        super(basicHouse);
    }

    @Override
    public void decorateHouse() {
        super.setDecorate(super.getDecorate() + " + 装修睡房");
    }

    @Override
    public void payMoney() {
        super.setMoney(super.getMoney() + 15);
    }
}