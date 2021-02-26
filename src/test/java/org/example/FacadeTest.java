package org.example;

import facadepattern.Facade;

/**
 * @Classname FacadeTest
 * @Description TODO
 * @Date 2021/2/26 13:53
 * @Created by sinon
 * @Author <a href="huangyanzhi@wxchina.com">Sinon</a>
 */
public class FacadeTest {
    public static void main(String[] args) {
        Facade facade = new Facade();

        facade.doA();
        facade.doB();
        facade.doC();
    }
}
