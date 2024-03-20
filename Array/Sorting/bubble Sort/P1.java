/**
 * P1
 */
public class P1 {

    public static void main(String[] args) {
        int nums [] = {1,2,3,4,5,5,67,774,6,654,5,2};

        System.out.print("Original Array: \t");
        for (int i : nums) {
            System.out.print(i+" ");
        }
        System.out.println();

        sort(nums);

        
        System.out.print("Sorted Array: \t");
        for (int i : nums) {
            System.out.print(i+" ");
        }
        System.out.print("\n");
    }

    private static void sort(int[] nums) {
        //1,2,3,4,5,5,67,774,6,654,5,2
//      Bubble Sort


        int temp=0;
        for (int i = 0; i < nums.length; i++) {
            for (int j = 0; j < nums.length-i-1; j++) {
                if (nums[j]>nums[j+1]) {
                    temp= nums[j];
                    nums[j]=nums[j+1];
                    nums[j+1]=temp;
                }
            }
        }
    }
}