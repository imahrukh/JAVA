public class Introduction {
	public static void main(String[] args) {
		int[][] intMatrix = {
				{ 4,  6,  8, 10, 12, 14, 16},
				{18, 20, 22, 24, 26, 28, 30},
				{32, 34, 36, 38, 40, 42, 44},
				{46, 48, 50, 52, 54, 56, 58},
				{60, 62, 64, 66, 68, 70, 79}
		};
	
    int numSubArrays = intMatrix.length;
    System.out.println("The no of rows: "+numSubArrays);
    int subArrayLength = intMatrix[0].length;
    for(int i =0;i<numSubArrays;i++){
       subArrayLength = intMatrix[i].length;
       System.out.println("Row "+i+"  length: "+ subArrayLength);
    }
   
    int columns = subArrayLength;
    int rows = numSubArrays;
		
		int sum = 0;
		for(int i=0; i<rows; i++) {
			for(int j = 0; j < columns; j++) {
				sum+=intMatrix[i][j];
			}
		}
		System.out.println("Sum: "+sum);
	}
}
