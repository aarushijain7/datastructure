package code.leetcode.graphs;
public class FloodFill {
    public static void main(String[] args) {
        int[][] grid ={{1,1,1},{1,1,0},{1,0,1}};
        floodFill(grid,1,1,2);
        code.leetcode.graphs.Display2D.display2D(grid);

    }
    public static int[][] floodFill(int[][] image, int sr, int sc, int color) {
        if(image==null){
            return null;
        }
        if(sr>image.length || sc>image[0].length ){
            return image;
        }
        if(image[sr][sc]!=color){
            floodFillPoint(image,sr,sc,image[sr][sc], color);
        }
        return image;

    }
    public static void floodFillPoint(int[][] image, int sr, int sc, int currentColor, int replaceColor) {
        if(sr<0 || sr>=image.length || sc<0 || sc>=image[0].length)
            return;
        if(image[sr][sc]==currentColor){
            image[sr][sc] = replaceColor;
        }else{
            return;
        }
        floodFillPoint(image,sr+1,sc,currentColor,replaceColor);
        floodFillPoint(image,sr-1,sc,currentColor,replaceColor);
        floodFillPoint(image,sr,sc+1,currentColor,replaceColor);
        floodFillPoint(image,sr,sc-1,currentColor,replaceColor);

    }
}
