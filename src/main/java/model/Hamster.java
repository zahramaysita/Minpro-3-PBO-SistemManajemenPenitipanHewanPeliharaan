package model;

public class Hamster extends Hewan {

    private String rasHamster;

    public Hamster(int idHewan, String namaHewan, String rasHamster) {
        super(idHewan, namaHewan);
        this.rasHamster = rasHamster;
    }

    public String getRasHamster() {
        return rasHamster;
    }

    public void setRasHamster(String rasHamster) {
        this.rasHamster = rasHamster;
    }

    @Override
    public String getInfo() {
        return "Hamster - " + getNamaHewan();
    }
}
