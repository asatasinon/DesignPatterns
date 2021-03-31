package visitorpattern;

import java.util.Random;

/**
 * @Classname Manager
 * @Description TODO
 * @Date 2021/3/31 10:13
 * @Created by sinon
 * @Author <a href="huangyanzhi@wxchina.com">Sinon</a>
 */
public class Manager extends Employee {

    private int products;

    public Manager(String employeeName) {
        super(employeeName);
        this.products = new Random().nextInt(10);
    }

    @Override
    public void accept(IVisitor visitor) {
        visitor.visit(this);
    }

    public int getProducts() {
        return products;
    }

    public void setProducts(int products) {
        this.products = products;
    }

    @Override
    public String toString() {
        return super.toString() + ", job is Manager{" +
                "products=" + products +
                '}';
    }
}
