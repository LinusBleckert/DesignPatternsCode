package creational.builder;

import creational.maze.Maze;

public class CountingMazeBuilder extends MazeBuilder{

    int rooms, doors;
    public CountingMazeBuilder() {
        rooms = doors = 0;
    }

    @Override
    public void buildMaze() {
        super.buildMaze();
    }

    @Override
    public void buildRoom(int roomNr) {
        rooms++;
    }

    @Override
    public void builderDoor(int roomFrom, int roomTo) {
        doors++;
    }

    public int getCountRoom(){
        return rooms;
    }

    public int getCountDoors(){
        return doors;
    }

    @Override
    public Maze getMaze() {
        return super.getMaze();
    }
}
