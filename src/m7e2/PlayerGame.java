package m7e2;


import old.Field;
import old.Figure;
import old.ICoordinateGetter;
import old.Point;

public class PlayerGame {

    private ICoordinateGetter iCoordinateGetter;

    public PlayerGame(ICoordinateGetter iCoordinateGetter) {
        this.iCoordinateGetter=iCoordinateGetter;
    }

    Point play (Field field){
        Point point = iCoordinateGetter.getMoveCoordinate(field);
        return point;
    }
}
