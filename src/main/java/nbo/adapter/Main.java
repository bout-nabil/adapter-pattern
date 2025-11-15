package nbo.adapter;

import nbo.adapter.computer.Ecran;
import nbo.adapter.computer.UniteCentral;
import nbo.adapter.computer.VideoProjecteur;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        UniteCentral uniteCentral = new UniteCentral();
        uniteCentral.setIvga(new Ecran());
        uniteCentral.print("Hello World");
        uniteCentral.setIvga(new VideoProjecteur());
        uniteCentral.print("Hello World");
    }
}