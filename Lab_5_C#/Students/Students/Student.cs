using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace Students
{
    public class Student
    {
        private string name;
        private string surname;
        private string index_number;
        private string field_of_study;
        public List<Grade> grades = new List<Grade>();
        private int grades_amount = 0;

        public Student()
        {

        }

        public Student(string name, string surname, string index_number, string field_of_study)
        {
            this.name = name;
            this.surname = surname;
            this.index_number = index_number;
            this.field_of_study = field_of_study;
        }

        public string Name
        {
            get { return name; }
            set { name = value; }
        }

        public string Surname
        {
            get { return surname; }
            set { name = value; }
        }

        public string Index_number
        {
            get { return index_number; }
            set { index_number = value; }
        }

        public string Field_of_study
        {
            get { return field_of_study; }
            set { field_of_study = value; }
        }

        public int Grades_amount
        {
            get { return grades_amount; }
        }

        public void Add_grade(Grade g)
        {
            grades.Add(g);
            grades_amount++;
        }
    }
}
