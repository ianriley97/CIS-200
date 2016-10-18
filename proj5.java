import java.util.*;
import java.text.*;
import java.io.*;
public class proj5 {
	public static void main(String[] args) {
	//Make a do while loop to print the board over and over again
	/**
		int rows=9;
		int cols=9;
		int [][] gameboard = new int[rows][cols];
		int cellSize = 4;
		int rowLength = cols * cellSize + cols + 1;
		final char[] array = new char[rowLength];
		Arrays.fill(array, '-');
		String rowDivider = new String(array);
		for(int i = 0; i < gameboard.length; i++) {
			if (i == 0) {
				for(int j = 0; j < gameboard[i].length; j++) {
			        System.out.print(cellSize + gameboard[i][j]);
			        if(j == (gameboard[i].length - 1)) {
						System.out.println(j + "|");
			    	}
				}
			}
		    System.out.println(rowDivider);
		    for(int j = 0; j < gameboard[i].length; j++) {
		        System.out.printf("|%"+cellSize+"d",gameboard[i][j]);
		        if(j == (gameboard[i].length - 1)) {
					System.out.println("|");
		    	}
			}
			System.out.println(rowDivider);
		}
	**/
	String[][] gameboard = new String[9][9];

	  for (int i = 0; i < gameboard.length; i++) {
	  	if (i != 0) {
	  		System.out.println("-------------------------");
	  	}
	        for (int j = 0; j < gameboard[i].length; j++) {
	        /**
	        	if (i == 0) {
	        		if (j > 0) {
			        	System.out.print(i);
			            if (j < gameboard[i].length) {
			                System.out.print("| ");
			            }	
			        }
			        else {
			        	System.out.print(" ");
			        	if (j < gameboard[i].length) {
			        		System.out.print("| ");
			        	}
			        }
	        	}
	        **/
	        if (i == 0 && j ==0) {
	        		System.out.print(" ");
	        		System.out.print("| ");
	        	}
	        if (j == 0 && i != 0) {
		        	System.out.print(i);
		        	if (j < gameboard[i].length) {
		        		System.out.print("| ");
		        	}
	        }
	        if (i == 0 && j != 0) {
	        	System.out.print(j);
	        	if (j < gameboard[i].length) {
	        		System.out.print("| ");
	        	}
	        }
	        else if (i != 0 && j != 0) {
	        	if (gameboard[i][j] != null) {
		            if (j < gameboard[i].length) {
		                System.out.print("| ");
		            }
	        	}
	        	else {
	        		if (j < gameboard[i].length) {
		                System.out.print(" | ");
	        		}
	       		}
	        } 
	    }
	    System.out.println();
	}
}
}
