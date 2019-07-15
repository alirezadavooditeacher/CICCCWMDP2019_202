package app.criteria;

import app.entity.Building;

import java.util.List;

public class BuildingHigherThan extends Criteria<Building> {
    int floor;

    public BuildingHigherThan(int floor) {
        this.floor = floor;
    }

    public int getFloor() {
        return floor;
    }

    @Override
    public boolean satisfied(Building el, List<Building> data) {
        return el.getNumFloors() > floor;
    }
}
