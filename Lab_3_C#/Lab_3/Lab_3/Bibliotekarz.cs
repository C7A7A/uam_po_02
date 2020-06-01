using System;
using System.Collections.Generic;
using System.Text;

namespace Lab_3
{
    class Bibliotekarz : Osoba
    {
        private string dataZatrudnienia;
        private double wynagrodzenie;

        public Bibliotekarz()
        {

        }

        public Bibliotekarz(string imie, string nazwisko, string dataZatrudnienia, double wynagrodzenie) :
               base(imie, nazwisko)
        {
            this.dataZatrudnienia = dataZatrudnienia;
            this.wynagrodzenie = wynagrodzenie;
        }

        public string DataZatrudnienia
        {
            get { return dataZatrudnienia; }
            set { dataZatrudnienia = value; }
        }

        public double Wynagrodzenie
        {
            get { return wynagrodzenie; }
            set { wynagrodzenie = value; }
        }
    }
}
