package creational.maze;

import creational.abstractfactory.EnchantedMazeFactory;

public class EnchantedRoom extends Room{

    private EnchantedMazeFactory.Spell spell;
    public EnchantedRoom(int roomNr, EnchantedMazeFactory.Spell spell) {
        super(roomNr);
        this.spell = spell;
    }
}
