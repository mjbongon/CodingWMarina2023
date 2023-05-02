package UF2DoubleReals;

import java.util.Scanner;
public class PrediccioPersona {

    private String llenguatgeProgramacio;
    private String equipFutbol;
    private String mesNaixement = "";
    private String nom = "";
    private int edat = 0;
    private int numSort = 0;

    public static void main(String[] args) {
        PrediccioPersona programa = new PrediccioPersona();
        programa.inici();
    }

    public void inici() {
        mostrarMenu();
        numero();
        equip();
        llenguatgeProgramacio();
        results();
    }

    public void mostrarMenu() {
        Scanner s = new Scanner(System.in);
        System.out.print("Escriu el mes en què vas nèixer.");
        System.out.print("\n");
        System.out.print("Gener\tFebrer\tMarc\n");
        System.out.print("Abril\tMaig\tJuny\n");
        System.out.print("Juliol\tAgost\tSetembre\n");
        System.out.print("Octubre\tNovembre\tDesembre");
        System.out.print("\n\n");
        String mesNaixement = s.nextLine();
        System.out.print("\n");
        System.out.print("Com et dius?\n");
        String nom = s.nextLine();
        System.out.print("\n");
        System.out.print("Per acabar, quants anys tens?\n");
        int edat = s.nextInt();
        System.out.print("\n\n");
    }

    public void numero() {
        if (mesNaixement.equals("Gener") || mesNaixement.equals("gener")) {
            numSort = edat * 3/2;
        }
        else if (mesNaixement.equals("Febrer")|| mesNaixement.equals("febrer")){
            numSort = edat - 4;
        }
        else if (mesNaixement.equals("Marc")|| mesNaixement.equals("marc")){
            numSort = edat / 2;
        }
        else if (mesNaixement.equals("Abril")|| mesNaixement.equals("abril")){
            numSort = edat % 4;
        }
        else if (mesNaixement.equals("Maig")|| mesNaixement.equals("maig")){
            numSort = edat * 3/6;
        }
        else if (mesNaixement.equals("Juny")|| mesNaixement.equals("juny")){
            numSort = edat + edat;
        }
        else if (mesNaixement.equals("Juliol")|| mesNaixement.equals("juliol")){
            numSort = edat * edat / 5;
        }
        else if (mesNaixement.equals("Agost")|| mesNaixement.equals("agost")){
            numSort = edat * 1/2 * edat;
        }
        else if (mesNaixement.equals("Setembre")|| mesNaixement.equals("setembre")){
            numSort = edat / edat;
        }
        else if (mesNaixement.equals("Octubre")|| mesNaixement.equals("octubre")){
            numSort = edat * 4 / 3;
        }
        else if (mesNaixement.equals("Novembre")|| mesNaixement.equals("novembre")){
            numSort = edat % 2 + 23;
        }
        else if (mesNaixement.equals("Desembre")|| mesNaixement.equals("desembre")){
            numSort = (edat + edat) / 2;
        }
        else {
            numSort = 0;
        }
    }
    public void equip() {
        if (mesNaixement.equals("Gener") || mesNaixement.equals("gener")) {
            equipFutbol = "Bayern de Munich";
        }
        else if (mesNaixement.equals("Febrer")|| mesNaixement.equals("febrer")){
            equipFutbol = "Atlético de Madrid";
        }
        else if (mesNaixement.equals("Marc")|| mesNaixement.equals("marc")){
            equipFutbol = "Chelsea";
        }
        else if (mesNaixement.equals("Abril")|| mesNaixement.equals("abril")){
            equipFutbol = "Manchester city";
        }
        else if (mesNaixement.equals("Maig")|| mesNaixement.equals("maig")){
            equipFutbol = "Liverpool";
        }
        else if (mesNaixement.equals("Juny")|| mesNaixement.equals("juny")){
            equipFutbol = "Real Madrid";
        }
        else if (mesNaixement.equals("Juliol")|| mesNaixement.equals("juliol")){
            equipFutbol = "BVB";
        }
        else if (mesNaixement.equals("Agost")|| mesNaixement.equals("agost")){
            equipFutbol = "FCB";
        }
        else if (mesNaixement.equals("Setembre")|| mesNaixement.equals("setembre")){
            equipFutbol = "Juve";
        }
        else if (mesNaixement.equals("Octubre")|| mesNaixement.equals("octubre")){
            equipFutbol = "PSG";
        }
        else if (mesNaixement.equals("Novembre")|| mesNaixement.equals("novembre")){
            equipFutbol = "Sevilla CF";
        }
        else if (mesNaixement.equals("Desembre")|| mesNaixement.equals("desembre")){
            equipFutbol = "Manchester United";
        }
        else {
            equipFutbol = "no tinc equip de fútbol perquè m'he equivocat escrivint el meu mes d'aniversari";
        }
    }

    public void llenguatgeProgramacio() {
        if (mesNaixement.equals("Gener") || mesNaixement.equals("gener")) {
            llenguatgeProgramacio = "C++";
        }
        else if (mesNaixement.equals("Febrer")|| mesNaixement.equals("febrer")){
            llenguatgeProgramacio = "Python";
        }
        else if (mesNaixement.equals("Marc")|| mesNaixement.equals("marc")){
            llenguatgeProgramacio = "JavaScript";
        }
        else if (mesNaixement.equals("Abril")|| mesNaixement.equals("abril")){
            llenguatgeProgramacio = "Node.js";
        }
        else if (mesNaixement.equals("Maig")|| mesNaixement.equals("maig")){
            llenguatgeProgramacio = "React";
        }
        else if (mesNaixement.equals("Juny")|| mesNaixement.equals("juny")){
            llenguatgeProgramacio = "C#";
        }
        else if (mesNaixement.equals("Juliol")|| mesNaixement.equals("juliol")){
            llenguatgeProgramacio = "Swift";
        }
        else if (mesNaixement.equals("Agost")|| mesNaixement.equals("agost")){
            llenguatgeProgramacio = "Java";
        }
        else if (mesNaixement.equals("Setembre")|| mesNaixement.equals("setembre")){
            llenguatgeProgramacio = "PHP";
        }
        else if (mesNaixement.equals("Octubre")|| mesNaixement.equals("octubre")){
            llenguatgeProgramacio = "R";
        }
        else if (mesNaixement.equals("Novembre")|| mesNaixement.equals("novembre")){
            llenguatgeProgramacio = "Go";
        }
        else if (mesNaixement.equals("Desembre")|| mesNaixement.equals("desembre")){
            llenguatgeProgramacio = "Ruby";
        }
        else {
            llenguatgeProgramacio = "no tinc llenguatge de programació preferit perquè m'he equivocat escrivint el meu mes d'aniversari";
            System.out.print("No he entès el que m'has dit!!!!!!!!!!!!\n\n");
        }
    }

    public void results() {

        System.out.print("------------------------------------------------\n");

        System.out.print("Un plaer conèixer-te " + nom + ". Amb les dades que m'has donat, mira què he arribat a saber de tu... \n");
        System.out.print("\n\n");

        System.out.print(">>> El teu número de la sort és el " + numSort + "!");
        System.out.print("\n\n");

        System.out.print(">>> El teu equip de fútbol preferit, encara que no ho diguis en veu alta, és el " + equipFutbol + ".");
        System.out.print("\n\n");

        System.out.print(">>> El teu llenguatge de programació més estimat serà " + llenguatgeProgramacio + "!");
        System.out.print("\n\n");

        System.out.print("Torna quan vulguis!\n");
        System.out.print("------------------------------------------------\n\n\n");

    }
}
