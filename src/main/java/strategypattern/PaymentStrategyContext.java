package strategypattern;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

/**
 * @Classname PaymentStrategyContext
 * @Description TODO
 * @Date 2021/3/15 11:07
 * @Created by sinon
 * @Author <a href="huangyanzhi@wxchina.com">Sinon</a>
 */
public class PaymentStrategyContext {

    private static final Map<String, IPaymentStrategy> STRATEGY_HASH_MAP = new HashMap<>();
    private  static final String ALI_PAY = "AliPay";
    private  static final String WECHAT_PAY = "WeChatPay";

    static {
        STRATEGY_HASH_MAP.put(ALI_PAY, new AliPay());
        STRATEGY_HASH_MAP.put(WECHAT_PAY, new WeChatPay());
    }

    public void doPay(String payment, int money) {
        if (!STRATEGY_HASH_MAP.containsKey(payment)){
            System.out.println("支付失败，系统暂未开通该支付方式，请重新选择其他的支付方式。");
            return;
        }
        IPaymentStrategy strategy = STRATEGY_HASH_MAP.get(payment);
        strategy.doPay(money);

    }
}
