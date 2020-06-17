using System;
using System.Collections.Generic;
using System.ComponentModel;
using System.Data;
using System.Drawing;
using System.Linq;
using System.Text;
using System.Threading.Tasks;
using System.Windows.Forms;

namespace Students
{
    public partial class AddStudent : Form
    {
        private Main main_form = null;
        public AddStudent(Main m)
        {
            InitializeComponent();
            main_form = m;
        }

        private void button_add_student_Click(object sender, EventArgs e)
        {
            if (textBox_name.Text == "" || textBox_surname.Text == "" || textBox_index_number.Text == "" || textBox_field_of_study.Text == "")
            {
                MessageBox.Show("Uzupełnij wszystkie pola!");
            }
            else
            {
                try
                {
                    Student s = new Student(textBox_name.Text, textBox_surname.Text, textBox_index_number.Text, textBox_field_of_study.Text);
                    main_form.Add_student(s);
                    main_form.Add_student_to_data_grid_view(s);
                    this.DialogResult = DialogResult.OK;
                }
                catch (Exception ex)
                {
                    MessageBox.Show("Błąd: " + ex.Message);
                }
            }
        }
    }
}
