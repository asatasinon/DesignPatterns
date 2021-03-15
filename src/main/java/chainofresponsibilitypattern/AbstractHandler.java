package chainofresponsibilitypattern;


import java.util.Objects;

/**
 * @Classname Handler
 * @Description TODO
 * @Date 2021/3/15 14:23
 * @Created by sinon
 * @Author <a href="huangyanzhi@wxchina.com">Sinon</a>
 */
public abstract class AbstractHandler {
    protected AbstractHandler nextHandler;

    public void setNextHandler(AbstractHandler nextHandler) {
        this.nextHandler = nextHandler;
    }

    public abstract void doHandle(Account account);


    //优化版--建造者模式 + 责任链模式
    public static class Builder{
        private AbstractHandler head;
        private AbstractHandler tail;

        public Builder addHandler(AbstractHandler nextHandler) {
            if (Objects.equals(head, null)) {
                this.head = nextHandler;
                this.tail = nextHandler;
                return this;
            }
            this.tail.setNextHandler(nextHandler);
            this.tail = nextHandler;
            return this;
        }

        public AbstractHandler build() {
            return this.head;
        }
    }

}
