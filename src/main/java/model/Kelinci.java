package model;

public class Kelinci extends Hewan {

    private String rasKelinci;

    public Kelinci(int idHewan, String namaHewan, String rasKelinci) {
        super(idHewan, namaHewan);
        this.rasKelinci = rasKelinci;
    }

    public String getRasKelinci() {
        return rasKelinci;
    }

    public void setRasKelinci(String rasKelinci) {
        this.rasKelinci = rasKelinci;
    }

    @Override
    public String getInfo() {
        return "Kelinci - " + getNamaHewan();
    }
}