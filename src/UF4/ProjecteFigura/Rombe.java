package UF4.ProjecteFigura;

public class Rombe extends Figura{
    private int dM;
    private int dm;
    public Rombe (int dM, int dm) {
        setFigura("rombe");
        this.dM = dM;
        this.dm = dm;
    }

    public int getdM() {
        return dM;
    }

    public void setdM(int dM) {
        this.dM = dM;
    }

    public int getDm() {
        return dm;
    }

    public void setDm(int dm) {
        this.dm = dm;
    }
    public double calcularArea () {
        double area = dM * dm / 2;
        return area;
    }
}
