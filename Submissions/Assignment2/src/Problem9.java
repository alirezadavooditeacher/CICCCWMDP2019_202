/**
 * Implement a function which receives a 2D list which represent the following grid:
 * The dark cell means they are empty.
 * Each cell is associated a number (called weight) based on its row’s and column’s number.
 * The number is calculated using this formula: (i+j)*3-10.
 * For instance the cell[4][5] = (4+5)*3-10=27-10=17
 * The function should find the cell whose total sum of it’s neighbour weight is maximum and
 * return a tuple which contains the row and column of the cell. The numbers of a cell is
 * defined as all cells that have an edge in common with the cell. For instance the neighbours of
 * the green cell is all the red cells
 */
public class Problem9 {

    public static int[] findTheHeaviestCell(int[][] grid) {
        int heaviest = 0;
        int[] pos = {0, 0};

        for (int y = 0; y < grid.length; y++) {
            int[] row = grid[y];
            for (int x = 0; x < row.length; x++) {
                int weight = sumNeighbours(grid, x, y);
                if (heaviest < weight) {
                    heaviest = weight;
                    pos[0] = y;
                    pos[1] = x;
                }
            }
        }

        return pos;
    }

    private static int sumNeighbours(int[][] grid, int x, int y) {
        return (
            calcWeight(grid, x, y) +    // center
            calcWeight(grid, x -1, y) + // left
            calcWeight(grid, x +1, y) + // right
            calcWeight(grid, x, y -1) + // top
            calcWeight(grid, x, y +1)  // bottom
        );
    }

    private static int calcWeight(int[][] grid, int x, int y) {
        if (x < 0 || y < 0 || grid.length -1 < y || grid[y].length -1 < x) {
            return 0;
        }
        return ((x + y) * 3 - 10) * grid[y][x];
    }
}
