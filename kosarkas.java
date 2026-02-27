package domaci;

public class kosarkas extends sportista {

    private double poeni;

    public kosarkas(String ime, int godine, double poeni) {
        super(ime, godine);
        this.poeni = poeni;
    }


    public double getPoeni() {
        return poeni;
    }

    public void setPoeni(double poeni) {
        this.poeni = poeni;
    }

    public void info() {
        super.info();
        System.out.println("Prosečni poeni: " + poeni);
    }
}
