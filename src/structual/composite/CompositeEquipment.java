package structual.composite;

import java.util.List;

public abstract class CompositeEquipment extends Equipment{

    protected List<Equipment> equipmentList;

    protected CompositeEquipment(String name) {
        super(name);
    }

    @Override
    public int getPower() {
        int sum = equipmentList.stream().mapToInt(Equipment::getPower).sum();
        return sum;
    }

    @Override
    public int getPrice() {
        int sum = equipmentList.stream().mapToInt(Equipment::getPrice).sum();
        return sum;
    }

    @Override
    public void addChild(Equipment c) {
        this.equipmentList.add(c);
    }

    @Override
    public void removeChild(Equipment c) {
        this.equipmentList.remove(c);
    }
}
