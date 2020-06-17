namespace Students
{
    partial class ShowGrades
    {
        /// <summary>
        /// Required designer variable.
        /// </summary>
        private System.ComponentModel.IContainer components = null;

        /// <summary>
        /// Clean up any resources being used.
        /// </summary>
        /// <param name="disposing">true if managed resources should be disposed; otherwise, false.</param>
        protected override void Dispose(bool disposing)
        {
            if (disposing && (components != null))
            {
                components.Dispose();
            }
            base.Dispose(disposing);
        }

        #region Windows Form Designer generated code

        /// <summary>
        /// Required method for Designer support - do not modify
        /// the contents of this method with the code editor.
        /// </summary>
        private void InitializeComponent()
        {
            this.dataGridView_show_grades = new System.Windows.Forms.DataGridView();
            this.subject = new System.Windows.Forms.DataGridViewTextBoxColumn();
            this.date = new System.Windows.Forms.DataGridViewTextBoxColumn();
            this.value = new System.Windows.Forms.DataGridViewTextBoxColumn();
            this.student_info = new System.Windows.Forms.Label();
            ((System.ComponentModel.ISupportInitialize)(this.dataGridView_show_grades)).BeginInit();
            this.SuspendLayout();
            // 
            // dataGridView_show_grades
            // 
            this.dataGridView_show_grades.ColumnHeadersHeightSizeMode = System.Windows.Forms.DataGridViewColumnHeadersHeightSizeMode.AutoSize;
            this.dataGridView_show_grades.Columns.AddRange(new System.Windows.Forms.DataGridViewColumn[] {
            this.subject,
            this.date,
            this.value});
            this.dataGridView_show_grades.Location = new System.Drawing.Point(12, 36);
            this.dataGridView_show_grades.Name = "dataGridView_show_grades";
            this.dataGridView_show_grades.Size = new System.Drawing.Size(346, 185);
            this.dataGridView_show_grades.TabIndex = 0;
            this.dataGridView_show_grades.Click += new System.EventHandler(this.label_student_info);
            // 
            // subject
            // 
            this.subject.HeaderText = "Przedmiot";
            this.subject.Name = "subject";
            // 
            // date
            // 
            this.date.HeaderText = "Data";
            this.date.Name = "date";
            // 
            // value
            // 
            this.value.HeaderText = "Ocena";
            this.value.Name = "value";
            // 
            // student_info
            // 
            this.student_info.AutoSize = true;
            this.student_info.Location = new System.Drawing.Point(12, 9);
            this.student_info.Name = "student_info";
            this.student_info.Size = new System.Drawing.Size(0, 13);
            this.student_info.TabIndex = 1;
            // 
            // ShowGrades
            // 
            this.AutoScaleDimensions = new System.Drawing.SizeF(6F, 13F);
            this.AutoScaleMode = System.Windows.Forms.AutoScaleMode.Font;
            this.ClientSize = new System.Drawing.Size(368, 231);
            this.Controls.Add(this.student_info);
            this.Controls.Add(this.dataGridView_show_grades);
            this.Name = "ShowGrades";
            this.Text = "Wyświetl Oceny";
            this.Load += new System.EventHandler(this.label_student_info);
            ((System.ComponentModel.ISupportInitialize)(this.dataGridView_show_grades)).EndInit();
            this.ResumeLayout(false);
            this.PerformLayout();

        }

        #endregion

        private System.Windows.Forms.DataGridView dataGridView_show_grades;
        private System.Windows.Forms.DataGridViewTextBoxColumn subject;
        private System.Windows.Forms.DataGridViewTextBoxColumn date;
        private System.Windows.Forms.DataGridViewTextBoxColumn value;
        private System.Windows.Forms.Label student_info;
    }
}