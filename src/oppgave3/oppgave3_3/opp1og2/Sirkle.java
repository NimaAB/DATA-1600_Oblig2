package oppgave3.oppgave3_3.opp1og2;

import javax.swing.JFrame;
import java.awt.*;

public class Sirkle extends Shape {

    public void draw(Graphics g){
        setSize(800,800);
        g.drawOval(200,200,400,400);
    }

    public static void main(String[] args) {
        JFrame Vindu= new JFrame();
        Vindu.setSize(900,900);
        Sirkle sirkle =  new Sirkle();
        Vindu.add(sirkle);
        Vindu.setLocationRelativeTo(null);
        Vindu.setVisible(true);
    }


}
