package UF4.HerenciaCar;

public class SEAT extends Car{
    private String model;

    public SEAT () {
        System.out.println("Class SEAT");
    }
    public void brand () {
        System.out.println("Brand: SEAT");
    }

    public void speed () {
        System.out.println("Max: 90Kmph");
    }
}
