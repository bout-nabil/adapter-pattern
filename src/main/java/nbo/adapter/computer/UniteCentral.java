package nbo.adapter.computer;

public class UniteCentral {
    private IVga ivga;

    public void print(String message) {
        System.out.println("*********** unite Central ************");
        ivga.print(message);
        System.out.println("**************************************");
    }

    public void setIvga(IVga ivga) {
        this.ivga = ivga;
    }
}
