package decoratorpattern;

/**
 * @Classname Kitchen
 * @Description TODO
 * @Date 2021/2/26 14:57
 * @Created by sinon
 * @Author <a href="huangyanzhi@wxchina.com">Sinon</a>
 */
public class KitchenDecorator extends BasicDecorator {
    public KitchenDecorator(House basicHouse) {
        super(basicHouse);
    }

    @Override
    public void decorateHouse() {
        super.setDecorate(super.getDecorate() + " + 装修厨房");
    }

    @Override
    public void payMoney() {
        super.setMoney(super.getMoney() + 13);
    }
}
