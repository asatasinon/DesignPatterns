package strategypattern;

/**
 * @Classname AliPay
 * @Description TODO
 * @Date 2021/3/15 11:04
 * @Created by sinon
 * @Author <a href="huangyanzhi@wxchina.com">Sinon</a>
 */
public class AliPay implements IPaymentStrategy{
    @Override
    public void doPay(int money) {
        System.out.println("感谢使用支付宝支付，您已支付成功，支付金额："+ money +"元");
    }
}
