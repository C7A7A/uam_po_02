using System;
using System.Collections.Generic;
using System.Text;

namespace Lab1
{
	public class Dom
	{
		const int windows = 10;
		private double yardage = 200;
		private string adres;

		public Dom()
		{
			adres = "nieznany";
		}

		public Dom(string adres)
		{
			this.adres = adres;
		}

		public string Adres
		{
			get { return adres; }
			set { adres = value; }
		}

		public double calculateTax(double taxForMeter)
		{
			return taxForMeter * yardage;
		}
	}
}
