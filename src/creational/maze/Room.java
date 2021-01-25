package creational.maze;

import jdk.jshell.spi.ExecutionControl;

import java.util.Map;

public class Room extends MapSite{

    enum Direction {
        North,
        South,
        East,
        West
    }

    private MapSite[] sides = new MapSite[4];
    private int roomNr;


    public Room(int roomNr){
        this.roomNr = roomNr;
    }

    public int getRoomNr(){
        return this.roomNr;
    }

    public MapSite getSide(Direction direction){
        return this.getIndexFromDirection(direction);
    }

    private MapSite getIndexFromDirection(Direction direction){
        switch (direction){
            case North:
                return sides[0];
            case South:
                return sides[1];
            case East:
                return sides[2];
            case West:
                return sides[3];
            default:
                return null;
        }
    }
    public void setSide(Direction direction, MapSite mapSite){
        switch (direction){
            case North:
                sides[0] = mapSite;
            case South:
                sides[1] = mapSite;
            case East:
                sides[2] = mapSite;
            case West:
                sides[3] = mapSite;
        }
    }

    @Override
    public void Enter(){

    }


    @Override
    public String toString() {
        return super.toString() + " and has roomnr: " + this.getRoomNr();
    }
}
