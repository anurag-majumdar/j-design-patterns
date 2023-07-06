package creational_patterns.builder;

public class Maze {
    private final int doors;
    private final int walls;

    public int getDoors() {
        return this.doors;
    }

    public int getWalls() {
        return this.walls;
    }

    public Maze(MazeBuilder mazeBuilder) {
        this.doors = mazeBuilder.doors;
        this.walls = mazeBuilder.walls;
    }

    public static class MazeBuilder {
        private int doors;
        private int walls;

        private MazeBuilder() {}

        public static MazeBuilder builder() {
            return new MazeBuilder();
        }

        public MazeBuilder doors(int doors) {
            this.doors = doors;
            return this;
        }

        public MazeBuilder walls(int walls) {
            this.walls = walls;
            return this;
        }

        public Maze build() {
            return new Maze(this);
        }
    }
}
