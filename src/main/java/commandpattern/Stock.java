package commandpattern;

import java.util.Random;

/**
 * @Classname Stock
 * @Description TODO
 * @Date 2021/3/31 14:55
 * @Created by sinon
 * @Author <a href="huangyanzhi@wxchina.com">Sinon</a>
 */
public class Stock {
    private String name;
    private int quantity;

    public Stock(String name) {
        this.name = name;
        quantity = new Random().nextInt(100);
    }

    public void buy() {
        System.out.println("Stock [ Name: " + name + ", Quantity: " + quantity + " ] bought");
    }

    public void sell() {
        System.out.println("Stock [ Name: " + name + ", Quantity: " + quantity + " ] sold");
    }

}
