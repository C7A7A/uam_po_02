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
    public partial class ShowGrades : Form
    {
        Student student = null;
        public ShowGrades(Student s)
        {
            InitializeComponent();
            student = s;
        }

        private void label_student_info(object sender, EventArgs e)
        {
            student_info.Text = student.Name + " " + student.Surname + " " + student.Index_number + " " + student.Field_of_study;
            
            foreach (Grade grade in student.grades)
            {
                dataGridView_show_grades.Rows.Add(grade.Subject, grade.Date, grade.Val);
            }
        }
    }
}
