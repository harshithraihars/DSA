public class TrappedWarter {
    public static int GetWater(int height[]) {
        boolean unique=true;
        boolean isAscending=true;
        boolean isdescending=true;
        for(int i=0;i<height.length;i++){
            if(height[0]!=height[i]){
                unique=false;
            }
        }
        for(int i=0;i<height.length-1;i++){
            if(height[i]>height[i+1]){
                isdescending=false;
            }else{
                isAscending=false;
            }
            
        }
        if(unique || isAscending || isdescending || height.length<=2){
            return 0;
        }
        int leftBound[] = new int[height.length];
        int rightBound[] = new int[height.length];
        leftBound[0] = height[0];
        rightBound[height.length - 1] = height[height.length - 1];
        // to find leftBoundary array
        for (int i = 1; i < height.length; i++) {
            leftBound[i] = Math.max(leftBound[i - 1], height[i]);
        }
        // rightboundaryarray
        for (int i = height.length - 2; i >= 0; i--) {
            rightBound[i] = Math.max(rightBound[i + 1], height[i]);
        }
        int TrappedWarter = 0;
        for (int i = 0; i < height.length; i++) {
            // water level=min(left,right)-height
            int currentHold = Math.min(leftBound[i], rightBound[i]) - height[i];
            TrappedWarter += currentHold;
        }
        return TrappedWarter;
        // for(int i=0;i<leftBound.length;i++){
        // System.out.print(leftBound[i]);
        // }
        // System.out.println();
        // for(int i=0;i<rightBound.length;i++){
        // System.out.print(rightBound[i]);
        // }
    }

    public static void main(String[] args) {
        int arr[] = { 0, 1, 0, 2, 1, 0, 1, 3, 2, 1, 2, 1 };
        System.out.println(GetWater(arr));
        ;
    }
}
