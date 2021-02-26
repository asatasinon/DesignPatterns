package decoratorpattern;

/**
 * @Classname House
 * @Description TODO
 * @Date 2021/2/26 14:11
 * @Created by sinon
 * @Author <a href="huangyanzhi@wxchina.com">Sinon</a>
 */
public abstract class House {
    private String decorate;
    private double money;

    public House(){
        decorate = "";
        money = 0;
    }

    public String getDecorate() {
        return decorate;
    }

    public void setDecorate(String decorate) {
        this.decorate = decorate;
    }

    public double getMoney() {
        return money;
    }

    public void setMoney(double money) {
        this.money = money;
    }

    public abstract void decorateHouse();
    public abstract void payMoney();

}
