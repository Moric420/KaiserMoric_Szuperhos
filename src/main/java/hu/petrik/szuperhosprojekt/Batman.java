package hu.petrik.szuperhosprojekt;

import java.text.MessageFormat;

public class Batman implements Szuperhos, Milliardos {
    private double lelemenyesseg;

    public Batman() {
        this.lelemenyesseg = 100; // Alapértelmezett érték
    }

    @Override
    public boolean legyoziE(Szuperhos szuperhos) {
        return szuperhos.mekkoraAzEreje() < this.lelemenyesseg; // Legyőzi, ha az ereje kisebb mint Batman leleményessége
    }

    @Override
    public double mekkoraAzEreje() {
        return this.lelemenyesseg * 2; // Batman ereje a leleményesség kétszerese
    }

    @Override
    public void kutyutKeszit() {
        this.lelemenyesseg += 50; // Leleményességét növeli 50-el
    }

    @Override
    public String toString() {
        return MessageFormat.format("Batman: leleményesség: {0, number, #.##}", lelemenyesseg);
    }

    public double getLelemenyesseg() {
        return lelemenyesseg;
    }

    public void setLelemenyesseg(double lelemenyesseg) {
        this.lelemenyesseg = lelemenyesseg;
    }
}

