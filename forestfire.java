import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class forestfire {

    static class Cell {
        int row, col, time;

        public Cell(int row, int col, int time) {
            this.row = row;
            this.col = col;
            this.time = time;
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input size of the forest
        int m = scanner.nextInt();
        int n = scanner.nextInt();

        // Input starting coordinates of the fire
        int startX = scanner.nextInt() - 1;
        int startY = scanner.nextInt() - 1;

        // Input the forest layout
        char[][] forest = new char[m][n];
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                forest[i][j] = scanner.next().charAt(0);
            }
        }

        // Output the result
        int result = calculateTimeToCatchFire(forest, startX, startY);
        System.out.println(result);

        scanner.close();
    }

    private static int calculateTimeToCatchFire(char[][] forest, int startX, int startY) {
        int[] rowDirections = {-1, -1, -1, 0, 0, 1, 1, 1};
        int[] colDirections = {-1, 0, 1, -1, 1, -1, 0, 1};

        Queue<Cell> queue = new LinkedList<>();
        queue.offer(new Cell(startX, startY, 0));

        while (!queue.isEmpty()) {
            Cell current = queue.poll();

            for (int i = 0; i < 8; i++) {
                int newRow = current.row + rowDirections[i];
                int newCol = current.col + colDirections[i];

                if (isValid(newRow, newCol, forest.length, forest[0].length) && forest[newRow][newCol] == 'T') {
                    forest[newRow][newCol] = 'W'; // Mark the tree as burnt
                    queue.offer(new Cell(newRow, newCol, current.time + 1));
                }
            }
        }

        return queue.peek().time;
    }

    private static boolean isValid(int row, int col, int numRows, int numCols) {
        return row >= 0 && row < numRows && col >= 0 && col < numCols;
    }
}

