import java.util.Arrays;
public class Combining {
	public static void main(String[] args) {
		int[][] imageData={{100,90,255,80,70,255,60,50},
							         {255,10,5,255,10,5,255,255},
							         {255,255,255,0,255,255,255,75},
							         {255,60,30,0,30,60,255,255}};
		
		//First, we want to crop the image down to a 4x6 image, removing the right 2 columns. Declare and initialize a new 2D array of integers with 4 rows and 6 columns called `newImage`.
		int[][] newImage = new int[4][6];
    for(int i =0;i<4;i++){
      for(int j =0;j<6;j++){
        newImage[i][j]=imageData[i][j];
      }
    }

		System.out.println(Arrays.deepToString(newImage));

		//You want to decrease the brightness of the new image by 50 units. The way this works is that for every integer in the new 2D array, we will subtract the value by 50. Remember that the value range for the pixel is 0-255, so if the result tries to go below 0, just set it equal to 0.
    System.out.println("Decreasing brightness by 50 units: ");
		for(int i =0;i<4;i++){
      for(int j =0;j<6;j++){
        newImage[i][j]-=50;
        if(newImage[i][j]<0){
          newImage[i][j] =0;
        }
      }
    }
		
		System.out.println(Arrays.deepToString(newImage));
	}
}
