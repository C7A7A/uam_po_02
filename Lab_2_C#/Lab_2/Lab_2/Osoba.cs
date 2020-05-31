using System;
using System.Collections.Generic;
using System.Globalization;
using System.Text;

namespace Lab_2
{
    class Osoba
    {
        protected string imie;
        protected string nazwisko;
        protected string data_urodzenia;

        public Osoba()
        {
            imie = "nieznane";
            nazwisko = "nieznane";
            data_urodzenia = "nieznana";
        }

        public Osoba(string imie, string nazwisko, string data_urodzenia)
        {
            this.imie = imie;
            this.nazwisko = nazwisko;
            this.data_urodzenia = data_urodzenia;
        }

        public string Imie
        {
            get { return imie; }
            set { imie = value; }
        }

        public string Nazwisko
        {
            get { return nazwisko; }
            set { nazwisko = value; }
        }

        public string Data_urodzenia
        {
            get { return data_urodzenia; }
            set { data_urodzenia = value; }
        }

        public virtual void wypisz_info()
        {
            Console.WriteLine(imie + " " + nazwisko + " " + data_urodzenia);
        }
    }
}
