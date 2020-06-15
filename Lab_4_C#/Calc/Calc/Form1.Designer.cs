namespace Calc
{
    partial class Calculator
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
            this.textBoxResult = new System.Windows.Forms.TextBox();
            this.buttonOne = new System.Windows.Forms.Button();
            this.buttonTwo = new System.Windows.Forms.Button();
            this.buttonThree = new System.Windows.Forms.Button();
            this.buttonFour = new System.Windows.Forms.Button();
            this.buttonFive = new System.Windows.Forms.Button();
            this.buttonSix = new System.Windows.Forms.Button();
            this.buttonSeven = new System.Windows.Forms.Button();
            this.buttonEight = new System.Windows.Forms.Button();
            this.buttonNine = new System.Windows.Forms.Button();
            this.buttonClear = new System.Windows.Forms.Button();
            this.buttonTimes = new System.Windows.Forms.Button();
            this.buttonDivide = new System.Windows.Forms.Button();
            this.buttonDot = new System.Windows.Forms.Button();
            this.buttonZero = new System.Windows.Forms.Button();
            this.buttonPlusMinus = new System.Windows.Forms.Button();
            this.buttonEquals = new System.Windows.Forms.Button();
            this.button1 = new System.Windows.Forms.Button();
            this.SuspendLayout();
            // 
            // textBoxResult
            // 
            this.textBoxResult.Location = new System.Drawing.Point(20, 25);
            this.textBoxResult.Name = "textBoxResult";
            this.textBoxResult.Size = new System.Drawing.Size(318, 20);
            this.textBoxResult.TabIndex = 0;
            this.textBoxResult.Text = "0";
            this.textBoxResult.TextAlign = System.Windows.Forms.HorizontalAlignment.Right;
            // 
            // buttonOne
            // 
            this.buttonOne.Location = new System.Drawing.Point(20, 60);
            this.buttonOne.Name = "buttonOne";
            this.buttonOne.Size = new System.Drawing.Size(75, 69);
            this.buttonOne.TabIndex = 1;
            this.buttonOne.Text = "1";
            this.buttonOne.UseVisualStyleBackColor = true;
            this.buttonOne.Click += new System.EventHandler(this.Button_Click);
            // 
            // buttonTwo
            // 
            this.buttonTwo.Location = new System.Drawing.Point(101, 60);
            this.buttonTwo.Name = "buttonTwo";
            this.buttonTwo.Size = new System.Drawing.Size(75, 69);
            this.buttonTwo.TabIndex = 2;
            this.buttonTwo.Text = "2";
            this.buttonTwo.UseVisualStyleBackColor = true;
            this.buttonTwo.Click += new System.EventHandler(this.Button_Click);
            // 
            // buttonThree
            // 
            this.buttonThree.Location = new System.Drawing.Point(182, 60);
            this.buttonThree.Name = "buttonThree";
            this.buttonThree.Size = new System.Drawing.Size(75, 69);
            this.buttonThree.TabIndex = 3;
            this.buttonThree.Text = "3";
            this.buttonThree.UseVisualStyleBackColor = true;
            this.buttonThree.Click += new System.EventHandler(this.Button_Click);
            // 
            // buttonFour
            // 
            this.buttonFour.Location = new System.Drawing.Point(20, 135);
            this.buttonFour.Name = "buttonFour";
            this.buttonFour.Size = new System.Drawing.Size(75, 69);
            this.buttonFour.TabIndex = 4;
            this.buttonFour.Text = "4";
            this.buttonFour.UseVisualStyleBackColor = true;
            this.buttonFour.Click += new System.EventHandler(this.Button_Click);
            // 
            // buttonFive
            // 
            this.buttonFive.Location = new System.Drawing.Point(101, 135);
            this.buttonFive.Name = "buttonFive";
            this.buttonFive.Size = new System.Drawing.Size(75, 69);
            this.buttonFive.TabIndex = 5;
            this.buttonFive.Text = "5";
            this.buttonFive.UseVisualStyleBackColor = true;
            this.buttonFive.Click += new System.EventHandler(this.Button_Click);
            // 
            // buttonSix
            // 
            this.buttonSix.Location = new System.Drawing.Point(182, 135);
            this.buttonSix.Name = "buttonSix";
            this.buttonSix.Size = new System.Drawing.Size(75, 69);
            this.buttonSix.TabIndex = 6;
            this.buttonSix.Text = "6";
            this.buttonSix.UseVisualStyleBackColor = true;
            this.buttonSix.Click += new System.EventHandler(this.Button_Click);
            // 
            // buttonSeven
            // 
            this.buttonSeven.Location = new System.Drawing.Point(20, 210);
            this.buttonSeven.Name = "buttonSeven";
            this.buttonSeven.Size = new System.Drawing.Size(75, 69);
            this.buttonSeven.TabIndex = 7;
            this.buttonSeven.Text = "7";
            this.buttonSeven.UseVisualStyleBackColor = true;
            this.buttonSeven.Click += new System.EventHandler(this.Button_Click);
            // 
            // buttonEight
            // 
            this.buttonEight.Location = new System.Drawing.Point(101, 210);
            this.buttonEight.Name = "buttonEight";
            this.buttonEight.Size = new System.Drawing.Size(75, 69);
            this.buttonEight.TabIndex = 8;
            this.buttonEight.Text = "8";
            this.buttonEight.UseVisualStyleBackColor = true;
            this.buttonEight.Click += new System.EventHandler(this.Button_Click);
            // 
            // buttonNine
            // 
            this.buttonNine.Location = new System.Drawing.Point(182, 210);
            this.buttonNine.Name = "buttonNine";
            this.buttonNine.Size = new System.Drawing.Size(75, 69);
            this.buttonNine.TabIndex = 9;
            this.buttonNine.Text = "9";
            this.buttonNine.UseVisualStyleBackColor = true;
            this.buttonNine.Click += new System.EventHandler(this.Button_Click);
            // 
            // buttonClear
            // 
            this.buttonClear.Location = new System.Drawing.Point(263, 60);
            this.buttonClear.Name = "buttonClear";
            this.buttonClear.Size = new System.Drawing.Size(75, 69);
            this.buttonClear.TabIndex = 10;
            this.buttonClear.Text = "C";
            this.buttonClear.UseVisualStyleBackColor = true;
            this.buttonClear.Click += new System.EventHandler(this.ButtonClear_Click);
            // 
            // buttonTimes
            // 
            this.buttonTimes.Location = new System.Drawing.Point(263, 135);
            this.buttonTimes.Name = "buttonTimes";
            this.buttonTimes.Size = new System.Drawing.Size(75, 69);
            this.buttonTimes.TabIndex = 11;
            this.buttonTimes.Text = "*";
            this.buttonTimes.UseVisualStyleBackColor = true;
            this.buttonTimes.Click += new System.EventHandler(this.ButtonOperator_Click);
            // 
            // buttonDivide
            // 
            this.buttonDivide.Location = new System.Drawing.Point(263, 210);
            this.buttonDivide.Name = "buttonDivide";
            this.buttonDivide.Size = new System.Drawing.Size(75, 69);
            this.buttonDivide.TabIndex = 12;
            this.buttonDivide.Text = "/";
            this.buttonDivide.UseVisualStyleBackColor = true;
            this.buttonDivide.Click += new System.EventHandler(this.ButtonOperator_Click);
            // 
            // buttonDot
            // 
            this.buttonDot.Location = new System.Drawing.Point(263, 285);
            this.buttonDot.Name = "buttonDot";
            this.buttonDot.Size = new System.Drawing.Size(75, 69);
            this.buttonDot.TabIndex = 13;
            this.buttonDot.Text = ".";
            this.buttonDot.UseVisualStyleBackColor = true;
            this.buttonDot.Click += new System.EventHandler(this.Button_Click);
            // 
            // buttonZero
            // 
            this.buttonZero.Location = new System.Drawing.Point(101, 285);
            this.buttonZero.Name = "buttonZero";
            this.buttonZero.Size = new System.Drawing.Size(75, 69);
            this.buttonZero.TabIndex = 14;
            this.buttonZero.Text = "0";
            this.buttonZero.UseVisualStyleBackColor = true;
            this.buttonZero.Click += new System.EventHandler(this.Button_Click);
            // 
            // buttonPlusMinus
            // 
            this.buttonPlusMinus.Location = new System.Drawing.Point(20, 285);
            this.buttonPlusMinus.Name = "buttonPlusMinus";
            this.buttonPlusMinus.Size = new System.Drawing.Size(75, 69);
            this.buttonPlusMinus.TabIndex = 15;
            this.buttonPlusMinus.Text = "+";
            this.buttonPlusMinus.UseVisualStyleBackColor = true;
            this.buttonPlusMinus.Click += new System.EventHandler(this.ButtonOperator_Click);
            // 
            // buttonEquals
            // 
            this.buttonEquals.Location = new System.Drawing.Point(20, 360);
            this.buttonEquals.Name = "buttonEquals";
            this.buttonEquals.Size = new System.Drawing.Size(318, 69);
            this.buttonEquals.TabIndex = 16;
            this.buttonEquals.Text = "=";
            this.buttonEquals.UseVisualStyleBackColor = true;
            this.buttonEquals.Click += new System.EventHandler(this.ButtonEquals_Click);
            // 
            // button1
            // 
            this.button1.Location = new System.Drawing.Point(182, 285);
            this.button1.Name = "button1";
            this.button1.Size = new System.Drawing.Size(75, 69);
            this.button1.TabIndex = 17;
            this.button1.Text = "-";
            this.button1.UseVisualStyleBackColor = true;
            this.button1.Click += new System.EventHandler(this.ButtonOperator_Click);
            // 
            // Calculator
            // 
            this.AutoScaleDimensions = new System.Drawing.SizeF(6F, 13F);
            this.AutoScaleMode = System.Windows.Forms.AutoScaleMode.Font;
            this.ClientSize = new System.Drawing.Size(417, 456);
            this.Controls.Add(this.button1);
            this.Controls.Add(this.buttonEquals);
            this.Controls.Add(this.buttonPlusMinus);
            this.Controls.Add(this.buttonZero);
            this.Controls.Add(this.buttonDot);
            this.Controls.Add(this.buttonDivide);
            this.Controls.Add(this.buttonTimes);
            this.Controls.Add(this.buttonClear);
            this.Controls.Add(this.buttonNine);
            this.Controls.Add(this.buttonEight);
            this.Controls.Add(this.buttonSeven);
            this.Controls.Add(this.buttonSix);
            this.Controls.Add(this.buttonFive);
            this.Controls.Add(this.buttonFour);
            this.Controls.Add(this.buttonThree);
            this.Controls.Add(this.buttonTwo);
            this.Controls.Add(this.buttonOne);
            this.Controls.Add(this.textBoxResult);
            this.Name = "Calculator";
            this.Text = "Calculator";
            this.ResumeLayout(false);
            this.PerformLayout();

        }

        #endregion

        private System.Windows.Forms.TextBox textBoxResult;
        private System.Windows.Forms.Button buttonOne;
        private System.Windows.Forms.Button buttonTwo;
        private System.Windows.Forms.Button buttonThree;
        private System.Windows.Forms.Button buttonFour;
        private System.Windows.Forms.Button buttonFive;
        private System.Windows.Forms.Button buttonSix;
        private System.Windows.Forms.Button buttonSeven;
        private System.Windows.Forms.Button buttonEight;
        private System.Windows.Forms.Button buttonNine;
        private System.Windows.Forms.Button buttonClear;
        private System.Windows.Forms.Button buttonTimes;
        private System.Windows.Forms.Button buttonDivide;
        private System.Windows.Forms.Button buttonDot;
        private System.Windows.Forms.Button buttonZero;
        private System.Windows.Forms.Button buttonPlusMinus;
        private System.Windows.Forms.Button buttonEquals;
        private System.Windows.Forms.Button button1;
    }
}

