package domaci;


public class sportista {

    private String ime;
    private int godine;

    public sportista(String ime, int godine) {
        this.ime = ime;
        this.godine = godine;
    }


    public String getIme() {
        return ime;
    }


    public void setIme(String ime) {
        this.ime = ime;
    }


    public int getGodine() {
        return godine;
    }


    public void setGodine(int godine) {
        this.godine = godine;
    }


    public void info() {
        System.out.println("Ime: " + ime);
        System.out.println("Godine: " + godine);
    }
}
