package model;

public class Penitipan {

    private int idPenitipan;
    private int idHewan;
    private String tanggalMasuk;
    private int lamaPenitipan;

    public Penitipan(int idPenitipan, int idHewan, String tanggalMasuk, int lamaPenitipan) {
        this.idPenitipan = idPenitipan;
        this.idHewan = idHewan;
        this.tanggalMasuk = tanggalMasuk;
        this.lamaPenitipan = lamaPenitipan;
    }

    public int getIdPenitipan() {
        return idPenitipan;
    }

    public void setIdPenitipan(int idPenitipan) {
        this.idPenitipan = idPenitipan;
    }

    public int getIdHewan() {
        return idHewan;
    }

    public void setIdHewan(int idHewan) {
        this.idHewan = idHewan;
    }

    public String getTanggalMasuk() {
        return tanggalMasuk;
    }

    public void setTanggalMasuk(String tanggalMasuk) {
        this.tanggalMasuk = tanggalMasuk;
    }

    public int getLamaPenitipan() {
        return lamaPenitipan;
    }

    public void setLamaPenitipan(int lamaPenitipan) {
        this.lamaPenitipan = lamaPenitipan;
    }
}
