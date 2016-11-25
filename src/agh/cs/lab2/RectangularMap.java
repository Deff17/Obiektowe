package agh.cs.lab2;

/**
 * Created by David on 2016-11-17.
 */
public class RectangularMap extends AbstractWorldMap implements IWorldMap {
    private Position mapPosition;
    private Position startPoint = new Position(0, 0);

    public RectangularMap(int width, int height) {
        if (width > 0 && height > 0) {
            this.mapPosition = new Position(width, height);
        }
    }

    public boolean canMoveTo(Position position) {
        if (position.larger(startPoint) && position.smaller(mapPosition))
            return true;
        else
            return false;
    }

    public boolean add(Car car) {
        if (!isOccupied(car.getPosition()) && car.getPosition().smaller(mapPosition) && car.getPosition().larger(startPoint)) {
            carList.add(car);
            return true;
        }
        return false;
    }
    public String toString() {
        MapVisualizer mapW = new MapVisualizer();
        return mapW.dump(this, startPoint, mapPosition);
    }
}