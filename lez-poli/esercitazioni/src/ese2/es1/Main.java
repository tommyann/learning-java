package ese2.es1;
import ese2.es1.modules.Coin;
import ese2.es1.modules.Side;

import java.sql.SQLOutput;

public class Main {
    public static void main(String[] args) {
        Coin c = new Coin();
        int heads=0, tails=0;
        for (int i = 1; i <=100; i++) {
            c.toss();
            //System.out.println(c.getShowingSide());
        }
    }
}