package nbo.adapter.computer;

public class VideoProjecteur implements IVga {
    @Override
    public void print(String message) {
        System.out.println("=========== Video Projecteur ============");
        System.out.println(message);
        System.out.println("=========================================");
    }
}
