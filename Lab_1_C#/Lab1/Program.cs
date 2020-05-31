using System;

namespace Lab1
{
	class Program
	{
		static void Main(string[] args)
		{
			/*
			Car c1 = new Car();
			Console.WriteLine(c1);

			c1.Mark = "Fiat";
			c1.Model = "126p";
			c1.Doors_amount = 2;
			c1.Capacity = 650;
			c1.Fuel_consumption = 6.0;

			Console.WriteLine(c1);

			Car c2 = new Car("Syrena", "105", 2, 800, 7.6);
			Console.WriteLine(c2);

			double price = c2.Fuel_price(30.5, 4.85);
			Console.WriteLine("Koszt przejazdu: " + price);
			Car.Print_amout_cars();

			Console.ReadKey();
			*/

			/*
			Car c1 = new Car("Fiat", "126p", 2, 650, 6.0);
			Car c2 = new Car("Syrena", "105", 2, 800, 7.6);

			Garage g1 = new Garage();
			g1.Address = "ul. Garażowa 1";
			g1.Capacity = 1;

			Garage g2 = new Garage("ul. Garażowa 2", 2);

			g1.Insert_car(c1);
			g1.Print_info();
			g1.Insert_car(c2);

			g2.Insert_car(c2);
			g2.Print_info();
			g2.Insert_car(c1);
			g2.Print_info();

			g2.Delete_car();
			g2.Print_info();
			g2.Delete_car();
			g2.Delete_car();

			Console.ReadKey();
			*/

			Person p1 = new Person("Mateusz", "Czajka", "Koksowo 18, Proste");
			Person p2 = new Person();
			p2.Name = "Jan Paweł";
			p2.Surname = "2";
			p2.Address = "Wadowice";

			p1.Add_car("XDD2323");
			p1.Add_car("XDDDDDDDDDDDDDDDDDDDDD");
			p1.Print_info();
			p1.Add_car(":PODPOADASPDSA");
			p1.Add_car("JDORKA");

			p2.Delete_car("FfF333");
			p2.Print_info();
			
		}
	}
}
