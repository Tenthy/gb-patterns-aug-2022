package ru.kmetha.gbpatterns.homework4;

import ru.kmetha.gbpatterns.homework4.field.ChessBoard;
import ru.kmetha.gbpatterns.homework4.pieces.Color;
import ru.kmetha.gbpatterns.homework4.player.Player;

public class MainGame {

    public static void main(String[] args) {
        Player player1 = new Player(1, Color.WHITE);
        Player player2 = new Player(1, Color.BLACK);

        ChessBoard chessBoard = new ChessBoard();

        player1.move();
        player2.move();
    }
}
