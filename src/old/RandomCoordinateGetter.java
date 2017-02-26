package old;

import java.util.Random;

public class RandomCoordinateGetter  implements  ICoordinateGetter {
@Override
    public Point getMoveCoordinate(final Field field ) {
    Random random=new Random();
    int x=random.nextInt(3);
    int y=random.nextInt(3);
    Point point=new Point(x,y);

    while(field.getFigure(point)!=null) {
        x=random.nextInt(3);
        y=random.nextInt(3);
        point=new Point(x,y);
    }
    return new Point(x,y);
    }

    }


//    Это реализация интерфейса, которая имитирует ОЧЕНЬ тупой ИИ, который просто
// выбирает случайным образом не занятую клеточку на поле и возвращает ее. Обратите внимание,
// что мало просто написать генератор случайной координаты, он должен выбирать
// случайную и СВОБОДНУЮ клеточку на поле.
//Для выполнения этого сложного задания Вам понадобиться класс Random с его методом "nextInt()".
