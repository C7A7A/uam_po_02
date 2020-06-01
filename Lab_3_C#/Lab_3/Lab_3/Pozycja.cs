using System;
using System.Collections.Generic;
using System.Runtime.InteropServices;
using System.Text;

namespace Lab_3
{
    abstract class Pozycja
    {
        protected string tytul;
        protected int id;
        protected string wydawnictwo;
        protected int rokWydania;

        public Pozycja()
        {

        }

        public Pozycja(string tytul, int id, string wydawnictwo, int rokWydania)
        {
            this.tytul = tytul;
            this.id = id;
            this.wydawnictwo = wydawnictwo;
            this.rokWydania = rokWydania;
        }

        public string Tytul
        {
            get { return tytul; }
            set { tytul = value; }
        }

        public int Id
        {
            get { return id; }
            set { id = value; }
        }

        public string Wydawnictwo
        {
            get { return wydawnictwo; }
            set { wydawnictwo = value; }
        }

        public int RokWydania
        {
            get { return rokWydania; }
            set { rokWydania = value; }
        }

        public abstract void WypiszInfo();
    }
}
