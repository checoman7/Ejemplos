package POO;

import java.util.ArrayList;
import java.util.Arrays;

public class Median {


    public static void main(String[] args) {

        int[] nums1 = {1,3};
        int[] nums2 = {2};
        int[] nums3 = {1,2};
        int[] nums4 = {3,4};

        double median1 = median(nums1, nums2);
        System.out.println(median1);

        double median2 = median(nums4, nums3);
        System.out.println(median2);
    }

    private static double median(int[] vector1, int [] vector2){
        //Merge both arrays
        int mergedArrayLength = vector1.length + vector2.length;
        int[] mergedArray = new int[mergedArrayLength];
        for (int i = 0; i < vector1.length; i++){
            mergedArray[i] = vector1[i];
        }
        for (int i = 0; i < vector2.length; i++){
            mergedArray[i+vector1.length] = vector2[i];
        }
        //Sort the elements of the array in ascending order
        Arrays.sort(mergedArray);


        //Calculate median
        if (mergedArrayLength % 2 == 0){
            int medianPlace1 = mergedArrayLength / 2;
            int medianPlace2 = mergedArrayLength / 2 - 1;
            return (mergedArray[medianPlace1] + mergedArray[medianPlace2]) / 2.0;
        } else {
            int medianPlace = mergedArrayLength / 2;
            return mergedArray[medianPlace];
        }
    }
}