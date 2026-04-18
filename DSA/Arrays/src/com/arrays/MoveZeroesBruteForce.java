package com.arrays;

public class MoveZeroesBruteForce {

    public static void main(String[] args) {

        int[] nums = {0,1,0,3,12};

        int n = nums.length;
        //create temp array
        int[] temp = new int[n];
        int index =0;
        for(int i = 0; i < n; i++){

            if(nums[i] != 0)
            {
                nums[index] = nums[i];
                index++;
            }
        }
        //now fill all 0 at the end
        while(index < n){
            temp[index] =0;
            index++;
        }
        //now copy temp back  to original
        for (int i =0 ;i< n;i++){
            nums[i] = temp[i];
        }
    }
    //code coplexity time complexity O(N) we can move all zeros to end in linear time
     //               Space Complexity O(N) // temporary space complexity
}
