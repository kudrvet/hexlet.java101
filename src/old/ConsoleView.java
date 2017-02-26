package old;

/**
 * Created by kudrv on 18.02.2017.
 */
public class ConsoleView {
    public void show(final Game game) {
        final Field field = game.getField();
        final StringBuilder fieldBuilder = new StringBuilder();
        for (int x = 0; x < field.getSize(); x++) {
            if (x != 0)
                generateSeparator(fieldBuilder);
            generateLine(field, x, fieldBuilder);
        }
        System.out.println(fieldBuilder.toString());
    }

//    public boolean move(final old.Game game) {
//        return true;
//    }

    void generateLine(final Field field,
                      final int x,
                      final StringBuilder sb) {
        // BEGIN (write your solution here)
        for (int i = 0; i < 3; i++) {
            Point p = new Point(i, x);
            sb.append(" ");
            if (field.getFigure(p)==null) {
                sb.append(" ");
            }
            else {
                sb.append(field.getFigure(p));
            }
            sb.append(" ");
            if (i != 2) {
                sb.append("|");
            }
        }
        sb.append("\n");
    }

    void generateSeparator(final StringBuilder sb) {
        // BEGIN (write your solution here)
sb.append("~~~~~~~~~~~\n");
        // END
    }
}
