public class Schlag extends ZutatDecorator {
    @Override
    public String getBeschreibung() {
        return "Schlag, "+getraenk.getBeschreibung();
    }

    public Schlag(Getraenk g) {
        super(g);
    }
    @Override
    public double kostet() {
        return 0.6+ getraenk.kostet();
    }


}
