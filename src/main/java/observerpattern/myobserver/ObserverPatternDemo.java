package observerpattern.myobserver;

/**
 * @Classname ObserverPatternDemo
 * @Description TODO
 * @Date 2021/3/30 15:46
 * @Created by sinon
 * @Author <a href="huangyanzhi@wxchina.com">Sinon</a>
 */
public class ObserverPatternDemo {
    public static void main(String[] args) {
        Subject subject = new Subject();

        new HexObserver(subject);
        new OctalObserver(subject);
        new BinaryObserver(subject);

        System.out.println("First state change: 64");
        subject.setState(64);
        System.out.println("Second state change: 56");
        subject.setState(56);
    }
}