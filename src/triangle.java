import java.awt.*;
import java.util.Stack;
//
public class triangle {
    Stack<Checker> x;
    boolean iUD;
    boolean iJ;
    boolean iW;
    public triangle(boolean isUpsideDown, boolean isJail, boolean isWin){
        x=new Stack<>();
        iUD = isUpsideDown;
        iJ=isJail;
        iW=isWin;
    }
    public void add(Checker c){
        x.add(c);
    }
    public void paint(Graphics window){
        for(Checker c:x){
            c.paint(window, iUD);
        }
    }

}