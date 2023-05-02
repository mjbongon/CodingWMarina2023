package UF2DoubleReals;

public class Recursivitat {

    public static void main (String[] args) {
        Recursivitat programa = new Recursivitat();
        programa.inici();
    }

    public void inici() {

        for (int x = 33; x > 0; x--) {

            if (x % 2 == 0) {
                System.out.println("El nombre " + x + " és parell");
            } else {
                System.out.println("El nombre " + x + " és senar");
            }

        }

    }
}