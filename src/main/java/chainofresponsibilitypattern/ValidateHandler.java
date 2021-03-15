package chainofresponsibilitypattern;

import com.mysql.jdbc.StringUtils;

/**
 * @Classname ValidateHandler
 * @Description TODO
 * @Date 2021/3/15 14:28
 * @Created by sinon
 * @Author <a href="huangyanzhi@wxchina.com">Sinon</a>
 */
public class ValidateHandler extends AbstractHandler {
    @Override
    public void doHandle(Account account) {
        if (StringUtils.isNullOrEmpty(account.getUserName())
                || StringUtils.isNullOrEmpty(account.getPassword())){
            System.out.println("用户名或密码不能为空");
            return;
        }
        System.out.println("用户信息检验完毕，正在进行登录校验...");
        nextHandler.doHandle(account);
    }
}
