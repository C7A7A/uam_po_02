using System;
using System.Collections.Generic;
using System.Text;

namespace Lab_2
{
    class Ocena
    {
        private string nazwa_przedmiotu;
        private string data;
        private double wartosc;

        public Ocena()
        {
            nazwa_przedmiotu = "nieznana";
            data = "nieznana";
            wartosc = -1;
        }

        public Ocena(string nazwa_przedmiotu, string data, double wartosc)
        {
            this.nazwa_przedmiotu = nazwa_przedmiotu;
            this.data = data;
            this.wartosc = wartosc;
        }

        public string Nazwa_przedmiotu
        {
            get { return nazwa_przedmiotu; }
            set { nazwa_przedmiotu = value; }
        }

        public string Data
        {
            get { return data; }
            set { data = value; }
        }

        public double Wartosc
        {
            get { return wartosc; }
            set { wartosc = value; }
        }

        public void wypisz_info()
        {
            Console.WriteLine(nazwa_przedmiotu + " " + data + " " + wartosc);
        }

    }
}
