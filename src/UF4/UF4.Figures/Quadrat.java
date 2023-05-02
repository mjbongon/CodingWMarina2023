package UF4.UF4.Figures;

public class Quadrat {

    public int costat;

    public String color;

    public Quadrat(){}
    public Quadrat(int co, String c){
        costat = co;
        color = c;
    }
    public int getCostat() {
        return costat;
    }

    public void setCostat(int costat) {
        this.costat = costat;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
}
