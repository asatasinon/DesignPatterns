package commandpattern;

/**
 * @Classname CommandDemo
 * @Description TODO
 * @Date 2021/3/31 15:08
 * @Created by sinon
 * @Author <a href="huangyanzhi@wxchina.com">Sinon</a>
 */
public class CommandDemo {
    public static void main(String[] args) {
        Stock phone = new Stock("phone");
        Stock pad = new Stock("pad");
        Stock computer = new Stock("computer");

        BuyStock buyStock1 = new BuyStock(phone);
        BuyStock buyStock2 = new BuyStock(pad);
        SellStock sellStock = new SellStock(computer);

        Broker broker = new Broker();
        broker.execute(buyStock1);

        broker.takeOrder(sellStock);
        broker.takeOrder(buyStock2);

        broker.placeOrders();


    }
}
