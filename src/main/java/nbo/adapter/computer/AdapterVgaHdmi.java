package nbo.adapter.computer;

public class AdapterVgaHdmi implements IVga{
    private IHdmi iHdmi;
    @Override
    public void print(String message) {
        System.out.println("================== AdapterVgaHdmi print ===================");
        byte[] data = message.getBytes();
        iHdmi.view(data);
        System.out.println("================== / AdapterVgaHdmi print ===================");
    }

    public void setHdmi(IHdmi hdmi) {
        this.iHdmi = hdmi;
    }
}
