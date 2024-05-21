import java.util.Random;

/**
 * RandomArray
 */
public class RandomArray {
     Random random = new Random();
     int sizeOfArray;
     int limit;

    public RandomArray(int sizeOfArray,int limit){
        this.sizeOfArray =sizeOfArray;
        this.limit = limit;
    }
    
    int arr []= new int[sizeOfArray];

    public  int[] getArr() {
        for (int i = 0; i < arr.length; i++) {
            arr[i]=random.nextInt(limit);
        }
        return arr;
    }
}