namespace Students
{
    partial class Main
    {
        /// <summary>
        /// Wymagana zmienna projektanta.
        /// </summary>
        private System.ComponentModel.IContainer components = null;

        /// <summary>
        /// Wyczyść wszystkie używane zasoby.
        /// </summary>
        /// <param name="disposing">prawda, jeżeli zarządzane zasoby powinny zostać zlikwidowane; Fałsz w przeciwnym wypadku.</param>
        protected override void Dispose(bool disposing)
        {
            if (disposing && (components != null))
            {
                components.Dispose();
            }
            base.Dispose(disposing);
        }

        #region Kod generowany przez Projektanta formularzy systemu Windows

        /// <summary>
        /// Metoda wymagana do obsługi projektanta — nie należy modyfikować
        /// jej zawartości w edytorze kodu.
        /// </summary>
        private void InitializeComponent()
        {
            this.dataGridView_students_list = new System.Windows.Forms.DataGridView();
            this.button_add_student = new System.Windows.Forms.Button();
            this.button_add_grade = new System.Windows.Forms.Button();
            this.button_show_grades = new System.Windows.Forms.Button();
            this.name = new System.Windows.Forms.DataGridViewTextBoxColumn();
            this.surname = new System.Windows.Forms.DataGridViewTextBoxColumn();
            this.index_number = new System.Windows.Forms.DataGridViewTextBoxColumn();
            this.field_of_study = new System.Windows.Forms.DataGridViewTextBoxColumn();
            this.amount_of_grades = new System.Windows.Forms.DataGridViewTextBoxColumn();
            ((System.ComponentModel.ISupportInitialize)(this.dataGridView_students_list)).BeginInit();
            this.SuspendLayout();
            // 
            // dataGridView_students_list
            // 
            this.dataGridView_students_list.BackgroundColor = System.Drawing.SystemColors.Info;
            this.dataGridView_students_list.ColumnHeadersHeightSizeMode = System.Windows.Forms.DataGridViewColumnHeadersHeightSizeMode.AutoSize;
            this.dataGridView_students_list.Columns.AddRange(new System.Windows.Forms.DataGridViewColumn[] {
            this.name,
            this.surname,
            this.index_number,
            this.field_of_study,
            this.amount_of_grades});
            this.dataGridView_students_list.Location = new System.Drawing.Point(12, 49);
            this.dataGridView_students_list.Name = "dataGridView_students_list";
            this.dataGridView_students_list.SelectionMode = System.Windows.Forms.DataGridViewSelectionMode.FullRowSelect;
            this.dataGridView_students_list.Size = new System.Drawing.Size(544, 389);
            this.dataGridView_students_list.TabIndex = 0;
            // 
            // button_add_student
            // 
            this.button_add_student.Location = new System.Drawing.Point(12, 12);
            this.button_add_student.Name = "button_add_student";
            this.button_add_student.Size = new System.Drawing.Size(120, 31);
            this.button_add_student.TabIndex = 1;
            this.button_add_student.Text = "Dodaj studenta";
            this.button_add_student.UseVisualStyleBackColor = true;
            this.button_add_student.Click += new System.EventHandler(this.button_add_student_Click);
            // 
            // button_add_grade
            // 
            this.button_add_grade.Location = new System.Drawing.Point(138, 12);
            this.button_add_grade.Name = "button_add_grade";
            this.button_add_grade.Size = new System.Drawing.Size(120, 31);
            this.button_add_grade.TabIndex = 2;
            this.button_add_grade.Text = "Dodaj ocenę";
            this.button_add_grade.UseVisualStyleBackColor = true;
            this.button_add_grade.Click += new System.EventHandler(this.button_add_grade_Click);
            // 
            // button_show_grades
            // 
            this.button_show_grades.Location = new System.Drawing.Point(264, 12);
            this.button_show_grades.Name = "button_show_grades";
            this.button_show_grades.Size = new System.Drawing.Size(120, 31);
            this.button_show_grades.TabIndex = 3;
            this.button_show_grades.Text = "Wyświetl oceny";
            this.button_show_grades.UseVisualStyleBackColor = true;
            this.button_show_grades.Click += new System.EventHandler(this.button_show_student_grades);
            // 
            // name
            // 
            this.name.HeaderText = "Imię";
            this.name.Name = "name";
            this.name.SortMode = System.Windows.Forms.DataGridViewColumnSortMode.NotSortable;
            // 
            // surname
            // 
            this.surname.HeaderText = "Nazwisko";
            this.surname.Name = "surname";
            this.surname.SortMode = System.Windows.Forms.DataGridViewColumnSortMode.NotSortable;
            // 
            // index_number
            // 
            this.index_number.HeaderText = "Nr indeksu";
            this.index_number.Name = "index_number";
            this.index_number.SortMode = System.Windows.Forms.DataGridViewColumnSortMode.NotSortable;
            // 
            // field_of_study
            // 
            this.field_of_study.HeaderText = "Kierunek";
            this.field_of_study.Name = "field_of_study";
            this.field_of_study.SortMode = System.Windows.Forms.DataGridViewColumnSortMode.NotSortable;
            // 
            // amount_of_grades
            // 
            this.amount_of_grades.HeaderText = "Liczba ocen";
            this.amount_of_grades.Name = "amount_of_grades";
            this.amount_of_grades.SortMode = System.Windows.Forms.DataGridViewColumnSortMode.NotSortable;
            // 
            // Main
            // 
            this.AutoScaleDimensions = new System.Drawing.SizeF(6F, 13F);
            this.AutoScaleMode = System.Windows.Forms.AutoScaleMode.Font;
            this.ClientSize = new System.Drawing.Size(570, 450);
            this.Controls.Add(this.button_show_grades);
            this.Controls.Add(this.button_add_grade);
            this.Controls.Add(this.button_add_student);
            this.Controls.Add(this.dataGridView_students_list);
            this.Name = "Main";
            this.Text = "Main";
            ((System.ComponentModel.ISupportInitialize)(this.dataGridView_students_list)).EndInit();
            this.ResumeLayout(false);

        }

        #endregion

        private System.Windows.Forms.DataGridView dataGridView_students_list;
        private System.Windows.Forms.Button button_add_student;
        private System.Windows.Forms.Button button_add_grade;
        private System.Windows.Forms.Button button_show_grades;
        private System.Windows.Forms.DataGridViewTextBoxColumn name;
        private System.Windows.Forms.DataGridViewTextBoxColumn surname;
        private System.Windows.Forms.DataGridViewTextBoxColumn index_number;
        private System.Windows.Forms.DataGridViewTextBoxColumn field_of_study;
        private System.Windows.Forms.DataGridViewTextBoxColumn amount_of_grades;
    }
}

