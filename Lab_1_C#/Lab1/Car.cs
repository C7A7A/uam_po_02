using System;
using System.Collections.Generic;
using System.Text;

namespace Lab1
{
	public class Car
	{
		private string mark;
		private string model;
		private int doors_amount;
		private double capacity;
		private double fuel_consumption;
		private string registration;
		public static int cars_amount = 0;

		public string Mark
		{
			get { return mark; }
			set { mark = value; }
		}

		public string Model
		{
			get { return model; }
			set { model = value; }
		}

		public int Doors_amount
		{
			get { return doors_amount; }
			set { doors_amount = value; }
		}

		public double Capacity
		{
			get { return capacity; }
			set { capacity = value; }
		}

		public double Fuel_consumption
		{
			get { return fuel_consumption; }
			set { fuel_consumption = value; }
		}

		private string Registration
		{
			get { return registration; }
			set { registration = value; }
		}

		public Car()
		{
			cars_amount++;
			this.mark = "nieznany";
			this.model = "nieznany";
			this.doors_amount = 0;
			this.capacity = 0.0;
			this.fuel_consumption = 0.0;
			this.registration = "nieznany";
		}


		public Car(string mark, string model, int doors_amount, double capacity, double fuel_consumption, string registration)
		{
			cars_amount++;
			this.mark = mark;
			this.model = model;
			this.doors_amount = doors_amount;
			this.capacity = capacity;
			this.fuel_consumption = fuel_consumption;
			this.registration = registration;
		}

		public double Avg_fuel_consumption(double distance)
		{
			if (this.fuel_consumption != 0 && distance != 0)
				return (this.fuel_consumption * distance) / 100.00;
			else
				return 0;
		}

		public double Fuel_price(double distance, double price)
		{
			double fuel = Avg_fuel_consumption(distance);
			return fuel * price;
		}

		public override string ToString()
		{
			return "Marka: " + Mark + "\n" +
				   "Model: " + Model + "\n" +
				   "Ilość drzwi: " + Doors_amount + "\n" +
				   "Pojemność silnika: " + Capacity + "\n" +
				   "Średnie spalanie: " + Fuel_consumption + "\n" +
				   "Numer rejestracyjny: " + Registration;
		}

		public static void Print_amout_cars()
		{
			Console.WriteLine("Ilość utworzonych samochodów: " + cars_amount);
		}
	}
}
