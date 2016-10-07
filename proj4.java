import java.util.*;
import java.text.*;
import java.io.*;

public class proj4 {
	public static void main(String [] args) throws IOException {
	Scanner p = new Scanner(System.in);
	System.out.println("Enter the name of input file: ");
	Scanner s = new Scanner(new File(p.nextLine()));
	//This works. This prints out the first line of the file. The size of the file.
	String line = s.nextLine();
	String row = line.substring(0, 2);
	int rowSize = Integer.parseInt(row);
	String col = line.substring(3, 5);
	int colSize = Integer.parseInt(col);
	//System.out.println(rowSize + " " + colSize); //Test statement
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
					//System.out.print(picture[i][j]);
					//System.out.print(j);TS
					continue;
			}
		}
	}
	//The part above works like a charm.
	//Fucking golden
	//Now this is the part with checking the parity bits
	//Don't even bother doing the fixing here. Maybe I will add it later
	//We'll try using a for loop first to count the ones and zeroes of the row and
	//then decide if the parity bit should be a one or zero.
	//The do the exact same thing for columns
	int count = 0;
	int parity = 0;
	int parityRow = 0;
	//picture[row][col]
	//System.out.print(picture[25][43]);
	int parity2 = 0;
	int count2 = 0;
	int n = 0;
	int m = 0;
	int parityCheck = 0;
	//Horizontal Parity Checker]
	//This is where my problem is now
	for (n = 0; n < rowSize - 1; n++) {
		count = 0;
		for (m = 0; m < colSize - 1; m++) {
			if (picture[n][m] == 1) {
				count++;
			}
		}
		parity = count % 2;
		if (parity != picture[n][colSize - 1]) {
			//System.out.println("Row " + n + " " + "col " + m + "count " + count + "Parity " + parity + "What parity should be " + picture[n][colSize - 1]);
			parityRow = n;
			parityCheck++;
			//break;
		}
	}
	//Vertical Check is fine
	for (int k = 0; k < colSize - 1; k++) {
		count2 = 0;
		for (int r = 0; r < rowSize - 1; r++) {
			if (picture[r][k] == 1) {
				count2++;
			}
		}
		parity2 = count2 % 2;
		if (parity2 != picture[rowSize - 1][k]) {
			if (parityCheck > 1) {
				System.out.println("The image file is corrupted!");
				System.exit(0);
			}
			//System.out.println(parity2);
			System.out.println("Position (" + parityRow + "," + k + ")" + " was modified...correcting");
			picture[parityRow][k] = 0;
			//break;
		}
	}
		//if (parityCheck > 1) {
			//System.out.println("The image file is corrupted!");
			//System.exit(0);
		//}
			System.out.println("What character would you like to use for white?");
			String characterWhite = p.nextLine();
			System.out.println("What character would you like to use for black?");
			String characterBlack = p.nextLine();
	/**
	for (int n = 0; n < rowSize - 1; n++) { //This is definitely fine the problem is inside this for loop
		//System.out.print("(" + n + ")");
		//System.out.println("The first for loop is working " + n);
		for (int m = 0; m < colSize - 1; m++) { //This is fine
			//System.out.println("The second for loop is working " + m);
			if (picture[n][m] == 1) { //This could be a problem if nm aren't working keep
				count++; //an eye out here
				//System.out.println(count);
				//System.out.println("The first if is working");
			}
		} //SOmething is fucking up here and I can't find it
		parity = count % 2; //This probably isn't a problem
		//System.out.println("the parity is" + parity);
		if (parity != picture[n][44]) { //Shouldn't be the problem
			//System.out.println("The second if statement is working");
			count = 0; //This could be a problem if the variable is fucking itself
			for (int k = 0; k < colSize - 1; k++) { //This who section is most likely the fuckup
				//System.out.println("The third for loop is working " + k);
				for (int g = 0; g < rowSize - 1; g++) {
					//System.out.println("The fourth for loop is working" + g);
					if (picture[g][k] == 1) {
						count++;
						//System.out.println("The third if statement is working");
					}
				}
				parity = count % 2;
				if (parity != picture[26][k]) {
					System.out.println("(" + parity + ")" + "(" + picture[26][k] + "," + picture[n][43] + ")" + n + "Row" + k + "col");
					//System.out.println("The fourth if statement is working " + parity + " " + picture[25][k] + " " +  k + n);
					picture[n][k] = 1;
					//System.out.println("Position (" + n + ", " + k + " was modi6fied...correcting");
				}
			}
		}
	}
	/**
	for (int n = 0; n < rowSize - 1; n++) {
		for (int m = 0; m < colSize - 1; m++) {
			if (m < colSize) {
				if (picture[n][(rowSize) - 1] == picture[m][(colSize) - 1]) {
					System.out.print("Position " + n + ", " + m + " out of place correcting" );
					picture[n][m] = 1;
					continue;
				}
			}
		}
	}
	**/
	for (int b = 0; b < rowSize - 1; b++) {
		//System.out.println(b);
		for (int a =0; a < colSize - 1; a++) {
			if (picture[b][a] == 1) {
				System.out.print(characterWhite);
			}
			else {
				System.out.print(characterBlack);
			}
		}
	}
	}
}




	

	
