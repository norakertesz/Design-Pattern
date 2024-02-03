public class Milchschaum extends ZutatDecorator {
    @Override
    public String getBeschreibung() {
        return getraenk.getBeschreibung()+", Milchschaum ";
    }

    public Milchschaum(Getraenk g) {
        super(g);
    }
    @Override
    public double kostet() {
        return 0.8+ getraenk.kostet();
    }

}
