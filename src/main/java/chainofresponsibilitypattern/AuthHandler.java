package chainofresponsibilitypattern;

/**
 * @Classname AuthHandler
 * @Description TODO
 * @Date 2021/3/15 14:40
 * @Created by sinon
 * @Author <a href="huangyanzhi@wxchina.com">Sinon</a>
 */
public class AuthHandler extends AbstractHandler {
    @Override
    public void doHandle(Account account) {
        if("admin".equals(account.getAuth())){
            System.out.println("admin 权限");
            return;
        }
        System.out.println("user 权限");
    }
}
