package structual.composite;

public class Main {
    public static void main(String[] args) {
        Chassi chassi = new Chassi("chassi");

        FloppyDisk floppy1 = new FloppyDisk(20,100);
        FloppyDisk floppy2 = new FloppyDisk(10,150);

        chassi.addChild(floppy1);
        chassi.addChild(floppy2);

        System.out.println(chassi.getPrice());
        System.out.println(chassi.getPower());

    }
}
