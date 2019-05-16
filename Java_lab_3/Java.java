package Java_lab_3;

import java.util.Arrays;
import java.util.Random;

public class Java {

    public static void main(String[] args) {
        Random random = new Random();
        int N = 5;
        float array[] = new float[N];
        float array_new[] = new float[N];
        for (int i = 0; i < array.length - 1; i++) {
            array[i] = random.nextFloat();
        }
        array[4] = array[2];

        for (int i = 0; i < array.length; i++) {
            float min = array[i];
            int min_i = i;
            for (int j = i + 1; j < array.length; j++) {
                if (array[j] < min) {
                    min = array[j];
                    min_i = j;
                }
            }
            if (i != min_i) {
                float tmp = array[i];
                array[i] = array[min_i];
                array[min_i] = tmp;
            }
        }

        System.out.println("Сортированный  массив: " + Arrays.toString(array));
        array_new[0] = array[0];
        array_new[0] = array[0];
        for (int i = 1; i < array.length; i++) {
            if (array[i - 1] != array[i]) {

                array_new[i] = array[i];
            }
        }
        System.out.println("Наш массив: " + Arrays.toString(array_new));

    }
}
