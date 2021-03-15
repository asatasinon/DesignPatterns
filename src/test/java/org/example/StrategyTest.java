package org.example;

import strategypattern.PaymentStrategyContext;

/**
 * @Classname StrategyTest
 * @Description TODO
 * @Date 2021/3/15 11:13
 * @Created by sinon
 * @Author <a href="huangyanzhi@wxchina.com">Sinon</a>
 */
public class StrategyTest {
    public static void main(String[] args) {
        PaymentStrategyContext context = new PaymentStrategyContext();
        context.doPay("AliPay", 1000);
        context.doPay("WeChatPay", 200);
        context.doPay("UnionPay", 300);
    }
}
