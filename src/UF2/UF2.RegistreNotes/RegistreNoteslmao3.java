package UF2RegistreNotes;

public class RegistreNoteslmao3 {

    public static void main(String[] args) {
        RegistreNoteslmao x = new RegistreNoteslmao();
        double[] notes = {2.0, 5.5, 7.25, 3.0, 9.5, 8.25, 7.0, 7.5};
        double mitjana = x.calcularMitjana(notes);
        System.out.println("La mitjana de les notes és " + mitjana + ".");
    }
}
