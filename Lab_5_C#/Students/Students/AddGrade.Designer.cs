namespace Students
{
    partial class AddGrade
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
            this.textBox_subject = new System.Windows.Forms.TextBox();
            this.textBox_date = new System.Windows.Forms.TextBox();
            this.textBox_value = new System.Windows.Forms.TextBox();
            this.button_add_grade = new System.Windows.Forms.Button();
            this.label1 = new System.Windows.Forms.Label();
            this.label2 = new System.Windows.Forms.Label();
            this.label3 = new System.Windows.Forms.Label();
            this.SuspendLayout();
            // 
            // textBox_subject
            // 
            this.textBox_subject.Location = new System.Drawing.Point(74, 15);
            this.textBox_subject.Name = "textBox_subject";
            this.textBox_subject.Size = new System.Drawing.Size(216, 20);
            this.textBox_subject.TabIndex = 0;
            // 
            // textBox_date
            // 
            this.textBox_date.Location = new System.Drawing.Point(74, 41);
            this.textBox_date.Name = "textBox_date";
            this.textBox_date.Size = new System.Drawing.Size(216, 20);
            this.textBox_date.TabIndex = 1;
            // 
            // textBox_value
            // 
            this.textBox_value.Location = new System.Drawing.Point(74, 67);
            this.textBox_value.Name = "textBox_value";
            this.textBox_value.Size = new System.Drawing.Size(216, 20);
            this.textBox_value.TabIndex = 2;
            // 
            // button_add_grade
            // 
            this.button_add_grade.Location = new System.Drawing.Point(212, 91);
            this.button_add_grade.Name = "button_add_grade";
            this.button_add_grade.Size = new System.Drawing.Size(78, 25);
            this.button_add_grade.TabIndex = 3;
            this.button_add_grade.Text = "Dodaj";
            this.button_add_grade.UseVisualStyleBackColor = true;
            this.button_add_grade.Click += new System.EventHandler(this.button_add_grade_Click);
            // 
            // label1
            // 
            this.label1.AutoSize = true;
            this.label1.Location = new System.Drawing.Point(12, 18);
            this.label1.Name = "label1";
            this.label1.Size = new System.Drawing.Size(56, 13);
            this.label1.TabIndex = 4;
            this.label1.Text = "Przedmiot:";
            // 
            // label2
            // 
            this.label2.AutoSize = true;
            this.label2.Location = new System.Drawing.Point(35, 44);
            this.label2.Name = "label2";
            this.label2.Size = new System.Drawing.Size(33, 13);
            this.label2.TabIndex = 5;
            this.label2.Text = "Data:";
            // 
            // label3
            // 
            this.label3.AutoSize = true;
            this.label3.Location = new System.Drawing.Point(18, 70);
            this.label3.Name = "label3";
            this.label3.Size = new System.Drawing.Size(50, 13);
            this.label3.TabIndex = 6;
            this.label3.Text = "Wartość:";
            // 
            // AddGrade
            // 
            this.AutoScaleDimensions = new System.Drawing.SizeF(6F, 13F);
            this.AutoScaleMode = System.Windows.Forms.AutoScaleMode.Font;
            this.ClientSize = new System.Drawing.Size(304, 128);
            this.Controls.Add(this.label3);
            this.Controls.Add(this.label2);
            this.Controls.Add(this.label1);
            this.Controls.Add(this.button_add_grade);
            this.Controls.Add(this.textBox_value);
            this.Controls.Add(this.textBox_date);
            this.Controls.Add(this.textBox_subject);
            this.Name = "AddGrade";
            this.Text = "Dodaj Ocenę";
            this.ResumeLayout(false);
            this.PerformLayout();

        }

        #endregion

        private System.Windows.Forms.TextBox textBox_subject;
        private System.Windows.Forms.TextBox textBox_date;
        private System.Windows.Forms.TextBox textBox_value;
        private System.Windows.Forms.Button button_add_grade;
        private System.Windows.Forms.Label label1;
        private System.Windows.Forms.Label label2;
        private System.Windows.Forms.Label label3;
    }
}