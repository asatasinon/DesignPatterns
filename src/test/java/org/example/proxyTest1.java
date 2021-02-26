package org.example;

import proxypatterns.staticproxy.ProxySubject;
import proxypatterns.staticproxy.RealSubject;

/**
 * @Classname proxyTest1
 * @Description TODO
 * @Date 2021/2/26 11:24
 * @Created by sinon
 * @Author <a href="huangyanzhi@wxchina.com">Sinon</a>
 */
public class proxyTest1 {
    public static void main(String[] args) {
        ProxySubject proxy = new ProxySubject(new RealSubject());
        proxy.create();
    }
}
