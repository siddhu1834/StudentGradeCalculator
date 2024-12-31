package com.bvc.studentsgradecalculator;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    EditText grade1EditText, grade2EditText, grade3EditText, grade4EditText, grade5EditText, grade6EditText;
    Button okButton, clearButton;
    TextView resultTextView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        // Initialize views
        grade1EditText = findViewById(R.id.s1);
        grade2EditText = findViewById(R.id.s2);
        grade3EditText = findViewById(R.id.s3);
        grade4EditText = findViewById(R.id.s4);
        grade5EditText = findViewById(R.id.s5);
        grade6EditText = findViewById(R.id.s6);
        okButton = findViewById(R.id.button2);
        clearButton = findViewById(R.id.button);
        resultTextView = findViewById(R.id.textView);

        // Set click listener for OK button
        okButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                calculateGrade();
            }
        });

        // Set click listener for Clear button
        clearButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                clearGrades();
            }
        });
    }

    private void calculateGrade() {
        int grade1 = Double.parseDouble(grade1EditText.getText().toString());
        int grade2 = Double.parseDouble(grade2EditText.getText().toString());
        int grade3 = Double.parseDouble(grade3EditText.getText().toString());
        int grade4 = Double.parseDouble(grade4EditText.getText().toString());
        int grade5 = Double.parseDouble(grade5EditText.getText().toString());
        int grade6 = Double.parseDouble(grade6EditText.getText().toString());

        int total = grade1 + grade2 + grade3 + grade4 + grade5 + grade6;
        int average = total / 6;

        // Calculate grade based on average, you can customize this part as per your grading system
        String grade;
        if(sub1<35||sub2<35||sub3<35||sub4<35||sub5<35||sub6<35){
                grade="F";
        }
        else{
            if (average >= 90) {
            grade = "A";
        } else if (average >= 80) {
            grade = "B";
        } else if (average >= 70) {
            grade = "C";
        } else if (average >= 60) {
            grade = "D";
        } else {
            grade = "F";
        }
        }
        

        // Display result
        resultTextView.setText("Total:" + total + "\tAverage:" + average + "\tGrade:" + grade);
    }

    private void clearGrades() {
        // Clear all EditText fields and resultTextView
        grade1EditText.setText("");
        grade2EditText.setText("");
        grade3EditText.setText("");
        grade4EditText.setText("");
        grade5EditText.setText("");
        grade6EditText.setText("");
        resultTextView.setText("");
    }
}
