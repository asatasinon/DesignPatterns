package commandpattern;

import java.util.ArrayList;
import java.util.List;

/**
 * @Classname Broker
 * @Description TODO
 * @Date 2021/3/31 14:58
 * @Created by sinon
 * @Author <a href="huangyanzhi@wxchina.com">Sinon</a>
 */
public class Broker {
    private List<Order> orderList = new ArrayList<Order>();

    public void execute(Order order){
        order.execute();
    }

    public void takeOrder(Order order){
        orderList.add(order);
    }

    public void placeOrders(){
        for (Order order : orderList) {
            order.execute();
        }
        orderList.clear();
    }
}
