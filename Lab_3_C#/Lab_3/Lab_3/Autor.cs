using System;
using System.Collections.Generic;
using System.Text;

namespace Lab_3
{
    class Autor : Osoba
    {
        private string narodowosc;

        public Autor()
        {

        }

        public Autor(string imie, string nazwisko, string narodowosc) :
               base(imie, nazwisko)
        {
            this.narodowosc = narodowosc;
        }

        public string Narodowosc
        {
            get { return narodowosc; }
            set { narodowosc = value; }
        }
    }
}
