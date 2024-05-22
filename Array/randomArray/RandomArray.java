package Array.randomArray;
import java.util.Random;

/**
 * RandomArray
 */
public class RandomArray {
     Random random = new Random();
     int sizeOfArray;
     int limit;
     int arr [];

    public RandomArray(int sizeOfArray, int limit) {
        this.sizeOfArray = sizeOfArray;
        this.limit = limit;
    }
 
    public  int[] getArr() {
        arr = new int[sizeOfArray];

        for (int i = 0; i < arr.length; i++) {
            int newElement = random.nextInt(limit);
                arr[i]=newElement;
        }
        return arr;
    }
}