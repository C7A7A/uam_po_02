using System;
using System.Collections.Generic;
using System.Text;

namespace Lab_3
{
    class Katalog: IZarzadzaniePozycjami
    {
        private string dzialTematyczny;
        private readonly List<Pozycja> listaPozycji = new List<Pozycja>();

        public Katalog()
        {

        }

        public Katalog(string dzialTematyczny)
        {
            this.dzialTematyczny = dzialTematyczny;
        }

        public string DzialTematyczny
        {
            get { return dzialTematyczny; }
            set { dzialTematyczny = value; }
        }
        
        public void DodajPozycje(Pozycja pozycja)
        {
            listaPozycji.Add(pozycja);
        }

        public Pozycja ZnajdzPozycjePoTytule(string tytul)
        {
            return listaPozycji.Find(n => n.Tytul == tytul);
        }

        public Pozycja ZnajdzPozycjePoId(int id)
        {
            return listaPozycji.Find(n => n.Id == id);
        }

        public void WypiszWszystkiePozycje()
        {
            foreach(Pozycja pozycja in listaPozycji)
            {
                Console.WriteLine(pozycja.Id + " " + pozycja.RokWydania + " " + pozycja.Tytul + " " + pozycja.Wydawnictwo);

            }
        }
    }
}
