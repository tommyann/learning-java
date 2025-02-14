package ese2.es2.modules;

import java.util.Random;

public class Coin {
    private Side showingSide;
    final private Random generator;
    final private double pHead;
    final private int seed = 2022;

    public Coin() {
        showingSide = null;
        this.generator = new Random(seed);
        this.pHead = 0.5;
    }

    public Coin(double pHead) {
        showingSide = null;
        this.generator = new Random(seed);
        this.pHead = pHead;
    }

    public Coin(Side showingSide){
        this.showingSide = showingSide;
        this.generator = new Random(seed);
        this.pHead = 0.5;
    }

    public Coin(int seed){
        showingSide = null;
        generator = new Random(seed);
        this.pHead = 0.5;
    }

    //METHODS
    public void toss(){
        if(this.generator.nextDouble() <= pHead) this.showingSide = Side.HEAD;
        else this.showingSide = Side.TAIL;
    }

    //GETTERS
    public Side getShowingSide(){
        return showingSide;
    }
}
