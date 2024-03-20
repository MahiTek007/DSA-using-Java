import java.util.Scanner;

/**
 * P1 . Write a 
 */
public class P1 {
    public static void main(String[] args) {
        
        int nums []= {1,2,3,4,5,6,7,8,9};
        System.out.println("Enter Your Target");
        @SuppressWarnings("resource")
        int terget = new Scanner(System.in).nextInt();
        
        int index =linearSearch(nums, terget);
        if (index ==-1) {
            System.out.println("Your Targeted Element is Not Present Inside array...");
        }else{
            System.out.println("Your Targeted Element is"+terget+" Its index is: "+index);
        }
    }

    private static int linearSearch(int[] nums, int terget) {
        for (int i = 0; i < nums.length; i++) {
            if (terget == nums[i]) {
                return i;
            }
        }
        return -1;
    }
    
}