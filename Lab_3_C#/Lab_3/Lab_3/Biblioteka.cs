using System;
using System.Collections.Generic;
using System.Text;

namespace Lab_3
{
    class Biblioteka : IZarzadzaniePozycjami
    {
        private string adres;
        private List<Katalog> listaKatalogow = new List<Katalog>();
        private List<Bibliotekarz> listaBibliotekarzy = new List<Bibliotekarz>();
        
        public Biblioteka()
        {

        }

        public Biblioteka(string adres)
        {
            this.adres = adres;
        }

        public string Adres
        {
            get { return adres; }
            set { adres = value; }
        }

        public void DodajBibliotekarza(Bibliotekarz bibliotekarz)
        {
            listaBibliotekarzy.Add(bibliotekarz);
        }

        public void WypiszBibliotekarzy()
        {
            foreach(Bibliotekarz bibliotekarz in listaBibliotekarzy)
            {
                Console.WriteLine(bibliotekarz.Imie + " " + bibliotekarz.Nazwisko + " " + bibliotekarz.DataZatrudnienia + " " + bibliotekarz.Wynagrodzenie);
            }
        }

        public void DodajKatalog(Katalog katalog)
        {
            listaKatalogow.Add(katalog);
        }

        public void DodajPozycje(Pozycja pozycja, string dzialTematyczny)
        {
            Katalog katalog = listaKatalogow.Find(n => n.DzialTematyczny == dzialTematyczny);
            katalog.DodajPozycje(pozycja);
        }

        public Pozycja ZnajdzPozycjePoTytule(string tytul)
        {
            foreach (Katalog katalog in listaKatalogow)
            {
               Pozycja pozycja = katalog.ZnajdzPozycjePoTytule(tytul);
               if (pozycja.Tytul == tytul)
               {
                    return pozycja;
               }
            }
            return null;
        }

        public Pozycja ZnajdzPozycjePoId(int id)
        {
            foreach (Katalog katalog in listaKatalogow)
            {
                Pozycja pozycja = katalog.ZnajdzPozycjePoId(id);
                if (pozycja.Id == id)
                {
                    return pozycja;
                }
            }
            return null;
        }

        public void WypiszWszystkiePozycje()
        {
            foreach (Katalog katalog in listaKatalogow)
            {
                katalog.WypiszWszystkiePozycje();
            }
        }
    }
}
