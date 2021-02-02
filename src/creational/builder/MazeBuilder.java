package creational.builder;

import creational.maze.Maze;

public class MazeBuilder {

    protected MazeBuilder(){

    }

    public void buildMaze(){

    }

    public void buildRoom(int roomNr){

    }

    public void builderDoor(int roomFrom, int roomTo){

    }

    public Maze getMaze(){
        return null;
    }

    public static void main(String[] args) {
        Maze maze;
        MazeGame game;
        StandardMazeBuilder builder;
        // ??
        //game.createMaze(builder);
        //maze = builder.getMaze();
    }
}
