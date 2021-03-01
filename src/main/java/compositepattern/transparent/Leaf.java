package compositepattern.transparent;

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

    @Override
    public void add(Component c) {
        System.out.println("树叶" + name + "：add 方法拒绝被访问！");
    }

    @Override
    public void remove(Component c) {
        System.out.println("树叶" + name + "：remove 方法拒绝被访问！");
    }

    @Override
    public Component getChild(int i) {
        System.out.println("树叶" + name + "：getChild 方法拒绝被访问！");
        return null;
    }

    @Override
    public void operation() {
        System.out.println("树叶" + name + "：被访问！");
    }
}
