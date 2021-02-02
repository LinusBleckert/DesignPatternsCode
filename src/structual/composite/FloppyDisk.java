package structual.composite;

public class FloppyDisk extends Equipment{


    private int power;
    private int price;

    public FloppyDisk(int power, int price){
        super("Floppy disk");
        this.power = power;
        this.price = price;
    }

    @Override
    public int getPower() {
        return power;
    }

    @Override
    public int getPrice() {
        return price;
    }


}
