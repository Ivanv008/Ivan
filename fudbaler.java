package domaci;

public class fudbaler extends sportista {

    private int golovi;

    public fudbaler(String ime, int godine, int golovi) {
        super(ime, godine);
        this.golovi = golovi;
    }

    // GETTER & SETTER
    public int getGolovi() {
        return golovi;
    }

    public void setGolovi(int golovi) {
        this.golovi = golovi;
    }

    public void info() {
        super.info();
        System.out.println("Golovi: " + golovi);
    }
}

