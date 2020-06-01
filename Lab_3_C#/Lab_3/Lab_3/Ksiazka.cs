using System;
using System.Collections.Generic;
using System.Text;
using System.Threading;

namespace Lab_3
{
    class Ksiazka : Pozycja
    {
        private int liczbaStron;
        private readonly List<Autor> listaAutorów = new List<Autor>();

        public Ksiazka()
        {

        }

        public Ksiazka(string tytul, int id, string wydawnictwo, int rokWydania, int liczbaStron) :
               base(tytul, id, wydawnictwo, rokWydania)
        {
            this.liczbaStron = liczbaStron;
        }

        public int LiczbaStron
        {
            get { return liczbaStron; }
            set { liczbaStron = value; }
        }

        public void DodajAutora(Autor autor)
        {
            listaAutorów.Add(autor);
        }

        public override void WypiszInfo()
        {
            Console.Write(tytul + " " + id + " " + wydawnictwo + " " + rokWydania + " " + liczbaStron + " ");
            foreach(Autor autor in listaAutorów)
            {
                Console.WriteLine(autor.Imie + " " + autor.Nazwisko + " " + autor.Narodowosc);
            }
        }
    }
}
