package opgave3;

import model.Nedboer;

import java.util.Arrays;

public class Opgave3 {

    public static void main(String[] args) {
        int[] array = {5, 10, 5, 6, 4, 9, 8};
        System.out.println(Arrays.toString(prefixAverage(array)));

        System.out.println(Nedboer.bedsteTreFerieUger());
    }


    public static double[] prefixAverage(int[] array){
        double[] average = new double[array.length];

        double sum = 0.0;
        for (int i = 0; i < array.length; i++) {
            sum += array[i];
            average[i] = sum / (i + 1);
        }

        return average;
    }



}
