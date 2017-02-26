package old;

/**
 * Created by kudrv on 09.02.2017.
 */
public class Field {

    public Figure[][] figures = new Figure[3][3];
    public int getSize() {
        // BEGIN (write your solution here)
        return figures.length;
        // END
    }

    public Figure getFigure(final Point point) {
        // BEGIN (write your solution here)
        return figures[point.getX()][point.getY()];
        // END
    }

    public void setFigure(final Point point, final Figure figure) {
        // BEGIN (write your solution here)
        figures[point.getX()][point.getY()]=figure;
        // END
    }
}

