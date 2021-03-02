package templatepattern;

/**
 * @Classname BasketballGame
 * @Description TODO
 * @Date 2021/3/1 10:45
 * @Created by sinon
 * @Author <a href="huangyanzhi@wxchina.com">Sinon</a>
 */
public class BasketballGame extends Game {

    @Override
    void initialize() {
        System.out.println("Basketball Game Initialized! Start playing.");
    }

    @Override
    void startPlay() {
        System.out.println("Basketball Game Started. Enjoy the game!");
    }


    @Override
    void endPlay() {
        System.out.println("Basketball Game Finished!");
    }
}