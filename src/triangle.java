import java.awt.*;
import java.util.Stack;
//
public class triangle {
    Stack<Checker> x;
    boolean iUD;
    public triangle(boolean isUpsideDown){
        x=new Stack<>();
        iUD = isUpsideDown;
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