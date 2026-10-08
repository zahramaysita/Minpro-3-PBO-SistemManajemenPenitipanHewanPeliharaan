package model;

public class Anjing extends Hewan {

    private String ras;

    public Anjing(int idHewan, String namaHewan, String ras) {
        super(idHewan, namaHewan);
        this.ras = ras;
    }

    public String getRas() {
        return ras;
    }

    public void setRas(String ras) {
        this.ras = ras;
    }

    @Override
    public String getInfo() {
        return "Anjing - " + getNamaHewan();
    }
}