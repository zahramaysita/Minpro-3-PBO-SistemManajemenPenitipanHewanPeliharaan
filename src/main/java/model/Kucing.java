package model;

public class Kucing extends Hewan {

    private String ras;
    
    public Kucing(int idHewan, String namaHewan, String ras) {
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
        return "Kucing - " + getNamaHewan();
    }
}
    
  