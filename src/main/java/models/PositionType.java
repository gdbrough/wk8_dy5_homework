package models;

public enum PositionType {
    FIRST(25),
    SECOND(20),
    THIRD(16),
    FOURTH(13),
    FIFTH(11),
    SIXTH(10),
    SEVENTH(9),
    EIGHTH(8),
    NINTH(7),
    TENTH(6),
    ELEVENTH(5),
    TWELFTH(4),
    THIRTEENTH(3),
    FOURTEENTH(2),
    FIFTEENTH(1);

    private int pointsForPosition;

    PositionType(int pointsForPosition) {
        this.pointsForPosition = pointsForPosition;
    }

    public int getPointsForPosition() {
        return pointsForPosition;
    }

}
