// Alice has n balloons arranged on a rope. You are given a 0-indexed string colors where colors[i] is the color of the ith balloon.

// Alice wants the rope to be colorful. She does not want two consecutive balloons to be of the same color, so she asks Bob for help. Bob can remove some balloons from the rope to make it colorful. You are given a 0-indexed integer array neededTime where neededTime[i] is the time (in seconds) that Bob needs to remove the ith balloon from the rope.

// Return the minimum time Bob needs to make the rope colorful.
package Daily;

public class Mincost {
    public int minCost(String colors, int[] neededTime) {
        int minTime=0;
        for(int i=0;i<colors.length()-1;i++){
            if(colors.charAt(i)==colors.charAt(i+1)){
                if(neededTime[i]>neededTime[i+1]){
                    minTime+=neededTime[i+1];
                    neededTime[i+1]=neededTime[i];
                }else{
                    minTime+=neededTime[i];
                }
            }
        }
        return minTime;
    }
    public static void main(String[] args) {
        
    }
}