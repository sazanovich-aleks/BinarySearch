package alex.learn;

import java.util.Arrays;

import static java.lang.Math.*;

/**
 * Created by alex on 24.06.15.
 */
public class BinarySearch {

    public int []arrKeys;
    public int size;

    public  BinarySearch(int size) {
        this.size = size;
        arrKeys = new int[size];
        this.generateValues();
        Arrays.sort(arrKeys);

    }

    public void generateValues(){
        for(int i=0;i<this.size;i++){
            arrKeys[i] = (int) (random() * 100);
//            Arrays.
        }
    }


    @Override
    public String toString() {
        return "BinarySearch{" +
                "arrKeys=" + Arrays.toString(arrKeys) +
                ", size=" + size +
                '}';
    }
}
