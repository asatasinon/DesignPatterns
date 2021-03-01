package compositepattern.safety;

/**
 * @Classname Leaf
 * @Description TODO
 * @Date 2021/3/1 10:28
 * @Created by sinon
 * @Author <a href="huangyanzhi@wxchina.com">Sinon</a>
 */
public class Leaf implements Component {
    private String name;

    public Leaf(String name) {
        this.name = name;
    }

    public void operation() {
        System.out.println("树叶" + name + "：被访问！");
    }
}
