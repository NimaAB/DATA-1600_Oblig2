package oppgave3.oppgave3_3.opp1og2;

import java.awt.*;

public class Rektankel extends Shape {
    @Override
    public void draw(Graphics g) {
        setSize(800,800);
        g.drawRect(200,200,400,400);
    }

    public static void main(String[] args) {

    }
}
