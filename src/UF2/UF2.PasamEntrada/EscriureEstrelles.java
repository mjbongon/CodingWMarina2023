package UF2PasamEntrada;

public class EscriureEstrelles {
    public static void main (String[] args) {
        EscriureEstrelles programa = new EscriureEstrelles();
        programa.inici();
    }
    public void inici() {
        estrellar(4);
        estrellar(10);
        estrellar(20);
        estrellar(10);
        estrellar(20);
        estrellar(10);
        estrellar(20);
        estrellar(10);
        estrellar(20);
        estrellar(10);
        estrellar(20);
    }

    public void estrellar (int es) {
        for (int i = 0; i < es; i++) {
            System.out.print ("*");
        }
        System.out.println (" ");
    }
}