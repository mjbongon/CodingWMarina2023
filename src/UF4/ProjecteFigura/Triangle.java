package UF4.ProjecteFigura;

public class Triangle extends Figura {

    private int base;
    private int h; 
    public Triangle (int b, int a) {
        setFigura("triangle");
        base = b;
        h = a;
    }

    public int getBase() {
        return base;
    }

    public void setBase(int base) {
        this.base = base;
    }

    public int getH() {
        return h;
    }

    public void setH(int h) {
        this.h = h;
    }

    public double calcularArea() {
        double area = base * h/2;
        return area;
    }
}
