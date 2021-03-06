package Strategy;

import Strategy.Controller.ScoreBoard;
import Strategy.Model.Balloon;
import Strategy.Model.Clown;
import Strategy.Model.SquareBalloon;

public class StrategyMain {

    public static void main(String[] args) {

        ScoreBoard scoreBoard = new ScoreBoard();

        System.out.print("Balloon Tap Score : ");
        scoreBoard.algorithmBase = new Balloon();
        scoreBoard.showScore(10, 5);

        System.out.print("Clown Tap score : ");
        scoreBoard.algorithmBase = new Clown();
        scoreBoard.showScore(10, 5);

        System.out.print("Square Balloon score : ");
        scoreBoard.algorithmBase = new SquareBalloon();
        scoreBoard.showScore(10, 5);


    }
}
