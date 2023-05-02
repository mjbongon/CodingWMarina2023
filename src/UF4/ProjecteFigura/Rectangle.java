package UF4.ProjecteFigura;

public class Rectangle extends Figura {
    private int costat1;
    private int costat2;

    public Rectangle (int c1, int c2) {
        setFigura("rectangle");
        costat1 = c1;
        costat2 = c2;
    }

    public int getCostat1() {
        return costat1;
    }

    public void setCostat1(int costat1) {
        this.costat1 = costat1;
    }

    public int getCostat2() {
        return costat2;
    }

    public void setCostat2(int costat2) {
        this.costat2 = costat2;
    }
    public double calcularArea () {
        double area = costat1 * costat2;
        return area;
    }
}
