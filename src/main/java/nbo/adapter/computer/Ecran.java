package nbo.adapter.computer;

public class Ecran implements IVga {
//    private IVga ivga;

    @Override
    public void print(String message) {
        System.out.println("=========== Ecran ============");
        System.out.println(message);
        System.out.println("==============================");
    }
}
