package templatepattern;

/**
 * @Classname FootballGame
 * @Description TODO
 * @Date 2021/3/1 10:44
 * @Created by sinon
 * @Author <a href="huangyanzhi@wxchina.com">Sinon</a>
 */
public class FootballGame extends Game {

    @Override
    void initialize() {
        System.out.println("Football Game Initialized! Start playing.");
    }

    @Override
    void startPlay() {
        System.out.println("Football Game Started. Enjoy the game!");
    }


    @Override
    void endPlay() {
        System.out.println("Football Game Finished!");
    }
}