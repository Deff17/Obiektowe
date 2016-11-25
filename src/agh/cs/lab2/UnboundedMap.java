package agh.cs.lab2;

import java.util.LinkedList;

/**
 * Created by David on 2016-11-18.
 */
public class UnboundedMap extends AbstractWorldMap implements IWorldMap {
    LinkedList<HayStack> hayList = new LinkedList<HayStack>();

    public UnboundedMap(LinkedList<HayStack> list){
       this.hayList = list;
    }

    public boolean canMoveTo(Position position) {
        if (!this.isOccupied(position))
            return true;
        else
            return false;
    }

    public boolean add(Car car) {
        if (!isOccupied(car.getPosition())) {
            carList.add(car);
            return true;
        }
        throw new IllegalArgumentException("Pozycja" + car.getPosition() + "jest zajęta");
    }

    public boolean isOccupied(Position position) {
        boolean isocc = super.isOccupied(position);
        if (isocc)
            return true;
        for (HayStack Hay : hayList) {
            if (Hay.getPosition().equals(position)) {
                return true;
            }
        }
        return false;
    }

    public Object objectAt(Position position) {
        Object object = super.objectAt(position);
        if (object != null)
            return object;
        for (HayStack Hay : hayList)
            if (Hay.getPosition().equals(position))
                return Hay;
        return null;
    }

    public String toString() {
        Position LDC = new Position(100, 100);
        Position URC = new Position(-100, -100);
        for (Car auto : carList) {
            if (auto.getPosition().x < LDC.x)
                LDC.x = auto.getPosition().x;
            if (auto.getPosition().y < LDC.y)
                LDC.y = auto.getPosition().y;
            if (auto.getPosition().x > URC.x)
                URC.x = auto.getPosition().x;
            if (auto.getPosition().y > URC.y)
                URC.y = auto.getPosition().y;
        }
        for (HayStack Hay : hayList) {
            if (Hay.getPosition().x < LDC.x)
                LDC.x = Hay.getPosition().x;
            if (Hay.getPosition().y < LDC.y)
                LDC.y = Hay.getPosition().y;
            if (Hay.getPosition().x > URC.x)
                URC.x = Hay.getPosition().x;
            if (Hay.getPosition().y > URC.y)
                URC.y = Hay.getPosition().y;
        }
        MapVisualizer mapW = new MapVisualizer();
        return mapW.dump(this, new Position(1,1), new Position(9,9));
    }
}
