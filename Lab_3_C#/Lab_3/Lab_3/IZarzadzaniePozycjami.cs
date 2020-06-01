using System;
using System.Collections.Generic;
using System.Text;

namespace Lab_3
{
    interface IZarzadzaniePozycjami
    {
        public Pozycja ZnajdzPozycjePoTytule(string tytul);
        public Pozycja ZnajdzPozycjePoId(int id);
        public void WypiszWszystkiePozycje();
    }
}
