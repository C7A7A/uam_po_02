using System;
using System.Collections.Generic;
using System.Text;

namespace Lab_3
{
    class Czasopismo : Pozycja
    {
        private int numer;

        public Czasopismo()
        {

        }

        public Czasopismo(string tytul, int id, string wydawnictwo, int rokWydania, int numer) :
               base(tytul, id, wydawnictwo, rokWydania)
        {
            this.numer = numer;
        }

        public int Numer
        {
            get { return numer; }
            set { numer = value; }
        }

        public override void WypiszInfo()
        {
            Console.WriteLine(tytul + " " + id + " " + wydawnictwo + " " + rokWydania + " " + numer);
        }
    }
}
