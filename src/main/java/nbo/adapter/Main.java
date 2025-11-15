package nbo.adapter;

import nbo.adapter.computer.*;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        UniteCentral uniteCentral = new UniteCentral();
        uniteCentral.setIvga(new Ecran());
        uniteCentral.print("Hello World");
        uniteCentral.setIvga(new VideoProjecteur());
        uniteCentral.print("Hello World");

        AdapterVgaHdmi adapterVgaHdmi = new AdapterVgaHdmi();
        adapterVgaHdmi.setHdmi(new TV());
        uniteCentral.setIvga(adapterVgaHdmi);
        adapterVgaHdmi.print("Hello it's adapter");

        uniteCentral.setIvga(new SuperVP());
        uniteCentral.print("Hello SuperVP via VGA");

        AdapterVgaHdmi adapterVgaHdmi2 = new AdapterVgaHdmi();
        adapterVgaHdmi2.setHdmi(new SuperVP());
        uniteCentral.setIvga(adapterVgaHdmi2);
        uniteCentral.print("Hello SuperVP via HDMI");

    }
}