package design_pattern.creational.builder.concrete;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Locale;

public class MotherBoard implements design_pattern.creational.builder.MotherBoard {
    @Override
    public void buildPanel() {

    }

    @Override
    public void addDisk(double size) {
       System.out.println("Compute get disk of size "+size);

    }


    @Override
    public void addRam() {
     System.out.println("Ram added "+ System.getProperty("os.name").toLowerCase(Locale.ROOT)+ " have ram size memory "+Runtime.getRuntime().maxMemory());
    }
}
