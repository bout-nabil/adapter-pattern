package nbo.adapter.computer;

public class SuperVP implements IVga, IHdmi{
    @Override
    public void view(byte[] data) {
        String message = new String(data);
        System.out.println("--------------- SuperVP - HDMI ---------------");
        System.out.println(message);
        System.out.println("--------------- SuperVP - HDMI ---------------");
    }

    @Override
    public void print(String message) {
        System.out.println("-------------- SuperVP - VGA ----------------");
        System.out.println(message);
        System.out.println("-------------/ SuperVP - VGA ----------------");
    }
}
