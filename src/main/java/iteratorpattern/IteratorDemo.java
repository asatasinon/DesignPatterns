package iteratorpattern;

/**
 * @Classname IteratorDemo
 * @Description TODO
 * @Date 2021/3/31 11:46
 * @Created by sinon
 * @Author <a href="huangyanzhi@wxchina.com">Sinon</a>
 */
public class IteratorDemo {
    public static void main(String[] args) {
        Student sinon = new Student("sinon");
        Student kirito = new Student("kirito");
        Student asina = new Student("asina");

        ContainerImpl<Student> container = new ContainerImpl<>();
        container.add(sinon);
        container.add(kirito);
        container.add(asina);

        Iterator<Student> iterator = container.getIterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next().toString());
        }

    }
}
