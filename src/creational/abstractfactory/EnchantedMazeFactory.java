package creational.abstractfactory;

import creational.maze.Door;
import creational.maze.DoorNeedingSpell;
import creational.maze.EnchantedRoom;
import creational.maze.Room;

public class EnchantedMazeFactory extends MazeFactory{

    public EnchantedMazeFactory(){

    }

    public Room makeRoom(int roomNr){
        return new EnchantedRoom(roomNr, CastSpell());
    }

    public Door makeDoor(Room r1, Room r2){
        return new DoorNeedingSpell(r1, r2);
    }

    protected Spell CastSpell(){
        return new Spell();
    }

    public class Spell{
        public Spell(){

        }
    }
}
