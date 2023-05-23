import java.util.List;
import java.util.Random;
/**
 przechowuje ksiazki przeczytane przez recenzenta i ocene
 ocena: int, przechowuje opinie przeczytanej ksiazki
 @author : Pawel Kikh
 */
public class Recenzent extends Czytelnik {
    private int ocena;

    public Recenzent(String imie, String nazwisko, int wiek, List<Ksiazka> lista_ksiazek, int ocena) {
        super(imie, nazwisko, wiek, lista_ksiazek);
        this.ocena = ocena;
    }

    public int getOcena() {
        return ocena;
    }

    public void setOcena(int ocena) {
        this.ocena = ocena;
    }

    @Override
    public void wypiszKsiazki() {
        super.wypiszKsiazki();
    }
}
