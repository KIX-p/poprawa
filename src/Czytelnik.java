import java.util.ArrayList;
import java.util.List;

/**
 przechowanie przeczytanych ksiazek przez czytelnikow
 lista_ksiazek: <List>  przechowuje ksiazki
 @author : Pawel Kikh
 */
public class Czytelnik extends Osoba{
    private List<Ksiazka> lista_ksiazek = new ArrayList<>();

    public Czytelnik(String imie, String nazwisko, int wiek, List<Ksiazka> lista_ksiazek) {
        super();
        this.lista_ksiazek = lista_ksiazek;
    }

    public List<Ksiazka> getLista_ksiazek() {
        return lista_ksiazek;
    }

    public void setLista_ksiazek(List<Ksiazka> lista_ksiazek) {
        this.lista_ksiazek = lista_ksiazek;
    }

    public void wypiszKsiazki(){
        for (Ksiazka ksiazka : lista_ksiazek) {
            System.out.println(lista_ksiazek);
        }
    }


    @Override
    public String toString() {
        return "Czytelnik{" +
                "lista_ksiazek przeczytanych=" + lista_ksiazek +
                "} " + super.toString();
    }
}
