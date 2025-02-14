package ese2.es3.modules;

import java.util.Random;

public class Player {
    private final String name;
    final private Random generator;
    private Move move;

    public Player(String name) {
        this.name = name;
        this.move = null;
        this.generator = new Random();
    }

    public String getName() {
        return this.name;
    }

    public void throwMove() {
        switch (this.generator.nextInt(3)) {
            case 0:
                this.move = Move.ROCK;
                break;
            case 1:
                this.move = Move.PAPER;
                break;
            case 2:
                this.move = Move.SCISSORS;
                break;
        }
    }

    public Move getMove() {
        return this.move;
    }
}
