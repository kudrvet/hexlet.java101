package m7e2;

import old.*;

public class Main {
    public static void main(String[] args) {
        Field field = new Field();
        Game game = new GameBuilder().name("XO")
                .field(field)
                .build();
        ConsoleView consoleView = new ConsoleView();
        AICoordinateGetter aiCoordinateGetter = new AICoordinateGetter();
        RandomCoordinateGetter randomCoordinateGetter = new RandomCoordinateGetter();
        UserInput userInput=new UserInput();
        PlayerGame realPlayer=new PlayerGame(userInput);
        PlayerGame iiPlayer=new PlayerGame(aiCoordinateGetter);
        WinnerController winnerController = new WinnerController();

        while (true) {
            Point p= iiPlayer.play(field);
            field.setFigure(p, Figure.X);
            consoleView.show(game);
            if (winnerController.isWin(field)) break;
            p = realPlayer.play(field);
            field.setFigure(p, Figure.O);
            consoleView.show(game);
            if (winnerController.isWin(field)) break;
        }
    }

}

