import javax.swing.*;
import java.awt.*;
//
public class Checker extends JPanel {
    char color;
    int x,y;
    public Checker(int ex, int wy, char c){
        x=ex;
        y=wy;
        color=c;
    }
    public void paint(Graphics window, boolean iUD) {
        if(color=='w'){
            window.setColor(Color.WHITE);
        }
        else if(color=='b'){
            window.setColor(Color.BLACK);
        }
        if(iUD) {
            window.fillOval(x-22,y-22,55,55);
        }
        else {
            window.fillOval(x-22,y-22,55,55);
        }

    }
}