namespace Students
{
    partial class AddStudent
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
            this.textBox_name = new System.Windows.Forms.TextBox();
            this.textBox_surname = new System.Windows.Forms.TextBox();
            this.textBox_index_number = new System.Windows.Forms.TextBox();
            this.textBox_field_of_study = new System.Windows.Forms.TextBox();
            this.label1 = new System.Windows.Forms.Label();
            this.label2 = new System.Windows.Forms.Label();
            this.label3 = new System.Windows.Forms.Label();
            this.label4 = new System.Windows.Forms.Label();
            this.button_add_student = new System.Windows.Forms.Button();
            this.SuspendLayout();
            // 
            // textBox_name
            // 
            this.textBox_name.Location = new System.Drawing.Point(79, 20);
            this.textBox_name.Name = "textBox_name";
            this.textBox_name.Size = new System.Drawing.Size(188, 20);
            this.textBox_name.TabIndex = 0;
            // 
            // textBox_surname
            // 
            this.textBox_surname.Location = new System.Drawing.Point(79, 46);
            this.textBox_surname.Name = "textBox_surname";
            this.textBox_surname.Size = new System.Drawing.Size(188, 20);
            this.textBox_surname.TabIndex = 1;
            // 
            // textBox_index_number
            // 
            this.textBox_index_number.Location = new System.Drawing.Point(79, 72);
            this.textBox_index_number.Name = "textBox_index_number";
            this.textBox_index_number.Size = new System.Drawing.Size(188, 20);
            this.textBox_index_number.TabIndex = 2;
            // 
            // textBox_field_of_study
            // 
            this.textBox_field_of_study.Location = new System.Drawing.Point(79, 98);
            this.textBox_field_of_study.Name = "textBox_field_of_study";
            this.textBox_field_of_study.Size = new System.Drawing.Size(188, 20);
            this.textBox_field_of_study.TabIndex = 3;
            // 
            // label1
            // 
            this.label1.AutoSize = true;
            this.label1.Location = new System.Drawing.Point(44, 23);
            this.label1.Name = "label1";
            this.label1.Size = new System.Drawing.Size(29, 13);
            this.label1.TabIndex = 4;
            this.label1.Text = "Imie:";
            // 
            // label2
            // 
            this.label2.AutoSize = true;
            this.label2.Location = new System.Drawing.Point(17, 49);
            this.label2.Name = "label2";
            this.label2.Size = new System.Drawing.Size(56, 13);
            this.label2.TabIndex = 5;
            this.label2.Text = "Nazwisko:";
            // 
            // label3
            // 
            this.label3.AutoSize = true;
            this.label3.Location = new System.Drawing.Point(12, 75);
            this.label3.Name = "label3";
            this.label3.Size = new System.Drawing.Size(61, 13);
            this.label3.TabIndex = 6;
            this.label3.Text = "Nr indeksu:";
            // 
            // label4
            // 
            this.label4.AutoSize = true;
            this.label4.Location = new System.Drawing.Point(21, 101);
            this.label4.Name = "label4";
            this.label4.Size = new System.Drawing.Size(52, 13);
            this.label4.TabIndex = 7;
            this.label4.Text = "Kierunek:";
            // 
            // button_add_student
            // 
            this.button_add_student.Location = new System.Drawing.Point(173, 124);
            this.button_add_student.Name = "button_add_student";
            this.button_add_student.Size = new System.Drawing.Size(94, 28);
            this.button_add_student.TabIndex = 8;
            this.button_add_student.Text = "Dodaj";
            this.button_add_student.UseVisualStyleBackColor = true;
            this.button_add_student.Click += new System.EventHandler(this.button_add_student_Click);
            // 
            // DodajStudenta
            // 
            this.AutoScaleDimensions = new System.Drawing.SizeF(6F, 13F);
            this.AutoScaleMode = System.Windows.Forms.AutoScaleMode.Font;
            this.ClientSize = new System.Drawing.Size(285, 164);
            this.Controls.Add(this.button_add_student);
            this.Controls.Add(this.label4);
            this.Controls.Add(this.label3);
            this.Controls.Add(this.label2);
            this.Controls.Add(this.label1);
            this.Controls.Add(this.textBox_field_of_study);
            this.Controls.Add(this.textBox_index_number);
            this.Controls.Add(this.textBox_surname);
            this.Controls.Add(this.textBox_name);
            this.Name = "DodajStudenta";
            this.Text = "DodajStudenta";
            this.ResumeLayout(false);
            this.PerformLayout();

        }

        #endregion

        private System.Windows.Forms.TextBox textBox_name;
        private System.Windows.Forms.TextBox textBox_surname;
        private System.Windows.Forms.TextBox textBox_index_number;
        private System.Windows.Forms.TextBox textBox_field_of_study;
        private System.Windows.Forms.Label label1;
        private System.Windows.Forms.Label label2;
        private System.Windows.Forms.Label label3;
        private System.Windows.Forms.Label label4;
        private System.Windows.Forms.Button button_add_student;
    }
}