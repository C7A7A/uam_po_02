using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;

namespace Lab_2
{
    class Student : Osoba
    {
        private int rok;
        private int grupa;
        private int nr_indeksu;
        private List<Ocena> oceny = new List<Ocena>();

        public Student():
               base()
        {
            rok = -1;
            grupa = -1;
            nr_indeksu = -1;
        }

        public Student(string imie, string nazwisko, string data_urodzenia, int rok, int grupa, int nr_indeksu):
               base(imie, nazwisko, data_urodzenia)
        {
            this.rok = rok;
            this.grupa = grupa;
            this.nr_indeksu = nr_indeksu;
        }

        public int Rok
        {
            get { return rok; }
            set { rok = value; }
        }
        
        public int Grupa
        {
            get { return grupa; }
            set { grupa = value; }
        }

        public int Nr_indeksu
        {
            get { return nr_indeksu; }
            set { nr_indeksu = value; }
        }

        public void dodaj_ocene(string przedmiot, string data, double wartosc)
        {
            Ocena ocena = new Ocena(przedmiot, data, wartosc);
            oceny.Add(ocena);
        }

        public void wypisz_oceny()
        {
            Console.WriteLine("Oceny studenta:");

            foreach(Ocena ocena in oceny)
            {
                Console.WriteLine(ocena.Nazwa_przedmiotu + " " + ocena.Data + " " + ocena.Wartosc);
            }
        }

        public void wypisz_oceny(string przedmiot)
        {
            foreach(Ocena ocena in oceny.Where(n => n.Nazwa_przedmiotu == przedmiot))
            {
                Console.WriteLine(ocena.Nazwa_przedmiotu + " " + ocena.Data + " " + ocena.Wartosc);
            }
        }

        public void usun_oceny()
        {
            oceny.Clear();
        }

        public void usun_ocene(string przedmiot, string data, double wartosc)
        {
            oceny.RemoveAll(n => n.Nazwa_przedmiotu == przedmiot && n.Data == data && n.Wartosc == wartosc);
        }

        public void usun_oceny(string przedmiot)
        {
            oceny.RemoveAll(n => n.Nazwa_przedmiotu == przedmiot);
        }

        public override void wypisz_info()
        {
            Console.WriteLine(imie + " " + nazwisko + " " + data_urodzenia + " " + rok + " " + grupa + " " + nr_indeksu);
            foreach(Ocena ocena in oceny)
            {
                Console.WriteLine(ocena.Nazwa_przedmiotu + " " + ocena.Data + " " + ocena.Wartosc);
            }
        }
    }
}
