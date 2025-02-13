package ese2.es1.modules;

import java.util.Random;

public class Coin {
    private Side showingSide;
    final private Random generator;

    public Coin() {
        showingSide = null;
        this.generator = new Random(2022);
        toss();
    }

    public Coin(Side showingSide){
        this.showingSide = showingSide;
        this.generator = new Random(2022);
        toss();
    }

    public Coin(int seed){
        showingSide = null;
        generator = new Random(seed);
        toss();
    }

    //METHODS
    public void toss(){
        if(this.generator.nextDouble() <= 0.5) this.showingSide = Side.HEAD;
        else this.showingSide = Side.TAIL;
    }

    //GETTERS
    public Side getShowingSide(){
        return showingSide;
    }
}
