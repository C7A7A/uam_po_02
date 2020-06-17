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
    public partial class AddGrade : Form
    {
        private Student student = null;
        private Main main_form = null;
        public AddGrade(Student s, Main m)
        {
            InitializeComponent();
            student = s;
            main_form = m;
        }

        private void button_add_grade_Click(object sender, EventArgs e)
        {
            if (textBox_subject.Text == "" || textBox_value.Text == "" || textBox_date.Text == "")
            {
                MessageBox.Show("Uzupełnij wszystkie pola!");
            }
            else
            {
                try
                {
                    Grade g = new Grade(textBox_subject.Text, textBox_date.Text, Convert.ToDouble(textBox_value.Text));
                    student.Add_grade(g);
                    main_form.Update_student_amount_grades(student);
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
