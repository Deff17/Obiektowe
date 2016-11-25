package agh.cs.lab2;

import java.util.LinkedList;

/**
 * Created by David on 2016-11-18.
 */
public abstract class AbstractWorldMap {
    protected LinkedList<Car> carList = new LinkedList<Car>();

    public void run(MoveDirection[] directions) {
        for (int i = 0; i < directions.length; i++)
            if (carList.size() != 0)
                carList.get(i % carList.size()).move(directions[i]);
    }
    public Object objectAt(Position position) {
        for (Car auto : carList) {
            if (auto.getPosition().equals(position)) {
                return auto;
            }
        }
        return null;
    }
    public boolean isOccupied(Position position) {
        for (Car auto : carList) {
            if (auto.getPosition().equals(position))
                return true;
        }
        return false;
    }
}
