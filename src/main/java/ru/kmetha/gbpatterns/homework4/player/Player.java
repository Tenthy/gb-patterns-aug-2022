package ru.kmetha.gbpatterns.homework4.player;

import ru.kmetha.gbpatterns.homework4.action.Motion;
import ru.kmetha.gbpatterns.homework4.field.ChessBoard;
import ru.kmetha.gbpatterns.homework4.pieces.Bishop;
import ru.kmetha.gbpatterns.homework4.pieces.Color;
import ru.kmetha.gbpatterns.homework4.pieces.Piece;

import java.util.List;

public class Player {

    private int id;
    private Color color;

    private ChessBoard chessBoard;
    private List<Piece> pieces;

    private Motion motion;

    public Player(int id, Color color) {
        this.id = id;
        this.color = color;
    }

    public void move() {
        //...
    }
}
