package m1e1;

public class Card {
    private int x = 2;
    protected int y = 3;
    private static int m1 = 4;
    protected static int m2 = 5;
    public static void main(String[] args) {
        int x = 6; int y = 7;
        int m1 = 8; int m2 = 9;
        new Card().new Secret().go();
    }
    class Secret {
        void go() {
            System.out.println(x + " " + y + " " + m1 + " " + m2);
        }
    }
}