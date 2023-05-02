package UF4.ProjecteFigura;

public class Cercle extends Figura{
    private int radi;
    public Cercle (int r) {
        setFigura("cercle");
        radi = r;
    }

    public int getRadi() {
        return radi;
    }

    public void setRadi(int radi) {
        this.radi = radi;
    }
    public double calcularArea () {
        double area = 3.14 * (radi * radi);
        return area;
    }
}
