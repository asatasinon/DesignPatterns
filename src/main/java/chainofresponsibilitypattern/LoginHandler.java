package chainofresponsibilitypattern;

/**
 * @Classname LoginHandler
 * @Description TODO
 * @Date 2021/3/15 14:37
 * @Created by sinon
 * @Author <a href="huangyanzhi@wxchina.com">Sinon</a>
 */
public class LoginHandler extends  AbstractHandler {
    @Override
    public void doHandle(Account account) {
        if(!account.getPassword().equals("admin")) {
            System.out.println("登录失败，用户名或密码错误");
            return;
        }
        System.out.println("登录成功，正在进行权限校验...");
        nextHandler.doHandle(account);
    }
}
