package m7e2;

import old.*;

import java.awt.event.ComponentListener;
import java.util.Random;

/**
 * ваш ИИ играет крестиком и всегда ходит первым,
 если ваш ИИ пытается сделать нечестный ход, тест считается проваленным,
 если партия сыграна в ничью, то тест считается проваленным,
 тест считается пройденным, если Ваш ИИ победил в честном сражении.
 */
public class AICoordinateGetter implements ICoordinateGetter {
    @Override
    public Point getMoveCoordinate(final Field field) {
        // BEGIN (write your solution here)
        int xCounter = countX(field);
        switch (xCounter) {
            case 0:
                return firstStep();
            default:
                int lineWinNumber = lineWinAnalize(field);
                int rowWinNumber = rowWinAnalize(field);
                int diagWinNumber = diagWinAnalize(field);
                if (lineWinNumber >= 0) {
                    return getPointInLine(field, lineWinNumber);
                }
                if (rowWinNumber >= 0) {
                    return getPointInRow(field, rowWinNumber);
                }
                if (diagWinNumber >= 0) {
                    return getPointInDiag(field, diagWinNumber);
                }
                int lineStepNumber = lineStepAnalize(field);
                int rowStepNumber = rowStepAnalize(field);
                int diagStepNumber = diagStepAnalize(field);

                if (lineStepNumber >= 0) {
                    return getPointInLine(field, lineStepNumber);
                }
                if (rowStepNumber >= 0) {
                    return getPointInRow(field, rowStepNumber);
                }
                if (diagStepNumber >= 0) {
                    return getPointInDiag(field, diagStepNumber);
                }

                return new Point(-1, -1);
        }
    }

    // END

     int elementsInLine(Field field, int lineNumber, Figure figure) {
        int figCount = 0;
        for (int i = 0; i < 3; i++) {
            Point p = new Point(i, lineNumber);
            if ((field.getFigure(p)) != null && (field.getFigure(p)).equals(figure)) {
                figCount++;
            }
        }
        return figCount;
    }


    int elementsInRow(Field field, int rowNumber, Figure figure) {
        int figCount = 0;
        for (int i = 0; i < 3; i++) {
            Point p = new Point(rowNumber, i);
            if ((field.getFigure(p)) != null && (field.getFigure(p)).equals(figure)) {
                figCount++;
            }
        }
        return figCount;
    }

     int elementsInDiag(Field field, int diagNumber, Figure figure) {
        int figCount = 0;
        if (diagNumber == 0) {
            for (int i = 0; i < 3; i++) {
                Point p = new Point(i, i);
                if ((field.getFigure(p)) != null && (field.getFigure(p)).equals(figure)) {
                    figCount++;
                }
            }
        } else {
            for (int i = 0; i < 3; i++) {
                Point p = new Point(i, 2 - i);
                if ((field.getFigure(p)) != null && (field.getFigure(p)).equals(figure)) {
                    figCount++;
                }
            }
        }
        return figCount;
    }

    private Point getPointInLine(Field field, int num) {
        for (int i = 0; i < 3; i++) {
            Point point = new Point(i, num);
            if (field.getFigure(point) == null) {
                return point;
            }
        }
        return new Point(-1, -1);
    }

    private Point getPointInRow(Field field, int num) {
        for (int i = 0; i < 3; i++) {
            Point point = new Point(num, i);
            if (field.getFigure(point) == null) {
                return point;
            }
        }
        return new Point(-1, -1);
    }

    private Point getPointInDiag(Field field, int num) {
        if (num == 0) {
            for (int i = 0; i < 3; i++) {
                Point point = new Point(i, i);
                if (field.getFigure(point) == null) {
                    return point;
                }
            }
        } else {
            for (int i = 0; i < 3; i++) {
                Point point = new Point(i, 2 - i);
                if (field.getFigure(point) == null) {
                    return point;
                }
            }
        }
        return new Point(-1, -1);
    }

    private int lineWinAnalize(Field field) {
        int winXCounter=2;
        for (int i = 0; i < 3; i++) {
            if (elementsInLine(field, i, Figure.X) == winXCounter && elementsInLine(field, i,Figure.O)==0) {
                return i;
            }
        }
        return -1;
    }

    private int rowWinAnalize(Field field) {
        int XCounter=2;
        for (int i = 0; i < 3; i++) {
            if (elementsInRow(field, i, Figure.X) == XCounter && elementsInRow(field, i,Figure.O)==0) {
                return i;
            }
        }
        return -1;
    }

    private int diagWinAnalize(Field field) {
        int XCounter=2;
        for (int i = 0; i < 2; i++) {
            if (elementsInDiag(field, i, Figure.X) == XCounter && elementsInDiag(field, i,Figure.O)==0) {
                return i;
            }
        }
        return -1;
    }
    private int lineStepAnalize(Field field) {
        int XCounter=1;
        for (int i = 0; i < 3; i++) {
            if (elementsInLine(field, i, Figure.X) == XCounter && elementsInLine(field, i,Figure.O)==0) {
                return i;
            }
        }
        return -1;
    }
    private int rowStepAnalize(Field field) {
        int XCounter=1;
        for (int i = 0; i < 3; i++) {
            if (elementsInRow(field, i, Figure.X) == XCounter && elementsInRow(field, i,Figure.O)==0) {
                return i;
            }
        }
        return -1;
    }
    private int diagStepAnalize(Field field) {
        int XCounter=1;
        for (int i = 0; i < 3; i++) {
            if (elementsInDiag(field, i, Figure.X) == XCounter && elementsInDiag(field, i,Figure.O)==0) {
                return i;
            }
        }
        return -1;
    }


    private int countX(Field field) {
        int result = 0;
        for (int i = 0; i < 3; i++) {
            result = result + elementsInLine(field, i, Figure.X);
        }
        return result;
    }

    private Point firstStep() {
        return new Point(1,1);
    }


    }

