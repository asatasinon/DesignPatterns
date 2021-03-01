package org.example;

import compositepattern.safety.Component;
import compositepattern.safety.Composite;
import compositepattern.safety.Leaf;

/**
 * @Classname CompositeTest2
 * @Description TODO
 * @Date 2021/3/1 10:38
 * @Created by sinon
 * @Author <a href="huangyanzhi@wxchina.com">Sinon</a>
 */
public class CompositeTest2 {
    public static void main(String[] args) {
        Composite c0 = new Composite();
        Composite c1 = new Composite();
        Component leaf1 = new Leaf("1");
        Component leaf2 = new Leaf("2");
        Component leaf3 = new Leaf("3");
        c0.add(leaf1);
        c0.add(c1);
        c1.add(leaf2);
        c1.add(leaf3);
        c0.operation();
    }
}
