using System;
using System.Collections.Generic;
using System.ComponentModel;
using System.Data;
using System.Drawing;
using System.Linq;
using System.Text;
using System.Threading.Tasks;
using System.Windows.Forms;
using System.Xml.Xsl;

namespace Calc
{
    public partial class Calculator : Form
    {
        private double result = 0;
        private string calc_operator = "";
        private bool is_operation_performed = false;

        public Calculator()
        {
            InitializeComponent();
        }

        private void Button_Click(object sender, EventArgs e)
        {
            if (textBoxResult.Text == "0" || is_operation_performed)
            {
                textBoxResult.Clear();
            }

            is_operation_performed = false;
            Button button = (Button)sender;

            if (button.Text == ".")
            {
                if (!textBoxResult.Text.Contains("."))
                {
                    textBoxResult.Text += button.Text;
                }
            }
            else
            {
                textBoxResult.Text += button.Text;
            }
        }

        private void ButtonClear_Click(object sender, EventArgs e)
        {
            textBoxResult.Clear();
            result = 0;
            calc_operator = "";

            textBoxResult.Text = "0";
        }

        private void ButtonOperator_Click(object sender, EventArgs e)
        {
            Button button = (Button)sender;
            if (result != 0)
            {
                buttonEquals.PerformClick();
                calc_operator = button.Text;
                is_operation_performed = true;
            }
            else
            {
                calc_operator = button.Text;
                result = Double.Parse(textBoxResult.Text);
                is_operation_performed = true;
            }
        }

        private void ButtonDot_Click(object sender, EventArgs e)
        {
            if (!textBoxResult.Text.Contains("."))
            {
                textBoxResult.Text += ".";
            }
        }

        private void ButtonEquals_Click(object sender, EventArgs e)
        {
            switch (calc_operator)
            {
                case "+":
                    textBoxResult.Text = (result + Double.Parse(textBoxResult.Text)).ToString();
                    break;
                case "-":
                    textBoxResult.Text = (result - Double.Parse(textBoxResult.Text)).ToString();
                    break;
                case "*":
                    textBoxResult.Text = (result * Double.Parse(textBoxResult.Text)).ToString();
                    break;
                case "/":
                    textBoxResult.Text = (result / Double.Parse(textBoxResult.Text)).ToString();
                    break;
                default:
                    break;
            }
            result = Double.Parse(textBoxResult.Text);
        }
    }
}
