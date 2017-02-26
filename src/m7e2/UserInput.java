package m7e2;

import old.Field;
import old.ICoordinateGetter;
import old.Point;

import java.io.InputStream;
import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * Created by MidorinaNG on 21.02.2017.
 */
public class UserInput implements ICoordinateGetter {
    //    private int x=0;
//    private int y=0;
    @Override
    public Point getMoveCoordinate(Field field) {
        Scanner sc = new Scanner(System.in);
        Point point;
        do {
            System.out.println("Введите координату x -->   ");
            int x = sc.nextInt();
            System.out.println("Введите координату y -->   ");
            int y = sc.nextInt();
            point = new Point(x, y);
        }
        while ((field.getFigure(point)) != null);

        return point;

    }
}



