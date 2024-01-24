import java.util.Arrays;
public class Modifying {
	public static void main(String[] args) {
		// Using the provided 2D array
	  int[][] intMatrix = {
				{1, 1, 1, 1, 1},
				{2, 4, 6, 8, 0},
				{9, 8, 7, 6, 5}
		};   
    
    intMatrix[1][1]=0;
    System.out.println(Arrays.deepToString(intMatrix));
/*
    int[][] subMatrix= new int [2][2];
    subMatrix [0][0]= intMatrix[0][0]*5;
    subMatrix [0][1]= intMatrix[0][1]*5;
    subMatrix [1][0]= intMatrix[1][0]*5;
    subMatrix [1][1]= intMatrix[1][1]*5;
    */
	  	for(int i =0;i<2;i++){
      for(int j =0;j<2;j++){
        subMatrix[i][j]=intMatrix[i][j]*5;
      }
    } 
    
   System.out.println(Arrays.deepToString(subMatrix));
    }
}
