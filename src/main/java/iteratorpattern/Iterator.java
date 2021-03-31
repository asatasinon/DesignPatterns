package iteratorpattern;

/**
 * @Classname Iterator
 * @Description TODO
 * @Date 2021/3/31 11:24
 * @Created by sinon
 * @Author <a href="huangyanzhi@wxchina.com">Sinon</a>
 */
public interface Iterator<E> {
    boolean hasNext();

    E next();
}