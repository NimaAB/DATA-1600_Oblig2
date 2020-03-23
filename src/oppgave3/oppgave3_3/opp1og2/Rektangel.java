package oppgave3.oppgave3_3.opp1og2;

import java.awt.*;

public class Rektangel extends Shape {
    @Override
    public void paint(Graphics g) {
        setSize(800,800);
        g.drawRect(200,200,400,400);
    }

    public static void main(String[] args) {

    }
}
