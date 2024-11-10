package hu.petrik.szuperhosprojekt;

import java.text.MessageFormat;
import java.util.Random;

public class Vasember extends Bosszuallo implements Milliardos {
    public Vasember() {
        super(150, true); // Vasember szuperereje 150 és van gyengesége
    }

    @Override
    public void kutyutKeszit() {
        Random random = new Random();
        double randomEro = random.nextDouble() * 10; // 0-10 közötti random érték
        setSzuperero(getSzuperero() + randomEro); // Növeli a szupererejét
    }

    @Override
    public boolean megmentiAVilagot() {
        return getSzuperero() > 1000; // Megmenti a világot, ha ereje nagyobb mint 1000
    }

    @Override
    public String toString() {
        String gyengeseg = isVanEGyengesege() ? "van gyengesége" : "nincs gyengesége";
        return MessageFormat.format("Vasember: Szupererő: {0, number, #.##}; {1}", getSzuperero(), gyengeseg);
    }
}

