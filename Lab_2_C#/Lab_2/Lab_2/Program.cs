using System;

namespace Lab_2
{
    class Program
    {
        static void Main(string[] args)
        {
            Osoba o1 = new Osoba("Adam", "Miś", "20.03.1980");
            Osoba o2 = new Student("Michał", "Kot", "13.04.1990", 2, 1, 12345);
            Osoba o3 = new Pilkarz("Mateusz", "Żbik", "10.08.1986", "obrońca", "FC Czestochowa");

            o1.wypisz_info();
            o2.wypisz_info();
            o3.wypisz_info();

            Student s = new Student("Krzysztof", "Jeż", "22.11.1990", 2, 5, 54321);
            Pilkarz p = new Pilkarz("Piotr", "Kos", "14.09.1984", "napastnik", "FC Politechnika");

            s.wypisz_info();
            p.wypisz_info();

            ((Pilkarz)o3).strzel_gola();
            p.strzel_gola();
            p.strzel_gola();

            o3.wypisz_info();
            p.wypisz_info();

            ((Student)o2).dodaj_ocene("PO", "20.02.2011", 5.0);
            ((Student)o2).dodaj_ocene("Bazy danych", "13.02.2011", 4.0);

            o2.wypisz_info();

            s.dodaj_ocene("Bazy danych", "01.05.2011", 5.0);
            s.dodaj_ocene("AWWW", "11.05.2011", 5.0);
            s.dodaj_ocene("AWWW", "02.04.2011", 4.5);

            s.wypisz_info();

            s.usun_ocene("AWWW", "02.04.2011", 4.5);
           
            s.wypisz_info();

            s.dodaj_ocene("AWWW", "02.04.2011", 4.5);
            s.usun_oceny("AWWW");
           
            s.wypisz_info();

            s.dodaj_ocene("AWWW", "02.04.2011", 4.5);
            s.usun_oceny();

            s.wypisz_info();

            PilkarzNozny pn = new PilkarzNozny("Mateusz", "Czajka", "09.07.1999", "obrońca", "Kozacy FC");
            pn.strzel_gola();

            pn.wypisz_info();
        }
    }
}
