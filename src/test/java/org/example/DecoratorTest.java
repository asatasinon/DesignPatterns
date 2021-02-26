package org.example;

import decoratorpattern.*;

/**
 * @Classname DecoratorTest
 * @Description TODO
 * @Date 2021/2/26 15:00
 * @Created by sinon
 * @Author <a href="huangyanzhi@wxchina.com">Sinon</a>
 */
public class DecoratorTest {
    public static void main(String[] args) {

        House house = new BasicHouse();
        house.decorateHouse();
        house.payMoney();
        house = new LivingRoomDecorator(house);
        house.decorateHouse();
        house.payMoney();

        house = new BedRoomDecorator(house);
        house.decorateHouse();
        house.payMoney();

        house.decorateHouse();
        house.payMoney();

        house = new KitchenDecorator(house);
        house.decorateHouse();
        house.payMoney();

        System.out.println(house.getDecorate());
        System.out.println(house.getMoney());
    }

}
