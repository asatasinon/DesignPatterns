package org.example;

import templatepattern.BasketballGame;
import templatepattern.FootballGame;
import templatepattern.Game;

/**
 * @Classname TemplateTest
 * @Description TODO
 * @Date 2021/3/1 10:46
 * @Created by sinon
 * @Author <a href="huangyanzhi@wxchina.com">Sinon</a>
 */
public class TemplateTest {
    public static void main(String[] args) {

        Game game = new FootballGame();
        game.play();
        System.out.println();
        game = new BasketballGame();
        game.play();
    }
}
