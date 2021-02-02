package structual.composite;

public abstract class Equipment {

    private String name;

    protected Equipment(String name){

        this.name = name;
    }

    public void addChild(Equipment c){
        return;
    }

    public void removeChild(Equipment c){
        return;
    }

    public abstract int getPower();
    public abstract int getPrice();


}
