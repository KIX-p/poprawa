import java.util.Objects;
/**
 klasa przechowuje informacje o osobie
 imie: String, przechowuje imier
 nazwisko: String, przechowuje nazwisko
 wiek: int, przechowuje wiek
 @author : Pawel Kikh
 */
public class Osoba {
    private String imie, nazwisko;
    private int wiek;

    public Osoba() {
        this.imie = imie;
        this.nazwisko = nazwisko;
        this.wiek = wiek;
    }

    public String getImie() {
        return imie;
    }

    public void setImie(String imie) {
        this.imie = imie;
    }

    public String getNazwisko() {
        return nazwisko;
    }

    public void setNazwisko(String nazwisko) {
        this.nazwisko = nazwisko;
    }

    public int getWiek() {
        return wiek;
    }

    public void setWiek(int wiek) {
        this.wiek = wiek;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Osoba osoba)) return false;
        return getImie().equals(osoba.getImie()) && getNazwisko().equals(osoba.getNazwisko());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getImie(), getNazwisko(), getWiek());
    }

    @Override
    public String toString() {
        return "Osoba{" +
                "imie='" + imie + '\'' +
                ", nazwisko='" + nazwisko + '\'' +
                ", wiek=" + wiek +
                '}';
    }
}
