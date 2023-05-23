import java.util.Date;
/**
 informacja o ksiazce
 tytul: String, tytul ksiazki
 autor: Osoba, autor ksiazki
 data_wydania: String, data wydania ksiazki
 @author : Pawel Kikh
 */
public class Ksiazka extends Osoba{
    private String tytul;
    private Osoba autor;
    private String data_wydania;

    public Ksiazka(String tytul, Osoba author, String data_wydania) {
        super();
        this.tytul = tytul;
        this.autor = author;
        this.data_wydania = data_wydania;
    }

    public String getTytul() {
        return tytul;
    }

    public void setTytul(String tytul) {
        this.tytul = tytul;
    }

    public Osoba getAutor() {
        return autor;
    }

    public void setAutor(Osoba autor) {
        this.autor = autor;
    }

    public String getData_wydania() {
        return data_wydania;
    }

    public void setData_wydania(String data_wydania) {
        this.data_wydania = data_wydania;
    }

    @Override
    public String toString() {
        return "Ksiazka{" +
                "tytul='" + tytul + '\'' +
                ", autor=" + autor +
                ", data_wydania=" + data_wydania +
                '}';
    }
}
