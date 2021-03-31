package iteratorpattern;

import java.util.List;

/**
 * @Classname IteratorImpl
 * @Description TODO
 * @Date 2021/3/31 11:37
 * @Created by sinon
 * @Author <a href="huangyanzhi@wxchina.com">Sinon</a>
 */
public class IteratorImpl<E> implements Iterator<E>  {

    private List<E> eList;
    private int cursor;
    private E element;

    public IteratorImpl(List<E> eList) {
        this.eList = eList;
        cursor = 0;
        element = null;
    }

    @Override
    public boolean hasNext() {
        if (cursor < eList.size()){
            return true;
        }
        return false;
    }

    @Override
    public E next() {
        element = eList.get(cursor);
        cursor++;
        return element;
    }
}
