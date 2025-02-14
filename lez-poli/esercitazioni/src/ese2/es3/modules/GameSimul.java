package ese2.es3.modules;

public class GameSimul {
    private GameSimul() {} //metodo costruttore privato perché non voglio creare istanze oggetti
    public static Player simulateMatch(Player p1, Player p2, int ponitsToWin){
        int p1Points = 0, p2Points = 0;
        while(p1Points < ponitsToWin && p2Points < ponitsToWin){
            p1.throwMove();
            p2.throwMove();
            System.out.println(p1.getName() + " throws " + p1.getMove());
            System.out.println(p2.getName() + " throws " + p2.getMove());

            int winner = calculateGameWinner(p1, p2);
            if (winner == 0) System.out.println("Draw!");
            else if (winner == 1){
                System.out.println(p1.getName() + " wins");
                p1Points++;
            } else {
                System.out.println(p2.getName() + " wins");
                p2Points++;
            }
        }
        if(p1Points > p2Points){
            System.out.println(p1.getName() + " wins the match!");
            return p1;
        } else {
            System.out.println(p2.getName() + " wins the match!");
            return p2;
        }
    }
    private static int calculateGameWinner(Player p1, Player p2){
        if(p1.getMove() == p2.getMove()){
            return 0;
        }
        switch(p1.getMove()){
            case PAPER: {
                if(p2.getMove() == Move.ROCK) return 1;
                else return 2;
            }
            case SCISSORS:{
                if (p2.getMove() == Move.PAPER) return 1;
                else return 2;
            }
            case ROCK:{
                if(p2.getMove() == Move.SCISSORS) return 1;
                else return 2;
            }
        }
        return 0;
    }
}
