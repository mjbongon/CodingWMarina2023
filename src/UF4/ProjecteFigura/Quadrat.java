package UF4.ProjecteFigura;

public class Quadrat extends Figura{
    private int costat;
    public Quadrat (int r) {
        setFigura("quadrat");
        costat = r;
    }

    public int getCostat() {
        return costat;
    }

    public void setCostat(int costat) {
        this.costat = costat;
    }
    public double calcularArea () {
        double area = costat * costat;
        return area;
    }
}
