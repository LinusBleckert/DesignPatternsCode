package creational.abstractfactory;

import creational.maze.Door;
import creational.maze.Maze;
import creational.maze.Room;

import static creational.maze.Room.Direction.*;

public class MazeGame {

    public Maze createMaze(MazeFactory factory){

        Maze aMaze = factory.makeMaze();
        Room r1 = factory.makeRoom(1);
        Room r2 = factory.makeRoom(2);
        Door aDoor = factory.makeDoor(r1,r2);

        aMaze.addRoom(r1);
        aMaze.addRoom(r2);

        r1.setSide(North, factory.makeWall());
        r1.setSide(East, aDoor);
        r1.setSide(South, factory.makeWall());
        r1.setSide(West, factory.makeWall());

        r2.setSide(North, factory.makeWall());
        r2.setSide(East, factory.makeWall());
        r2.setSide(South, factory.makeWall());
        r2.setSide(West, aDoor);

        return aMaze;
    }
}
