package app.criteria;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import app.entity.Building;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;

class BuildingHigherThanTest {
    BuildingHigherThan criteria;
    ArrayList<Building> buildings;

    @BeforeEach
    void setUp () {
        criteria = new BuildingHigherThan(10);

        buildings = new ArrayList<>();
        buildings.add(new Building("address 1", 11,1989));
        buildings.add(new Building("address 1", 10, 2018));
        buildings.add(new Building("address 1", 9, 2018));
    }

    @Test
    void satisfiedReturnsTrueIfTheFloorIsGraterThanCriteria() {
        boolean actual = criteria.satisfied(buildings.get(0), buildings);
        assertTrue(actual);
    }

    @Test
    void satisfiedReturnsTrueIfTheFloorIsLessThanOrEqualsCriteria() {
        boolean actual = criteria.satisfied(buildings.get(1), buildings);
        assertFalse(actual);

        actual = criteria.satisfied(buildings.get(2), buildings);
        assertFalse(actual);
    }
}