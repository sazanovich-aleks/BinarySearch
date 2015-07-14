package alex.learn;

import java.util.*;

/**
 * Created by alex on 24.06.15.
 */
public class BinarySearch {

    public static int iter;

    public static int binarySearch(int[] arr, int key, int min, int max) {
        BinarySearch.iter++;
        if (min > max) return 0;
        int middle = (max + min) / 2;
        if (key == arr[middle]) {
            return key;
        }
        if (key > middle) {
            return binarySearch(arr, key, middle, arr.length);
        } else {
            return binarySearch(arr, key, min, middle);
        }
    }

    public static int binarySearchTwo(int[] arr, int key, int min, int max) {
        while(true){
            if(min > max) return 0;
            BinarySearch.iter++;
            int middle = (max + min) / 2;
            if(key == arr[middle])
                return key;
            if(key > middle){
                min = middle + 1;
            }
            else{
                max = middle - 1;
            }

        }




    }

}







