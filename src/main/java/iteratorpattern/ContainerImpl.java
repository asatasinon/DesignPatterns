package iteratorpattern;

import java.util.ArrayList;
import java.util.List;

/**
 * @Classname ContainerImpl
 * @Description TODO
 * @Date 2021/3/31 11:44
 * @Created by sinon
 * @Author <a href="huangyanzhi@wxchina.com">Sinon</a>
 */
public class ContainerImpl<E> implements Container<E> {
    private List<E> eList;

    public ContainerImpl() {
        this.eList = new ArrayList<>();
    }

    @Override
    public void add(E e) {
        this.eList.add(e);
    }

    @Override
    public void delete(E e) {
        this.eList.remove(e);
    }

    @Override
    public Iterator<E> getIterator() {
        return new IteratorImpl<E>(eList) ;
    }
}
