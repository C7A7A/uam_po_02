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
    public partial class Main : Form
    {
        private List<Student> students = new List<Student>();
        public Main()
        {
            InitializeComponent();
        }

        private void button_add_student_Click(object sender, EventArgs e)
        {
            AddStudent add_student_form = new AddStudent(this);
            DialogResult dr = add_student_form.ShowDialog();
            if (dr == DialogResult.OK)
            {
                MessageBox.Show("Dodano studenta");
            }
        }

        public void Add_student(Student s)
        {
            students.Add(s);
        }

        public void Add_student_to_data_grid_view(Student s)
        {
            dataGridView_students_list.Rows.Add(s.Name, s.Surname, s.Index_number, s.Field_of_study, s.Grades_amount);
        }

        public void Update_student_amount_grades(Student s)
        {
            foreach (DataGridViewRow row in dataGridView_students_list.Rows)
            {
                if (row.Cells["index_number"].Value != null)
                {
                    if (row.Cells["index_number"].Value.ToString().Equals(s.Index_number))
                    {
                        row.Cells["amount_of_grades"].Value = s.Grades_amount;
                        break;
                    }
                }
            }
        }

        private void button_add_grade_Click(object sender, EventArgs e)
        {
            if (dataGridView_students_list.SelectedRows[0].Cells["index_number"].Value != null)
            {
                string index_number = dataGridView_students_list.SelectedRows[0].Cells["index_number"].Value.ToString();
                Student s = students.Find(n => n.Index_number == index_number);
            
                AddGrade add_grade_form = new AddGrade(s, this);
                DialogResult dr = add_grade_form.ShowDialog();
        
                if (dr == DialogResult.OK)
                {
                    MessageBox.Show("Dodano ocenę");
                }
            }
        }

        private void button_show_student_grades(object sender, EventArgs e)
        {
            if (dataGridView_students_list.SelectedRows[0].Cells["index_number"].Value != null)
            {
                string index_number = dataGridView_students_list.SelectedRows[0].Cells["index_number"].Value.ToString();
                Student s = students.Find(n => n.Index_number == index_number);

                ShowGrades show_grades = new ShowGrades(s);
                DialogResult dr = show_grades.ShowDialog();
            }
        }
    }
}
