package src.problem1;

import java.util.ArrayList;

public class CastleBuilder {

    private enum Statement {
        UP,
        DOWN,
        FLAT
    }

    public Integer build(ArrayList<Integer> stretchOfLand) {

        Integer numberOfCastle = 0;
        int lastHeight = 0;
        int addNumberOfCastle = 0;
        Statement lastStatement = Statement.FLAT;
        Statement thisStatement = Statement.FLAT;

        for (int i = 0; i < stretchOfLand.size(); i++) {

            int height = stretchOfLand.get(i);

            if (i == 0) {
                numberOfCastle++;
                lastHeight = height;
                continue;
            }

            if (lastHeight == height) {
                // not change thisStatement
                addNumberOfCastle++;

            } else if (lastHeight < height) {
                thisStatement = Statement.UP;

                if (lastStatement == Statement.DOWN) {
                     addNumberOfCastle++;
                     numberOfCastle += addNumberOfCastle;
                }
                addNumberOfCastle = 0;
                lastStatement = thisStatement;

            } else {
                thisStatement = Statement.DOWN;

                if (lastStatement == Statement.UP) {
                    addNumberOfCastle++;
                    numberOfCastle += addNumberOfCastle;
                }
                addNumberOfCastle = 0;
                lastStatement = thisStatement;

            }

            lastHeight = height;

        }

        return numberOfCastle;
    }
}
