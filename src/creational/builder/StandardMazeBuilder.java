package creational.builder;

import creational.maze.Door;
import creational.maze.Maze;
import creational.maze.Room;
import creational.maze.Wall;

public class StandardMazeBuilder extends MazeBuilder{

    private Maze currentMaze;
    public StandardMazeBuilder() {
        currentMaze = null;
    }

    @Override
    public void buildRoom(int roomNr) {
        if(currentMaze.getRoomNr(roomNr) != null){
            Room room = new Room(roomNr);
            currentMaze.addRoom(room);

            room.setSide(Room.Direction.North, new Wall());
            room.setSide(Room.Direction.South, new Wall());
            room.setSide(Room.Direction.East, new Wall());
            room.setSide(Room.Direction.West, new Wall());
        }
    }

    @Override
    public void builderDoor(int roomFrom, int roomTo) {
        //super.builderDoor(roomFrom, roomTo);
        Room r1 = currentMaze.getRoomNr(roomFrom);
        Room r2 = currentMaze.getRoomNr(roomTo);
        Door d = new Door(r1, r2);

        // Should check common wall somehow instead
        r1.setSide(Room.Direction.West, d);
        r1.setSide(Room.Direction.East, d);
    }





    @Override
    public void buildMaze() {
        currentMaze = new Maze();
    }

    @Override
    public Maze getMaze() {
        return currentMaze;
    }

    public static void main(String[] args) {
        MazeBuilder builder = new StandardMazeBuilder();
        builder.buildMaze();
        Maze maze = builder.getMaze();
        System.out.println(maze.getRoomNr(0));
    }
}
