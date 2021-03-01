package flyweightpattern;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Vector;

/**
 * @Classname MyConnectionPool
 * @Description TODO
 * @Date 2021/3/1 9:29
 * @Created by sinon
 * @Author <a href="huangyanzhi@wxchina.com">Sinon</a>
 */
public class MyConnectionPool {
    //抽象享元角色 Connection
    //具体 "com.mysql.jdbc.Driver"
    //工厂 MyConnectionPool
    private static final Vector<Connection> pool;
    private static final String user = "root";
    private static final String password = "123456";
    private static final String url = "jdbc:mysql://127.0.0.1:3306/test?useSSL=false&autoReconnect=true&sessionVariables=FOREIGN_KEY_CHECKS=0&useUnicode=yes&characterEncoding=UTF-8";
    private static final String driverClassName = "com.mysql.jdbc.Driver";
    private static final int poolSize = 10;

    static {
        pool = new Vector<>(poolSize);
        try {
            Class.forName(driverClassName);
            for (int i = 0; i < poolSize; i++) {
                //pool.add(DriverManager.getConnection(url, user, password));
                pool.add(null);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static synchronized Connection getConnection() {
        if (pool.size() == 0) {
            return null;
        }
        Connection conn = pool.get(0);
        pool.remove(conn);
        return conn;
    }

    public static int getPoolSize() {
        return pool.size();
    }

    public static void release(Connection conn) {
        pool.add(conn);
    }
}
