package UF4.ProjecteFigura;

import org.w3c.dom.css.CSSImportRule;

public class FiguresMain {

    public static void main(String[] args) {

        Triangle t1 = new Triangle(8,3);
        t1.imprimirDades();

        Quadrat q1 = new Quadrat(4);
        q1.imprimirDades();

        Rectangle r1 = new Rectangle(5,3);
        r1.imprimirDades();

        Trapezi tr1 = new Trapezi(1,2,3);
        tr1.imprimirDades();

        Rombe ro1 = new Rombe(2,2);
        ro1.imprimirDades();

        Pararllelogram p1 = new Pararllelogram(7,5);
        p1.imprimirDades();

        Cercle c1 = new Cercle(10);
        c1.imprimirDades();
    }
}
