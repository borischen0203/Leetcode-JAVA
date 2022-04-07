
public class solution200 {
    public int numIslands(char[][] grid) {
        int xLength = grid.length;
        if (grid == null || grid.length == 0 || grid[0].length == 0) {
            return 0;
        }
        int yLength = grid[0].length;
        int result = 0;
        boolean[][] visited = new boolean[xLength][yLength];
        for (int x = 0; x < xLength; x++) {
            for (int y = 0; y < yLength; y++) {
                if (grid[x][y] == '1' && visited[x][y] == false) {
                    result++;
                    dfs(grid, visited, x, y);
                }
                // if (grid[x][y] == '1') {
                // result++;
                // dfs2(grid, x, y);
                // }
            }
        }
        return result;
    }

    public void dfs(char[][] map, boolean[][] visited, int x, int y) {
        int xLength = map.length;
        int yLength = map[0].length;
        if (x >= 0 && y >= 0 && x < xLength && y < yLength && visited[x][y] == false && map[x][y] == '1') {
            visited[x][y] = true;
            dfs(map, visited, x, y + 1);
            dfs(map, visited, x + 1, y);
            dfs(map, visited, x - 1, y);
            dfs(map, visited, x, y - 1);
        }
    }

    // public void dfs2(char[][] map, int x, int y) {
    // int xLength = map.length;
    // int yLength = map[0].length;
    // if (x >= 0 && y >= 0 && x < xLength && y < yLength && map[x][y] == '1') {
    // map[x][y] = 0;
    // dfs2(map, x, y + 1);
    // dfs2(map, x + 1, y);
    // dfs2(map, x - 1, y);
    // dfs2(map, x, y - 1);
    // }
    // }

    public static void main(String[] args) {
        char[][] map = new char[][] { { '1', '1', '1' }, { '1', '1', '0' }, { '1', '0', '1' } };
        solution200 a = new solution200();
        System.out.println(a.numIslands(map));
    }
}