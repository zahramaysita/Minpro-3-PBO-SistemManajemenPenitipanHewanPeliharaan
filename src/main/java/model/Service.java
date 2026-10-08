package model;

import java.util.ArrayList;

public class Service {

    private ArrayList<Hewan> daftarHewan = new ArrayList<>();
    private ArrayList<Penitipan> daftarPenitipan = new ArrayList<>();

    public Service() {

        // Dummy data awal
        daftarHewan.add(new Kucing(1, "Milo", "Persia"));
    }

    public ArrayList<Hewan> getDaftarHewan() {
        return daftarHewan;
    }

    public ArrayList<Penitipan> getDaftarPenitipan() {
        return daftarPenitipan;
    }
}