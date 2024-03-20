/**
 * P1
 */
import java.util.Arrays;
import java.util.Scanner;
public class P1 {
    public static void main(String[] args) {
        int nums []= {1,2,3,4,5,6,7,8,9};
        System.out.println("Enter Your Target");
        @SuppressWarnings("resource")
        int terget = new Scanner(System.in).nextInt();
        int index =binarySearch(nums, terget);
        if (index ==-1) {
            System.out.println("Your Targeted Element is Not Present Inside array...");
        }else{
            System.out.println("Your Targeted Element is"+nums[index]+" Its index is: "+index);
        }
    }

    private static int binarySearch(int[] nums, int terget) {
        Arrays.sort(nums);
        int left =0;
        int right =nums.length-1;
        int midValue=0;
        while (left<=right) {
            midValue=(left+right)/2;
            if (terget ==nums[midValue]) {
                return midValue;
            }else if (terget>nums[midValue]) {
                left=midValue+1;
            } else {
                right =midValue+1;
            }
        }

        return -1;
    }
    
}