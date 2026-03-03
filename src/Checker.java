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
        // same size/position you already use
        int px = x - 22;
        int py = y - 22;
        Color d, l;

        if (color == 'w') {
            d  = Color.DARK_GRAY;
            l = Color.WHITE;
        } else {
            d  = Color.BLACK;
            l = Color.DARK_GRAY;
        }
        window.setColor(d);
        window.fillOval(px - 3, py - 3, 55 + 6, 55 + 6);
        window.setColor(l);
        window.fillOval(px, py, 55, 55);
        window.setColor(d);
        window.fillOval(px + 6, py + 6, 55 - 12, 55 - 12);
        window.setColor(l);
        window.fillOval(px + 9, py + 9, 55 - 18, 55 - 18);
    }
}