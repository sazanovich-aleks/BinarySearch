package alex.learn;

import java.util.*;

/**
 * Created by alex on 24.06.15.
 */
public class Main {

    public static void main(String[] args) {
        int[] array = new int[10000];
        for(int i=0; i< array.length; i++){
            array[i] = (int) (Math.random() * 10000);
        }

        array = BinarySearch.sort(array);
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);

        }
    }
}
