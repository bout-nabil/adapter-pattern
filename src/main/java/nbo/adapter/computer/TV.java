package nbo.adapter.computer;

public class TV implements IHdmi {

    @Override
    public void view(byte[] data) {
        System.out.println("TV - HDMI implementation --------------------------");
        String message = new String(data);
        System.out.println(message);
        System.out.println("TV - HDMI implementation -------------------------");
    }
}
