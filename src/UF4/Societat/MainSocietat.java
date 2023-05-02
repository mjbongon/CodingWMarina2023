package UF4.Societat;

import UF4.Persona.Persona;

public class MainSocietat {

    public static void main (String[] args) {

        Persona p1 = new Persona("33333876V", "Marina");
        p1.setEdat(26);

        Persona p2 = new Persona();
        p2.setDni("102104A");
        p2.setEdat(18);
        p2.setNom("Mj");

        Persona p3 = new Persona("555555X","Anette", 17);

        p1.visualitzar();
        p2.visualitzar();
        p3.visualitzar();

    }
}

