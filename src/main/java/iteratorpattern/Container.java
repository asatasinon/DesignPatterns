package iteratorpattern;

/**
 * @Classname Container
 * @Description TODO
 * @Date 2021/3/31 11:24
 * @Created by sinon
 * @Author <a href="huangyanzhi@wxchina.com">Sinon</a>
 */
public interface Container<E> {
    void add(E e);

    void delete(E e);

    Iterator<E> getIterator();
}
