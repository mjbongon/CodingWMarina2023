package UF2.UF2.Examen_v2;

public class CalculArrays {
    //Param. entr: double array
    //Param. sort: return max
    public double calcularMaxim(double[] array) {
        double max = array[0];
        for (int i = 1; i < array.length; i++) {
            if (max < array[i]) {
                max = array[i];
            }
        }
        return max;
    }

    //Param. entr: double array
    //Param. sort: return min
    public double calcularMinim(double[] array) {
        double min = array[0];
        for (int i = 1; i < array.length; i++) {
            if (min > array[i]) {
                min = array[i];
            }
        }
        return min;
    }

    //Param. entr: double array, int mida
    //Param. sort: return suma/mida
    public double calcularMitjana(double[] array, int mida) {
        double suma = 0;
        for (int i = 0; i < mida; i++) {
            suma = suma + array[i];
        }
        return suma/mida;
    }
}