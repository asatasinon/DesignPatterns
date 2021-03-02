package org.example;

import delegatepattern.MyLeader;

/**
 * @Classname DelegateTest
 * @Description TODO
 * @Date 2021/3/2 10:07
 * @Created by sinon
 * @Author <a href="huangyanzhi@wxchina.com">Sinon</a>
 */
public class DelegateTest {
    public static void main(String[] args) {
        MyLeader leader= new MyLeader();

        try {
            leader.doTask("spider");
            leader.doTask("web");
            leader.doTask("C#");
        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}
