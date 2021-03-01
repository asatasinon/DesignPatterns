package org.example;

import flyweightpattern.MyConnectionPool;

import java.sql.Connection;

/**
 * @Classname FlyweightTest
 * @Description TODO
 * @Date 2021/3/1 9:41
 * @Created by sinon
 * @Author <a href="huangyanzhi@wxchina.com">Sinon</a>
 */
public class FlyweightTest {
    public static void main(String[] args) {
        for (int i = 0; i < 12; i++) {
            Connection conn = MyConnectionPool.getConnection();
            System.out.println(conn);
            System.out.println(MyConnectionPool.getPoolSize());
            MyConnectionPool.release(conn);
        }

    }
}
