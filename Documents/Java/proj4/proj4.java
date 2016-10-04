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
	//System.out.print(rowSize + " " + colSize); Test statement
	line = s.nextLine();
	//Just creating code blocks ignore this
	//You have the size of the matrix in rowSize and colSize. So now you have to take the rest of the file and add it to the matrix in the right spot. Don't forget about the parity bits
	int[][] picture = new int[rowSize][colSize];
	int i = 0;
	int j = 0;
	for (i = 0; i < rowSize; i++) {
		line = s.nextLine();
		//System.out.println("The first for loop is working"); Test statements
		for (j = 0; j < colSize; j++) {
			if (j < colSize) {
				//System.out.println("The second for loop is working" + " " + j); Test statement
				char valueChar = line.charAt(j);
				int value = (int)(valueChar - '0');
				//System.out.println(value); Test statement
				//Really bad way to do this but I don't feel like figuring out the problem with my input array
				picture[i][j] = value;
				if (j < colSize) {
					System.out.print(picture[i][j]);
					//System.out.print(j);TS
					continue;
				}
				else {
					System.out.println("");
				}
			}
		}
	}

	//The part above works like a charm.
	//Except it's printing the parity bits
	//Try to fix that down here.
		//for (int m = 0; m <= rowSize - 1; m++) {
			//for (int n = 0; n <= colSize - 1; n++) {
				//System.out.print(picture[m][n]);
			//}
			//System.out.println("");
		//} get this shit code out of my project
	}
}




	

	
