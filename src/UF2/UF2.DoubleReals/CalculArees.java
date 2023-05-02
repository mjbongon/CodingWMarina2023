package UF2DoubleReals;

import java.util.Scanner;
public class CalculArees {
    public static void main (String[] args) {
        CalculArees programa = new CalculArees();
        programa.inici();
    }

    public void inici() {
        mostrarMenu();
        calcular();
    }

    public void mostrarMenu() {
        System.out.println("De quina figura vols calcular l'area?");
        System.out.println("Tens les següents opcions: triangle, quadrat, rectangle, trapezi, rombe, paralelogram o cercle.");
    }

    public void calcular() {
        Scanner s = new Scanner (System.in);
        String figura = s.nextLine();
        double area = 0;

        switch (figura) {
            case "triangle" -> {
                double b = 23.0;
                double h = 8.0;
                area = (b * h) / 2;
            }

            case "quadrat" -> {
                double r = 37.0;
                area = Math.pow(r, 2);
            }

            case "rectangle" -> {
                double a = 68.0;
                double b = 39.0;
                area = a * b;
            }

            case "trapezi" -> {
                double a = 35.0;
                double b = 16.0;
                double h = 5.0;
                area = ((a * b) * h) / 2;
            }

            case "rombe" -> {
                double dM = 75.0;
                double dm = 30.0;
                area = (dM * dm) / 2;
            }

            case "paralelogram" -> {
                double b = 45.0;
                double h = 13.0;
                area = b * h;
            }

            case "cercle" -> {
                System.out.println("Quin es el radi del cercle?");
                double r = s.nextDouble();
                //funció matemàtica que eleva a 2 el radi
                //Math.PI = nombre pi (3.14159....)
                area = Math.pow(r, 2) * Math.PI;
            }
        }
        System.out.println("L'area del " + figura + " es " + area);
    }
}