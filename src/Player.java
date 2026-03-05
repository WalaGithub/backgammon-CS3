import java.util.Scanner;
public class Player {
//    final String name;
    final char c;
    boolean mturn;
    boolean rolled;
//    final Scanner scanner=new Scanner(System.in);//
    public Player(char color){
        c=color;
        mturn = false;
        rolled = false;
//        System.out.println("Player "+c+" please type your name");
//        name=scanner.nextLine();
    }
    void beginTurn() {
        mturn = true;
        rolled = false;
        System.out.println("Player "+c+"'s turn. click the dice to roll");
    }
    public void onDiceRolled() {
        rolled=true;
        System.out.println("Player "+c+" rollde");
    }
    void endTurn() {
        mturn =false;
        rolled=false;
    }
}
