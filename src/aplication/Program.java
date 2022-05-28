package aplication;

import boardgame.Board;
import chess.ChessMarch;

public class Program {

	public static void main(String[] args) {

		ChessMarch chessMatch = new ChessMarch();
		UI.printBoard(chessMatch.getPieces());
		
	}

}
