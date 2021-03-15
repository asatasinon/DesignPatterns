package strategypattern;

/**
 * @Classname IStrategy
 * @Description TODO
 * @Date 2021/3/15 11:02
 * @Created by sinon
 * @Author <a href="huangyanzhi@wxchina.com">Sinon</a>
 */
public interface IPaymentStrategy {
    void doPay(int money);
}
