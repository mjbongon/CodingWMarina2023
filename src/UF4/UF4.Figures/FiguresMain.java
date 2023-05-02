package UF4.UF4.Figures;

import org.w3c.dom.css.Rect;

public class FiguresMain {

    public static void main(String[] args) {
        Rectangle r1 = new Rectangle("blau");

        /*Rectangle r2 = new Rectangle();
        r2.base = 5;
        r2.altura = 3;
        r2.color = "verd";*/

        Rectangle r2 = new Rectangle(5,3);
        r2.color = "verd";

        /*Rectangle r3 = new Rectangle();
        r3.base = 6;
        r3.altura = 4;
        r3.color = "rosa";*/

        Rectangle r3 = new Rectangle(6, 4, "rosa");


        Quadrat q1 = new Quadrat(3,"vermell");


        Triangle t1 = new Triangle(4, 4, 3, "verd");


        Cercle c1 = new Cercle(2.5, "blau");
    }

}
