package decoratorpattern;

/**
 * @Classname DecorateLivingRoom
 * @Description TODO
 * @Date 2021/2/26 14:34
 * @Created by sinon
 * @Author <a href="huangyanzhi@wxchina.com">Sinon</a>
 */
public class BasicDecorator extends BasicHouse {

    private House house;

    public BasicDecorator(House house) {
        this.house = house;
    }

    @Override
    public void decorateHouse() {
        house.decorateHouse();
    }

    @Override
    public void payMoney() {
        house.payMoney();
    }

    @Override
    public String getDecorate() {
        return house.getDecorate();
    }

    @Override
    public double getMoney() {
        return house.getMoney();
    }

    @Override
    public void setDecorate(String decorate) {
        house.setDecorate(decorate);
    }

    @Override
    public void setMoney(double money) {
        house.setMoney(money);
    }

}
