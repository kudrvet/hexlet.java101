package old;


/**
 * Created by kudrv on 10.02.2017.
 */
public class CurrentMoveCont {
    public String currentMove(final Field field) {

        int countX = 0;
        int countO = 0;
        for (int i = 0; i < field.getSize(); i++) {

            for (int j = 0; j < field.getSize(); j++) {

                if ((field.figures[i][j] != null) && (field.figures[i][j].equals("X"))) countX++;
                if ((field.figures[i][j] != null) && (field.figures[i][j].equals("0"))) countO++;
            }
        }
        if (countX <= countO) {

            return "X";
        }
        return "0";

    }
}