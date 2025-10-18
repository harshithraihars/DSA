// You are given an integer array nums and an integer k.

// You are allowed to perform the following operation on each element of the array at most once:

// Add an integer in the range [-k, k] to the element.
// Return the maximum possible number of distinct elements in nums after performing the operations.

 

// Example 1:

// Input: nums = [1,2,2,3,3,4], k = 2

// Output: 6

// Explanation:

// nums changes to [-1, 0, 1, 2, 3, 4] after performing operations on the first four elements.

package Daily;

import java.util.Arrays;
import java.util.HashSet;

public class MaxDistinctElements {
    public int maxDistinctElements(int[] nums, int k) {
        Arrays.sort(nums);
        HashSet<Integer> set=new HashSet<>();
        set.add(nums[0]-k);
        int prevDistinct=nums[0]-k+1;

        for(int i=1;i<nums.length;i++){
            if(prevDistinct<nums[i]-k){
                set.add(nums[i]-k);
                prevDistinct=nums[i]-k+1;
            }else{
                int change=nums[i]-prevDistinct;
                if(change>=-k && change<=k){
                    set.add(prevDistinct);
                    prevDistinct++;
                }else{
                    set.add(nums[i]);
                }
            }
        }

        return set.size();
    }
}
