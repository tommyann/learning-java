package ese2.es3;

import ese2.es3.modules.GameSimul;
import ese2.es3.modules.Player;

public class Main {
    public static void main(String[] args) {
        Player p1 = new Player("Tommaso");
        Player p2 = new Player("Riccardo");
        GameSimul.simulateMatch(p1, p2, 10);
    }
}

