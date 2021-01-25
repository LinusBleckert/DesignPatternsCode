package creational.maze;

import java.util.HashMap;

public class Maze{

    HashMap<Integer, Room> rooms;
    public Maze(){
        rooms = new HashMap<>();
    }

    public void addRoom(Room room){
        rooms.put(room.getRoomNr(), room);
    }

    public Room getRoomNr(int roomNr){
        return rooms.get(roomNr);
    }



}
