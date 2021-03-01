package compositepattern.transparent;

/**
 * @Classname Component
 * @Description TODO
 * @Date 2021/3/1 10:27
 * @Created by sinon
 * @Author <a href="huangyanzhi@wxchina.com">Sinon</a>
 */
public interface Component {
    void add(Component c);

    void remove(Component c);

    Component getChild(int i);

    void operation();
}
