package UF2RegistreNotes;

public class RegistreNoteslmao2 {

    public static void main(String[] args) {
        RegistreNoteslmao x = new RegistreNoteslmao();
        double[] notes = {2.0, 5.5, 7.25, 3.0, 9.5, 8.25, 7.0, 7.5};
        double min = x.calcularMinim(notes);
        System.out.println("La nota mínima és " + min + ".");
    }
}
