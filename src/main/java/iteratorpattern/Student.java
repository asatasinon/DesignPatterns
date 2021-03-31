package iteratorpattern;

import java.util.Random;

/**
 * @Classname Student
 * @Description TODO
 * @Date 2021/3/31 11:35
 * @Created by sinon
 * @Author <a href="huangyanzhi@wxchina.com">Sinon</a>
 */
public class Student {
    private String name;
    private int age;

    public Student(String name) {
        this.name = name;
        this.age = new Random().nextInt(10) + 10;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
