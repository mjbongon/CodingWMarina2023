package UF4.ProjecteFigura;

public class Trapezi extends Figura{
    private int a;
    private int b;
    private int h;

    public Trapezi (int a, int b, int h) {
        setFigura("trapezi");
        this.a = a;
        this.b = b;
        this.h = h;
    }

    public int getA() {
        return a;
    }

    public void setA(int a) {
        this.a = a;
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
        double area = (a+b) / 2 * h;
        return area;
    }
}
