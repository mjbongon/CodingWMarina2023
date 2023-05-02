package UF4.HerenciaJerarquia;

import java.util.SortedMap;

public class MainAnimal {
    public static void main(String[] args) {
        Dog d = new Dog();
        Cat c = new Cat();
        System.out.println("A dog's sound is : " + d.getBark());
        System.out.println("");
        System.out.println("A cat's sound is : " + c.getMeow());
        System.out.println("");
    }
}
