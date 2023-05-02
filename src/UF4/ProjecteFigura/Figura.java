package UF4.ProjecteFigura;

public class Figura extends FiguresMain {
    private String figura;

    private static int id;

    public Figura () {
        this.id = ++id;
    }

    public String getFigura() {
        return figura;
    }

    public void setFigura(String figura) {
        this.figura = figura;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
    public void imprimirDades() {
        System.out.println("La figura amb id " + getId() + " es un " + getFigura() + ".");
        System.out.println("L'area del " + getFigura() + " es: " + calcularArea());
        System.out.println();
        System.out.println("------------------------------------");
        System.out.println();
    }
    public double calcularArea() {
        return 0;
    }
}
