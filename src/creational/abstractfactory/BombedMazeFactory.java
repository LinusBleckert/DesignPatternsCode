package creational.abstractfactory;

import creational.maze.Room;
import creational.maze.Wall;

public class BombedMazeFactory extends MazeFactory{

    @Override
    public Wall makeWall() {
        throw new UnsupportedOperationException();
        //return new BombWall();
    }

    @Override
    public Room makeRoom(int roomNr) {
        throw new UnsupportedOperationException();
        //return new RoomWithABomb(roomNr);
    }
}
