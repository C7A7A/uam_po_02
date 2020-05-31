using System;
using System.Collections.Generic;
using System.Text;

namespace Lab1
{
	class Garage
	{
		private string address;
		private int capacity;
		private int cars_amount = 0;
		List<Car> cars = new List<Car>();

		public string Address
		{
			get { return address; }
			set { address = value; }
		}

		public int Capacity
		{
			get { return capacity; }
			set 
			{ 
				capacity = value;
				cars.Capacity = value;
			}
		}

		public int Cars_amount
		{
			get { return cars_amount; }
			set { cars_amount = value; }
		}

		public Garage()
		{
			this.address = "nieznany";
			this.capacity = 0;
			this.cars_amount = 0;
		}

		public Garage(string address, int capacity)
		{
			this.address = address;
			this.capacity = capacity;
			this.cars.Capacity = capacity;
		}

		public void Insert_car(Car car)
		{
			//Console.WriteLine("capacity: " + cars.Capacity + "  count: " + cars.Count);
			if (cars.Capacity > cars.Count)
			{
				cars_amount++;
				cars.Add(car);
			}	
			else
			{
				Console.WriteLine("Garaż jest zapełniony");
			}
		}

		public void Delete_car()
		{
			if (cars.Count > 0)
			{
				cars_amount--;
				cars.RemoveAt(cars.Count - 1);
			}
			else
			{
				Console.WriteLine("Garaż jest pusty");
			}
		}

		public void Print_info()
		{
			Console.WriteLine("Informacje o garażu:");
			Console.WriteLine("Adres: " + Address + "\n" +
							   "Pojemność: " + Capacity + "\n" +
							   "Ilość samochodów: " + Cars_amount);
			foreach (Car car in cars)
			{
				Console.WriteLine(car);
			}
		}

	}
}
