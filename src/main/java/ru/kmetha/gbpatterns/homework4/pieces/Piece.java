package ru.kmetha.gbpatterns.homework4.pieces;

import ru.kmetha.gbpatterns.homework4.action.Motion;

public abstract class Piece implements Motion {

    protected Color color;
    protected String type;
    protected int[][] initialCoordinates;
    protected int[][] currentCoordinates;

    public Piece(Color color, int[][] initialCoordinates) {
        this.color = color;
        this.initialCoordinates = initialCoordinates;
    }

    @Override
    public void move(int[][] coordinates, boolean isValid) {
        this.currentCoordinates = coordinates;
    }
}
