using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace Students
{
    public class Grade
    {
        private string subject;
        private string date;
        private double val;

        public Grade()
        {

        }

        public Grade(string subject, string date, double val)
        {
            this.subject = subject;
            this.date = date;
            this.val = val;
        }

        public string Subject
        {
            get { return subject; }
            set { subject = value; }
        }

        public string Date
        {
            get { return date; }
            set { date = value; }
        }

        public double Val
        {
            get { return val; }
            set { val = value; }
        }
    }
}
