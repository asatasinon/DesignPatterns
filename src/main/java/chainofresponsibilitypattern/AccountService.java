package chainofresponsibilitypattern;

/**
 * @Classname demo
 * @Description TODO
 * @Date 2021/3/15 14:41
 * @Created by sinon
 * @Author <a href="huangyanzhi@wxchina.com">Sinon</a>
 */
public class AccountService {
    public void login(Account account) {
        ValidateHandler validateHandler = new ValidateHandler();
        LoginHandler loginHandler = new LoginHandler();
        AuthHandler authHandler = new AuthHandler();

        validateHandler.setNextHandler(loginHandler);
        loginHandler.setNextHandler(authHandler);

        validateHandler.doHandle(account);

    }

    public void loginOptimize(Account account) {
        ValidateHandler validateHandler = new ValidateHandler();
        LoginHandler loginHandler = new LoginHandler();
        AuthHandler authHandler = new AuthHandler();

        //优化版 -- 建造者模式 + 责任链模式
        AbstractHandler.Builder builder = new AbstractHandler.Builder();

        builder.addHandler(validateHandler)
                .addHandler(loginHandler)
                .addHandler(authHandler);

        builder.build().doHandle(account);
    }
}
