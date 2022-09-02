package ru.kmetha.gbpatterns.homework4.pieces;

public class Rock extends Piece {

    public Rock(Color color, int[][] initialCoordinates) {
        super(color, initialCoordinates);
    }

    @Override
    public void move(int[][] coordinates, boolean isValid) {
        super.move(coordinates, isValid);
    }
}
