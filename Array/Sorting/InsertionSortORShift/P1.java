package Array.Sorting.InsertionSortORShift;

public class P1 {
    public static void main(String[] args) {
        int nums [] = {1,233,4,5,673,3323,567,8,7,2};

        System.out.println("Original Array: ");
        for (int i : nums) {
            System.out.print(i+" ");
        }
        System.out.println();

        sort(nums);

        System.out.println("Sorted Array");
        for (int i : nums) {
            System.out.print(i+" ");
        }
        System.out.println();
    }

    private static void sort(int[] nums) {
        // 1,233,4,5,673,3323,567,8,7,2
        // Insertion Sort

        for (int i = 1; i < nums.length; i++) {
            int key=nums[i];
            int j=i-1;
            while (nums[j]>key && j>=0) {
                nums[j+1]=nums[j];
                j--;
            }
            nums[j+1]=key;
        }

    }
}
