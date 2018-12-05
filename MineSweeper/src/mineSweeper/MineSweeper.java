package mineSweeper;

import java.util.Random;

public class MineSweeper {

	public static void main(String[] args) {
		
		char mines [] = {'X','0'};
		char twoDArray[][] = new char [10][10];
		
		Random bombs = new Random();
		
		for(int i=0;i<twoDArray.length;i++) {
			twoDArray [i][i] = mines[bombs.nextInt(mines.length)];
		
			for(int j=0;j<twoDArray.length;j++) {
				twoDArray [i][j] = mines[bombs.nextInt(mines.length)];
				System.out.print(twoDArray[i][j]);
			}
			System.out.println();
		}
	}
}

