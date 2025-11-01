public class FoodFill {
    public static boolean isvalidIndex(int[][] image,int i,int j){
        if(i<image.length && i>=0 && j<image[0].length && j>=0) return true;
        return false;
    }
    public void fillColor(int[][] image, int sr, int sc, int color,int oldcolor){
        image[sr][sc]=color;
        if((isvalidIndex(image,sr,sc-1)) && image[sc,sr]==color){
            fillColor(image,sr,sc-1,color,oldcolor);
        }
        if(isvalidIndex(image,sr-1,sc) && image[sr-1,sc]==oldcolor){
            fillColor(image,sr-1,sc,color,oldcolor);
        }
        if(isvalidIndex(image,sr,sc+1) && image[sr,sc+1]==oldcolor){
            fillColor(image,sr,sc+1,color,oldcolor);
        }
        if(isvalidIndex(image,sr+1,sc) && image[sr+1,sc]==oldcolor){
            fillColor(image,sr+1,sc,color,oldcolor);
        }

    }
    public int[][] floodFill(int[][] image, int sr, int sc, int color) {
        if(image[sr][sc]==color) return;
        int oldcolor=image[sr][sc];
        fillColor(image,sr,sc,color,oldcolor);
        return image;
    }
}
