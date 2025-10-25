// You are given an array people where people[i] is the weight of the ith person, and an infinite number of boats where each boat can carry a maximum weight of limit. Each boat carries at most two people at the same time, provided the sum of the weight of those people is at most limit.

// Return the minimum number of boats to carry every given person.

 

// Example 1:

// Input: people = [1,2], limit = 3
// Output: 1
// Explanation: 1 boat (1, 2)
package Daily;

import java.util.Arrays;

public class NumRescueBoats {
    public int numRescueBoats(int[] people, int limit) {
        Arrays.sort(people);
        int left=0;
        int right=people.length-1;
        int boats=0;

        while(left<=right){
            boats++;
            if(left==right){
                break;
            }
            else if(people[right]==limit) right--;
            else if(people[left]+people[right]>limit){
                right--;
            }else{
                left++;
                right--;
            }
        }
        return boats;
    }
}
