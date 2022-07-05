class Solution {
    public int[][] floodFill(int[][] image, int sr, int sc, int color) {
   //no need to do anything if oldColor and newColor are same
        if(image[sr][sc]!=color) {
            floodFill(image,sr,sc,color,image[sr][sc]);            
        }
        return image;
    }
    
    
    private void floodFill(int[][] image, int i, int j, int newColor,int oldColor) {
        if(i<0||j<0||i>=image.length||j>=image[0].length||image[i][j]!=oldColor||image[i][j]==newColor) {
            return;
        }
        image[i][j]=newColor;
        floodFill(image,i+1,j,newColor,oldColor);
        floodFill(image,i,j+1,newColor,oldColor);
        floodFill(image,i-1,j,newColor,oldColor);
        floodFill(image,i,j-1,newColor,oldColor);
}
}