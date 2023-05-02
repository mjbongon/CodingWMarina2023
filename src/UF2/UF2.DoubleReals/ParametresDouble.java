package UF2DoubleReals;

import java.util.Scanner;
public class ParametresDouble {

    public static void main (String[] args) {
        ParametresDouble programa = new ParametresDouble();
        programa.inici();
    }

    public void inici() {
        System.out.println ("Llegiu un double pel teclat:");
        double a = llegirEnterTeclat();
        System.out.println ("L'enter ha estat " + a + ".");
        System.out.println ("Llegiu un altre double pel teclat:");
        a = llegirEnterTeclat();
        System.out.println ("L'altre double ha estat " + a + ".");
    }

    public double llegirEnterTeclat() {
        Scanner lector = new Scanner (System.in);
        double enterLlegit = 6.9;
        boolean llegit = false;
        while (!llegit) {
            llegit = lector.hasNextDouble();
            if (llegit) {
                enterLlegit = lector.nextDouble();
            }
            else {
                System.out.println ("Aix no s un double.");
                lector.next();
            }
        }
        lector.nextDouble();
        return enterLlegit;
    }
}