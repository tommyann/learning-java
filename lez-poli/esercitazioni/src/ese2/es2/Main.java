package ese2.es2;
import ese2.es2.modules.Coin;
import ese2.es2.modules.CoinTest;

public class Main {
    public static void main(String[] args) {
        Coin c = new Coin(0.51);
        System.out.println(CoinTest.isFair(c, 0.01));
    }
}

