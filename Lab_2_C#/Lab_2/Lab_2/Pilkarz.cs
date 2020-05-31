using System;
using System.Collections.Generic;
using System.Text;

namespace Lab_2
{
    class Pilkarz : Osoba
    {
        private string pozycja;
        private string klub;
        private int liczba_goli = 0;

        public Pilkarz():
               base()
        {
            pozycja = "nieznana";
            klub = "nieznany";
        }

        public Pilkarz(string imie, string nazwisko, string data_urodzenia, string pozycja, string klub):
               base(imie, nazwisko, data_urodzenia)
        {
            this.pozycja = pozycja;
            this.klub = klub;
        }

        public string Pozycja
        {
            get { return pozycja; }
            set { pozycja = value; }
        }

        public string Klub
        {
            get { return klub; }
            set { klub = value; }
        }

        public int Liczba_goli
        {
            get { return liczba_goli; }
            set { liczba_goli = value; }
        }

        public override void wypisz_info()
        {
            Console.WriteLine(imie + " " + nazwisko + " " + data_urodzenia + " " + pozycja + " " + klub + " " + liczba_goli);
        }

        public virtual void strzel_gola()
        {
            liczba_goli++;
        }
    }
}
