public class Milch extends ZutatDecorator {

    public Milch(Getraenk getraenk) {
        super(getraenk);
    }

    @Override
    public String getBeschreibung() {
        return getraenk.getBeschreibung()+", Milch";
    }

    @Override
    public double kostet() {
        return 0.8+ getraenk.kostet();
    }
}
