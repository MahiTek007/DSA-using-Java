package Array.Sorting.quickSort;

public class P1 {
    public static void main(String[] args) {
        int nums [] = {1,233,4,5,673,3323,567,8,7,2};
 
        System.out.println("Original Array: ");
        for (int i : nums) {
            System.out.print(i+" ");
        }
        System.out.println();

        sort(nums,0,nums.length-1);

        System.out.println("Sorted Array");
        for (int i : nums) {
            System.out.print(i+" ");
        }
        System.out.println();
    }

    private static void sort(int[] nums,int low,int high) {
        // 5,3,6,1,4,1
        if (low<high) {
            int pi = partition(nums,low,high);
            sort(nums, low, pi-1);
            sort(nums, pi+1, high);
        }
    }

    private static int partition(int[] nums, int low, int high) {
       int pivot =nums[high];
       int i =low-1;
       for (int j = low; j < nums.length; j++) {
            if (nums[j]<pivot) {
                i++;
                int temp =nums[i];
                nums[i]=nums[j];
                nums[j]=temp;
            }
        }
        int temp =nums[i+1];
        nums[i+1]=nums[high];
        nums[high]=temp;

        return i+1;
    }

}
