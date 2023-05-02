package UF4.ProjecteFigura;

public class Pararllelogram extends Figura{
    private int b;
    private int h;
    public Pararllelogram (int b, int h) {
        setFigura("pararllelogram");
        this.b = b;
        this.h = h;
    }

    public int getB() {
        return b;
    }

    public void setB(int b) {
        this.b = b;
    }

    public int getH() {
        return h;
    }

    public void setH(int h) {
        this.h = h;
    }
    public double calcularArea () {
        double area = b * h;
        return area;
    }
}
