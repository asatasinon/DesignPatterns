package decoratorpattern;

/**
 * @Classname LivingRoomDecorator
 * @Description TODO
 * @Date 2021/2/26 14:46
 * @Created by sinon
 * @Author <a href="huangyanzhi@wxchina.com">Sinon</a>
 */
public class LivingRoomDecorator extends BasicDecorator {

    public LivingRoomDecorator(House basicHouse) {
        super(basicHouse);
    }

    @Override
    public void decorateHouse() {
        super.setDecorate(super.getDecorate() + " + 装修客厅");
    }

    @Override
    public void payMoney() {
        super.setMoney(super.getMoney() + 20);
    }
}
