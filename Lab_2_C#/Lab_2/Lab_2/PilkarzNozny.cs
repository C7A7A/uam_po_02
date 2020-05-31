﻿using System;
using System.Collections.Generic;
using System.Text;

namespace Lab_2
{
    class PilkarzNozny : Pilkarz
    {
        public PilkarzNozny(string imie, string nazwisko, string data_urodzenia, string pozycja, string klub):
               base(imie, nazwisko, data_urodzenia, pozycja, klub)
        {

        }
        public override void strzel_gola()
        {
            base.strzel_gola();
            Console.WriteLine("Nożny strzelił!");
        }
    }
}
