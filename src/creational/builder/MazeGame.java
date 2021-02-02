package creational.builder;

import creational.maze.Maze;

public class MazeGame{

    public Maze createMaze(MazeBuilder builder){

        builder.buildMaze();
        builder.buildRoom(1);
        builder.buildRoom(2);
        builder.builderDoor(1,2);
        return builder.getMaze();
    }
}
