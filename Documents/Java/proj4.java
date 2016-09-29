import java.util.*;
import java.text.*;
import java.io.*;

public class proj4 {
	public static void main(String [] args) throws IOException {
	Scanner s = new Scanner(new File("flower.txt"));
	//This works. This prints out the first line of the file. The size of the file.
	String line = s.nextLine();
	String row = line.substring(0, 2);
	int rowSize = Integer.parseInt(row) - 1;
	String col = line.substring(3, 5);
	int colSize = Integer.parseInt(col) - 1;
	System.out.print(rowSize + " " + colSize);
	//Just creating code blocks ignore this
	//You have the size of the matrix in rowSize and colSize. So now you have to take the rest of the file and add it to the matrix in the right spot. Don't forget about the parity bits
	int[][] picture = new int[rowSize][colSize];
	int curRow = 0;
	int curCol = 0;
	int i = 0;
	for (i = 0; i <= rowSize - 1; i++) {
		String rowPicture = s.nextLine();
		String[] values = rowPicture.split("");
		System.out.println(" " + Arrays.toString(values).replace("[", "").replace("]", "").replace(",", ""));
	}
	//The part above works like a charm.
	//Except it's printing the parity bits
	//Try to fix that down here. 
	}
}