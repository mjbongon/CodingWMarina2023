package UF4.HerenciaCar;

public class Arona extends SEAT{
    private String color;
    private int km;

    public Arona () {
        System.out.println("SEAT Model: Arona");
    }

    public void speed() {
        System.out.println("Max: 80Kmph");
    }

    public static void main(String args[]) {
        Arona obj = new Arona();
        obj.vehicleType();
        obj.brand();
        obj.speed();
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getKm() {
        return km;
    }

    public void setKm(int km) {
        this.km = km;
    }
}
