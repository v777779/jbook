package ch09.ex19.access;

/**
 * Created by V1 on 14-Feb-17.
 */
public class FactoryCube implements IGameFactory{
    @Override
    public Game newGame() {
        return new GameCube();
    }
}
