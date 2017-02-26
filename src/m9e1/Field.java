package m9e1;


import Exceptoins.InvalidPointException;
import old.Figure;
import old.Point;

public class Field {

    private static final int MIN_COORDINATE = 0;

    private final Figure[][] field;

    private final int filedSize;

    public Field(final int filedSize) {
        this.filedSize = filedSize;
        field = new Figure[filedSize][filedSize];
    }

    public int getSize() {
        return filedSize;
    }

    public Figure getFigure(final Point point) throws InvalidPointException  {
        // BEGIN (write your solution here)
        if (point.getX()<0||point.getY()<0||point.getX()>filedSize||point.getY()>filedSize)
        // END
        {
            // BEGIN (write your solution here)
            throw new InvalidPointException();
        }
        // END
        return field[point.getX()][point.getY()];
    }


    public void setFigure(final Point point, final Figure figure) throws InvalidPointException  {
        // BEGIN (write your solution here)
        if (point.getX() < 0 || point.getY() < 0 || point.getX() > filedSize || point.getY() > filedSize)
        // END
        {
            // BEGIN (write your solution here)
            throw new InvalidPointException();
            // END
        }
        field[point.getX()][point.getY()] = figure;
    }

    public void exMethod (){
        System.out.println("Hi");
    }

}
