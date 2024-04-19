package org.example.arrays;

import java.util.Arrays;

public class Leetcode88_MergeSortedArray {
    public static void merge(int[] nums1, int m, int[] nums2, int n) {
        int index = m;
        for (int num : nums2) {
            nums1[index] = num;
            index++;
        }
        Arrays.sort(nums1);

        for (int i : nums1) {
            System.out.println("i = " + i);
        }
    }

    public static void main(String[] args) {
        int[] nums1 = {0};
        int[] nums2 = {1};
        merge(nums1, 0, nums2, 1);
    }
}
