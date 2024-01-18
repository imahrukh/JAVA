public class EqualNotEqual {
	public static void main(String[] args) {   
		int songsA = 9;
    int songsB = 9;
    int albumLengthA = 41;
    int albumLengthB = 53;
    boolean sameNumberOfSongs = songsA== songsB;
     System.out.println("Same no of songs of A, B: "+ sameNumberOfSongs);
    boolean differentLength = albumLengthA!=albumLengthB;
    System.out.println("Unequal lengths of A, B: "+ differentLength);
	}
}
