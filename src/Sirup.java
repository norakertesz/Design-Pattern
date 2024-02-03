public class Sirup extends ZutatDecorator {
    public Sirup(Getraenk g) {
        super(g);
    }


    @Override
    public String getBeschreibung() {
        return getraenk.getBeschreibung()+", Sirup";
    }

    @Override
    public double kostet() {
        return 0.4+ getraenk.kostet();
    }
}
