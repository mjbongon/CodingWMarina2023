package UF4.Persona;

public class Persona {

    //Fitxer Persona.java
    String dni;
    String nom;
    short edat;

    public Persona() {
    }

    public Persona(String sDni, String sNom, int nEdat) {
        dni = sDni;
        nom = sNom;
        if (nEdat >= 0 && nEdat <= Short.MAX_VALUE)
            edat = (short) nEdat;
    }

    public Persona(String sDni, String sNom) {
        dni = sDni;
        nom = sNom;
    }

    public int setDni(String nouDni) {
        dni = nouDni;
        return 0;
    }

    public void setNom(String nouNom) {
        nom = nouNom;
    }

    public int setEdat(int novaEdat) {
        if (novaEdat < 0) {
            return 1;
        }
        if (novaEdat > Short.MAX_VALUE){
            return 2;
        }
        edat = (short) novaEdat;
        return 0;
    }

    public String getDni() {
        return dni;
    }

    public String getNom() {
        return nom;
    }

    public short getEdat() {
        return edat;
    }

    public void visualitzar() {
        System.out.println("Dni...........:" + dni);
        System.out.println("Nom...........:" + nom);
        System.out.println("Edat..........:" + edat);
    }

}