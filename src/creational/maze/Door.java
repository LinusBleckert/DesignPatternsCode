package creational.maze;

public class Door extends MapSite{

    private Room room1;
    private Room room2;
    private boolean isOpen;

    public Door(Room room1, Room room2){
        this.room1 = room1;
        this.room2 = room2;
    }

    @Override
    public void Enter() {

    }

    public Room otherSideFrom(Room room){
        throw new UnsupportedOperationException("Not implemented");
    }
}
