package Array.Sorting.mergeSort;

import Array.randomArray.RandomArray;

public class MergeSoting {   // TREE
    public static void main(String[] args) {
        RandomArray array = new RandomArray(8,100);
        int arr[] = array.getArr();

        
        System.out.print("Original Array:\t[");
        for (int i : arr) {
            System.out.print(i+" ");
        }
        System.out.print("]\n");

        mergeSort(arr);

        System.out.print("\nSorted Array:\t[");
        for (int i : arr) {
            System.out.print(i+" ");
        }
        System.out.print("]\n");
    }

    private static void mergeSort(int[] arr) {
        if (arr.length<=1) {
            return;
           }

       int length= arr.length; 
       int middle= length/2;

       int leftArray[] = new int[middle];
       int rightArray[] = new int[length-middle];
        
      
        int l=0;int r=0;
        for(int i =0;i<length;i++){
            if (i<middle) {
                leftArray[l]=arr[i];
                l++;
            }else {
                rightArray[r]=arr[i];
                r++;
            }
            
        }
        
        mergeSort(leftArray);
        mergeSort(rightArray);

       merge(leftArray,rightArray,arr);
    }

    private static void merge(int[] leftArray, int[] rightArray, int[] arr) {
        int leftSize = leftArray.length;
        int rightSize=rightArray.length;

        int i=0,l=0,r=0;

        while (l<leftSize && r<rightSize) {
            if (leftArray[l] < rightArray[r]) {
                arr[i]=leftArray[l];
                i++;l++;
            }else{
                arr[i]=rightArray[r];
                i++;
                r++;
            }
        }

        while (l<leftSize) {
            arr[i]=leftArray[l];
            i++;
            l++;
        }
        while (r<rightSize) {
            arr[i]=rightArray[r];
            i++;
            r++;
        }
        
    }
}
