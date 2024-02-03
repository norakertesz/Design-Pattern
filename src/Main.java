public class Main {
    public static void main(String[] args) {
        System.out.println("Zam Kaffehaus startet!");

        Getraenk g = new Espresso();
        g = new Milch(g);

        g = new Sirup(g);
        g = new Zucker(g);
        g = new Milchschaum(g);
        g = new Schlag(g);

        //Milch +g = 3.3€
        System.out.println("Der " + g.getBeschreibung() + " kostet: €" + g.kostet());

        Getraenk c = new CafeLatte();
        c = new Milchschaum(c);
        c = new Sirup(c);
        c = new Zucker(c);
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
        System.out.println("Der " + c.getBeschreibung() + " kostet: €" + c.kostet());

        System.out.println("Zam Kaffehaus schließt!");
    }
}