package Oppgave331;

import javax.swing.*;
import java.util.ArrayList;
import java.util.List;

public class MainMetode {





    public static void main(String[] args) {

        // lagrer rektankele i shape listen. Og viser den

        List<Shape> shapes = new ArrayList<Shape>();
        Rektankel objRekt = new Rektankel();
        Sirkle objSirkel = new Sirkle();
        shapes.add(objRekt);
        shapes.add(objSirkel);
        JFrame Vindu= new JFrame();
        Vindu.setSize(900,900);

        // Tegner rekankle
        Vindu.add(shapes.get(0));
        Vindu.setLocationRelativeTo(null);
        Vindu.setVisible(true);


        // Metode nede tekner sirkel

        /*
        Vindu.add(shapes.get(0));
        Vindu.setLocationRelativeTo(null);
        Vindu.setVisible(true);

         */





    }
}