package ese2.es2.modules;

public final class CoinTest {
    private static final int N = 2000;
    private static final double defaultTolerance = 0.5;

    private CoinTest() {
    }

    ; //la classe è solo di utility, in questo modo si rende impossibile
    //istanziare un oggetto di questa classe

    public static boolean isFair(Coin c, double tolerance) {
        int heads = 0;
        for (int i = 0; i < N; i++) {
            c.toss();
            if (c.getShowingSide() == Side.HEAD)
                heads++;
        }
        System.out.println("Heads: " + heads);
        return ( (float) heads/N - 0.5 < tolerance/2
                && (float) heads/N > - tolerance/2);
    }

    public static boolean isFair(Coin c) {
        return isFair(c, defaultTolerance);
    }
}
