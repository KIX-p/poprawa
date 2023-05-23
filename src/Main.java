import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        Random rand = new Random(10);


        Osoba autor = new Osoba();
        Ksiazka ksiazka=new Ksiazka("adf", autor, "2015-03-05");

        Osoba autor2 = new Osoba();
        Ksiazka ksiazka2=new Ksiazka("adf2", autor, "2015-03-05");

        Osoba autor3 = new Osoba();
        Ksiazka ksiazka3=new Ksiazka("adf3", autor, "2015-03-05");

        List<Ksiazka> ksiazki = new ArrayList<>();
        ksiazki.add(ksiazka2);
        ksiazki.add(ksiazka);
        ksiazki.add(ksiazka3);
        List<Osoba> listaczytirece = new ArrayList<>();
        for (Osoba czytelnik : listaczytirece) {
            listaczytirece.add(czytelnik);
        }
        for (Osoba recenzent : listaczytirece) {
            listaczytirece.add(recenzent);
        }
        Recenzent recenzent = new Recenzent("ADF" ,"dsfsdf",15, ksiazki, rand.nextInt(1,10));
        Czytelnik czytelnik = new Czytelnik("ADFSGFDB","ADFSGDFHGDFH", 35, ksiazki);

        recenzent.wypiszKsiazki();
        czytelnik.wypiszKsiazki();







    }
}