

public class P1 {
    public static void main(String[] args) {
        int nums [] = {3,22,434,66,7678,689,6654,23,321,2};

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
        // 3,22,434,66,7678,689,6654,23,321,2
        //Selection sort

        int temp =0;
        int tempIndex=0;
        for (int i = 0; i < nums.length-1; i++) {
            tempIndex =i;
            for (int j = i+1; j < nums.length; j++) {
                if (nums[tempIndex]>nums[j]) {
                    tempIndex =j;
                }
            }
            temp =nums[tempIndex];
            nums[tempIndex]=nums[i];
            nums[i]=temp;

        }
    }
}
