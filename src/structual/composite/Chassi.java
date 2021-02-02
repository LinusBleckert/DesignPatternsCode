package structual.composite;

import java.util.ArrayList;

public class Chassi extends CompositeEquipment{

    protected Chassi(String name) {
        super(name);
        equipmentList = new ArrayList<>();
    }

    @Override
    public int getPower() {
        return super.getPower();
    }

    @Override
    public int getPrice() {
        return super.getPrice();
    }
}
