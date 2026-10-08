package model;

import interfaces.InfoHewan;

public abstract class Hewan implements InfoHewan {

    private int idHewan;
    private String namaHewan;

    public Hewan(int idHewan, String namaHewan) {
        this.idHewan = idHewan;
        this.namaHewan = namaHewan;
    }

    // Abstract method
    public abstract String getInfo();

    // Overloading 1
    public void infoPenitipan() {
        System.out.println("Nama Hewan: " + namaHewan);
    }

    // Overloading 2
    public void infoPenitipan(int lamaHari) {
        System.out.println("Lama Penitipan: " + lamaHari + " hari");
    }

    public int getIdHewan() {
        return idHewan;
    }

    public void setIdHewan(int idHewan) {
        this.idHewan = idHewan;
    }

    public String getNamaHewan() {
        return namaHewan;
    }

    public void setNamaHewan(String namaHewan) {
        this.namaHewan = namaHewan;
    }
}