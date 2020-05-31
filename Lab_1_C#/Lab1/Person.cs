using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;

namespace Lab1
{
    public class Person
    {
        private string name;
        private string surname;
        private string address;
        private int cars_amount = 0;
        List<string> cars = new List<string>();

        public string Name
        {
            get { return name; }
            set { name = value; }
        }

        public string Surname
        {
            get { return surname; }
            set { surname = value; }
        }

        public string Address
        {
            get { return address; }
            set { address = value; }
        }

        public Person()
        {
            this.name = "nieznany";
            this.surname = "nieznany";
            this.address = "nieznany";
            this.cars_amount = 0;
        }

        public Person(string name, string surname, string address)
        {
            this.name = name;
            this.surname = surname;
            this.address = address;
            this.cars_amount = 0;
        }

        public void Add_car(string registration)
        {
           if (cars.Count < 3)
           {
                cars_amount++;
                cars.Add(registration);
           }
           else
           {
                Console.WriteLine("Maksymalna ilość samochodów dla jednej osoby: 3");
           }
        }
        public void Delete_car(string registration)
        {
            if (cars.Contains(registration))
            {
                cars_amount--;
                cars.Remove(registration);
            }
            else
            {
                Console.WriteLine("Nie ma samochodu o takim numerze rejestracyjnym");
            }
        }

        public void Print_info()
        {
            Console.WriteLine(
                "Imię i nazwisko: " + Name + " " + Surname + "\n" +
                "Adres: " + Address + "\n" +
                "Ilość samochodów: " + cars_amount
            );

            foreach(string registration in cars)
            {
                Console.WriteLine("Rejestracja samochodu: " + registration);
            }
        }

    }
}
