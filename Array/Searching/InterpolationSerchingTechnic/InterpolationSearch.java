package Array.Searching.InterpolationSerchingTechnic;

import java.util.Scanner;
public class InterpolationSearch { // not work properly
    public static void main(String[] args) {
        int arr [] = {1,2,3,4,10,23,15,52,522,66,68,22,84,222,354,2559,88};
        for (int i : arr) {
            System.out.print(i+" ");
        }
        Scanner scanner = new Scanner(System.in);
        System.out.println("\nEnter Element To Serach:".toUpperCase());
        int num = Integer.parseInt(scanner.nextLine());
        scanner.close();
        int Element=serchElement(arr,num);
        System.out.println(Element);
        if(Element == num){
            System.out.println(num+" is found at ".toUpperCase());
        }else{
            System.out.println(num+" is  not found! ".toUpperCase());

        }

    }

    private static int serchElement(int[] arr, int target) {
        int start =0, end =arr.length-1;
        
        while (start<=end && target>=arr[start] && target<=arr[end]) {

            int position= start+((target-arr[start])*(end-start)/(arr[end]-arr[start]));
            if (arr[position]!=-1) {
                return arr[position];
            }
            if (target>arr[start]) {
                start=position+1;
            }
            if (target<arr[end]) {
                end=position-1;
            }
        }

        return -1;
    }
}
