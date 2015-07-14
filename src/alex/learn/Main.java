package alex.learn;

import java.util.*;

/**
 * Created by alex on 24.06.15.
 */
public class Main {

    public static void main(String[] args) {
        int[] array = new int[1000000];
        for(int i=0; i< array.length; i++){
            array[i] = i;
        }
        Arrays.sort(array);
        for(int i=0; i< array.length; i++){
            System.out.println(array[i]);
        }
        int key = BinarySearch.binarySearch(array,851 , 0, array.length);
        System.out.println("Количество итераций " + BinarySearch.iter + " Найден элемент=" +  key);

    }
}
