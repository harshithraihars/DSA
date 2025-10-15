// Given an array nums of n integers, your task is to find the maximum value of k for which there exist two adjacent subarrays of length k each, such that both subarrays are strictly increasing. Specifically, check if there are two subarrays of length k starting at indices a and b (a < b), where:

// Both subarrays nums[a..a + k - 1] and nums[b..b + k - 1] are strictly increasing.
// The subarrays must be adjacent, meaning b = a + k.
// Return the maximum possible value of k.

// A subarray is a contiguous non-empty sequence of elements within an array.

package Daily;

import java.util.List;

public class MaxIncreasingSubArray {
     public int maxIncreasingSubarrays(List<Integer> nums) {
        int max=0;
        int i=0;

        int start=0;
        int end=0;
        
        int prevlen=1;
        int currlen;
        while(i<nums.size()){
            if(i<nums.size()-1 && nums.get(i)>=nums.get(i+1)){
                max=Math.max(max,1);
            }
            else{
                currlen=1;
                start=i;
                while(i<nums.size()-1 && nums.get(i)<nums.get(i+1)){
                    currlen++;
                    i++;
                }
                max=Math.max(max,currlen/2);
                if(start==end+1){
                    max=Math.max(max,Math.min(currlen,prevlen));
                }
                prevlen=currlen;
                end=i;
            }
            i++;
        }

        return max;
    }
}