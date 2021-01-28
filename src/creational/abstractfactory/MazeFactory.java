package creational.abstractfactory;

import creational.maze.Door;
import creational.maze.Maze;
import creational.maze.Room;
import creational.maze.Wall;

public class MazeFactory {

    public MazeFactory(){

    }

    public Maze makeMaze(){
        return new Maze();
    }

    public Wall makeWall(){
        return new Wall();
    }

    public Room makeRoom(int roomNr){
        return new Room(roomNr);
    }

    public Door makeDoor(Room r1, Room r2){
        return new Door(r1, r2);
    }
}
