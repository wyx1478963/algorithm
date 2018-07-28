package interview.exercises.e47;

/**
 * 在一个 m*n 的棋盘的每一个格都放有一个礼物，每个礼物都有一定价值（大于 0）。
 * 从左上角开始拿礼物，每次向右或向下移动一格，直到右下角结束。给定一个棋盘，求拿到礼物的最大价值。例如，对于如下棋盘
 * <p>
 * 1    10   3    8
 * 12   2    9    6
 * 5    7    4    11
 * 3    7    16   5
 * 礼物的最大价值为 1+12+5+7+7+16+5=53。
 */
public class MaxValue {

    public static int findPath(int[][] matrix) {
        if (matrix == null) {
            return 0;
        }
        int rowLength = matrix[0].length;
        int columnLength = matrix.length;
        int[][] valueMatrix = new int[columnLength][rowLength];
        valueMatrix[0][0] = matrix[0][0];
        for (int i = 1; i < rowLength; i++) {
            valueMatrix[0][i] = matrix[0][i] + valueMatrix[0][i - 1];
        }
        for (int j = 1; j < columnLength; j++) {
            valueMatrix[j][0] = matrix[j][0] + valueMatrix[j - 1][0];
        }
        for (int i = 1; i < rowLength; i++) {
            for (int j = 1; j < columnLength; j++) {
                valueMatrix[j][i] = Math.max(valueMatrix[j - 1][i], valueMatrix[j][i - 1]) + matrix[j][i];
            }
        }
        return valueMatrix[columnLength - 1][rowLength - 1];
    }

    public static void main(String[] args) {
        System.out.println(findPath(new int[][]{
                {1, 10, 3, 8},
                {12, 2, 9, 6},
                {5, 7, 4, 11},
                {3, 7, 16, 5}
        }));
    }
}
