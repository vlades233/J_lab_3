/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Java_lab_3;
import java.util.Arrays;
import java.util.Random;

/**
 *
 * @author Administrator
 */
public class Java {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Random random = new Random();
        int N=5;
        float array[] = new float[N];
       float array_new[] = new float[N];
       for (int i = 0; i < array.length-1; i++) 
       {
           array[i] = random.nextFloat();
       }
       array[4]=array[2]; // искуственно создал дубликат, что бы наглядно было
       // Arrays.sort(array); 
        for (int i = 0; i < array.length; i++) { //реализовал что то вроде сортировки выбором, вроде так      
            float min = array[i];
         int min_i = i; 
            for (int j = i+1; j < array.length; j++) {
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
        
         System.out.println("Сортированный  массив: " + Arrays.toString(array)); //Сортирую, потому что подумал что я не хочу проходить по всему массиву, лучше пусть он будет проверять прошлый елемент, будет практичнее
         array_new[0]=array[0];
        array_new[0]=array[0];
        for (int i=1;i<array.length;i++){
            if (array[i-1] != array[i]){

                array_new[i] = array[i];
            }
        }
          System.out.println("Наш массив: " + Arrays.toString(array_new));

        // TODO code application logic here
    }
        }
   
    








 
    