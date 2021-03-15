package chainofresponsibilitypattern;

/**
 * @Classname demo
 * @Description TODO
 * @Date 2021/3/15 14:48
 * @Created by sinon
 * @Author <a href="huangyanzhi@wxchina.com">Sinon</a>
 */
public class demo {
    public static void main(String[] args) {
        Account account = new Account("sinon", "admin");
        AccountService accountService = new AccountService();
        accountService.login(account);

        System.out.println();
        System.out.println("--- 优化版 --- 建造者模式 + 责任链模式");
        System.out.println();

        Account accountOptimize = new Account("sinon", "admin");
        accountOptimize.setAuth("admin");
        accountService.loginOptimize(accountOptimize);
    }
}
