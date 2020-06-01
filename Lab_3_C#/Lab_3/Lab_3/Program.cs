using System;

namespace Lab_3
{
    class Program
    {
        static void Main(string[] args)
        {
            Katalog katalog1 = new Katalog("bekowe");
            katalog1.DodajPozycje(new Ksiazka("XD1", 1, "haha1", 2137, 69));
            katalog1.DodajPozycje(new Czasopismo("JP2GMD", 2, "Kościół katolicki Z.O.O", 2020, 1));

            katalog1.WypiszWszystkiePozycje();
            Console.WriteLine(katalog1.ZnajdzPozycjePoId(1).Tytul);
            Console.WriteLine(katalog1.ZnajdzPozycjePoTytule("JP2GMD").Tytul);

            Ksiazka ksiazka1 = new Ksiazka("1984", 3, "Kozaki", 1948, 200);
            ksiazka1.DodajAutora(new Autor("George", "Orwell", "angielska"));
            ksiazka1.WypiszInfo();

            Bibliotekarz bibliotekarz = new Bibliotekarz("Mateusz", "Mati", "20.12.2011", 10);
            Biblioteka biblioteka = new Biblioteka("ul. Wrocławska 12/4");
            biblioteka.DodajBibliotekarza(bibliotekarz);
            biblioteka.DodajKatalog(katalog1);
            biblioteka.DodajPozycje(ksiazka1, "bekowe");
            biblioteka.WypiszBibliotekarzy();
            biblioteka.WypiszWszystkiePozycje();
            Console.WriteLine(biblioteka.ZnajdzPozycjePoId(3).Tytul);
            Console.WriteLine(biblioteka.ZnajdzPozycjePoTytule("XD1").Tytul);


            Katalog katalog2 = new Katalog("pusty");
            katalog2.WypiszWszystkiePozycje();
            katalog2.ZnajdzPozycjePoId(1);
            katalog2.ZnajdzPozycjePoTytule("XDDD");
            

        }
    }
}
