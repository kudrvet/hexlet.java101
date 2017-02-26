package m7e2;

import old.Field;
import old.Figure;

/**
 * Created by MidorinaNG on 21.02.2017.
 */
public class WinnerController {

    public boolean isWin(Field field) {
        AICoordinateGetter aiCoordinateGetter = new AICoordinateGetter();
        for (int i = 0; i < 3; i++) {
            if ((aiCoordinateGetter.elementsInLine(field, i, Figure.X)) == 3 || (aiCoordinateGetter.elementsInLine(field, i, Figure.O)) == 3) {
                return true;
            }
            if ((aiCoordinateGetter.elementsInRow(field, i, Figure.X)) == 3 || (aiCoordinateGetter.elementsInRow(field, i, Figure.O)) == 3) {
                return true;
            }
            if ((aiCoordinateGetter.elementsInDiag(field, i, Figure.X)) == 3 || (aiCoordinateGetter.elementsInDiag(field, i, Figure.O)) == 3) {
                return true;
            }
        }
        return false;
    }
}
