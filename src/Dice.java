import javax.swing.*;
import java.awt.*;

public class Dice extends JPanel {
    int number;
    public Dice(){
        number=(int) (Math.random()*6)+1;
    }
    public void roll(){
        number=(int) (Math.random()*6)+1;
    }
    public void paiut(Graphics window){

    }
}
