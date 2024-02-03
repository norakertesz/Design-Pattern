public abstract class Getraenk {
    protected String beschreibung="Unbekanntes Getraenk";
    //protected heisst dass nur abgeleitete Klassen darauf zugreifen koennen

    public String getBeschreibung(){
        return beschreibung;
    }
    public abstract double kostet();

}
