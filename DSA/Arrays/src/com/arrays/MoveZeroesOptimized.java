package com.arrays;
/*
 * What if I use TWO positions
inside the SAME array?

SLOW pointer → "where should the
        next non-zero go?"

FAST pointer → "scan and find
        the next non-zero"

When fast finds a non-zero
→ place it where slow is pointing
→ move slow forward
 *
 * */
public class MoveZeroesOptimized {

    public static void main(String[] args) {

        int[] nums = {0,1,0,3,12};
        int slow =0;

        for(int fast=0;fast<nums.length;fast++){

            if(nums[fast] != 0){
                nums[slow] = nums[fast];
                slow++;
            }
        }
        while(slow < nums.length){
            nums[slow] =0;
            slow++;
        }

        for(int fast=0;fast<nums.length;fast++){
            System.out.println(nums[fast]);
        }




    }
}
