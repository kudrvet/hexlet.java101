package old;

/**
 * Created by kudrv on 09.02.2017.
 */
public class Point {

    private final int x;

    private final int y;

    public Point(final int x, final int y) {
        this.x = x;
        this.y = y;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public static String task1(final String in) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < in.length(); i++) {
            sb.append(in.charAt(in.length() - 1 - i));
        }

        return sb.toString();
    }

    public static String task2(final String in) {
        // BEGIN (write your solution here)
        StringBuilder inSb = new StringBuilder(in.trim());
        StringBuilder outSb = new StringBuilder();

        while (inSb.indexOf(" ") != -1) {
            outSb.append(task1(inSb.substring(0, inSb.indexOf(" "))));
            outSb.append(" ");
            System.out.println("new out : " +outSb);
            inSb.delete(0, inSb.indexOf(" ") + 1);
            System.out.println("new in : " +inSb);
        }
        outSb.append(inSb.reverse());
        return outSb.toString();
    }

    public static int task3(final String in, final char target) {
        int i=0;
//        in.split()
       StringBuilder sb=new StringBuilder(in);

        while (sb.toString().indexOf(target) != -1) {
            int index = sb.toString().indexOf(target);
            i++;
            sb.delete(0, index+1);
        }
        return i;
    }

}