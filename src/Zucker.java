public class Zucker extends ZutatDecorator {
    public Zucker(Getraenk g) {
        super(g);
    }



    @Override
    public String getBeschreibung() {
        return getraenk.getBeschreibung()+", Zucker";
    }

    @Override
    public double kostet() {
        return 0.1+ getraenk.kostet();
    }

}
