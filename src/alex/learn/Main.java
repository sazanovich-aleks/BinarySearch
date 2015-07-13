package alex.learn;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

/**
 * Created by alex on 24.06.15.
 */
public class Main {

    public static void printArray(int [] array, int size) {
        for (int i=0;i<size;i++) {
            System.out.println(array[i]);
        }
    }

    public static void main(String[] args) {
        int [] arr = new int[100];

        for(int i = 0; i< 100; i++){
            arr[i] = (int) (Math.random() * 100);
        }
        Arrays.sort(arr);
        System.out.println(arr);
        Main.printArray(arr,100);

    }
}
