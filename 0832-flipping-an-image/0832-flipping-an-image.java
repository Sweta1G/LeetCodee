class Solution {
    public int[][] flipAndInvertImage(int[][] image) {
        
        int n= image.length;
        //flipping
        for(int i=0; i<n; i++){
            int temp=0, r=n-1;

            for(int j=0; j<n/2; j++){
                temp=image[i][j];
                image[i][j]= image[i][r];
                image[i][r]= temp;
                r--;
            }
        }
        
        //inverting
        for(int i=0; i<n; i++){
            for(int j=0; j<n; j++){
                if(image[i][j]==0) image[i][j]=1;
                else
                    image[i][j]=0;
            }
        }
        return image;
    }
}