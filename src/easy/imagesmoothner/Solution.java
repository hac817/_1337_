package easy.imagesmoothner;
/*
* An image smoother is a filter of the size 3 x 3 that can be applied to each cell of an image by rounding down
* the average of the cell and the eight surrounding cells (i.e., the average of the nine cells in the blue smoother).
* If one or more of the surrounding cells of a cell is not present, we do not consider it in the average (i.e.,
* the average of the four cells in the red smoother).
* */
class Solution {
    public int[][] imageSmoother(int[][] img) {
        int m = img.length;
        int n = img[0].length;

        int [][] newImg = new int[m][n];

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                int cellCount = 0;
                int totalGS = 0;
                for (int di = -1; di <= 1; di++) {
                    for (int dj = -1; dj <= 1; dj++) {
                        if (i + di < 0) continue;
                        if (i + di >= m) continue;
                        if (j + dj < 0) continue;
                        if (j + dj >= n) continue;

                        cellCount++;
                        totalGS += img[i + di][j + dj];
                    }
                }

                int avg = totalGS/cellCount;
                newImg[i][j] = avg;

            }
        }

        return newImg;
    }
}
