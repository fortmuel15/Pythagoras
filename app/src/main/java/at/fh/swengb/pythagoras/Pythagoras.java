package at.fh.swengb.pythagoras;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class Pythagoras extends AppCompatActivity {

    public class MainActivity extends AppCompatActivity {

        private EditText variableA;
        private EditText variableB;
        private TextView variableC;

        @Override
        protected void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            setContentView(R.layout.activity_pythagoras);
            variableA = (EditText) findViewById(R.id.editVariableA);
            variableB = (EditText) findViewById(R.id.editVariableB);
            variableC = (TextView) findViewById(R.id.resultC);
        }


        public void calcMultiply(View view) {

            String num1String = variableA.getText().toString();
            String num2String = variableB.getText().toString();

            double num1 = 0;
            double num2 = 0;

            double result = 0;
            try {
                num1 = Double.parseDouble(num1String);
                num2 = Double.parseDouble(num2String);
                result = (num1*num1) + (num2*num2);
                variableC.setText((num1String+"*"+num1String) + " * " + (num2String+"*"+num2String) + " = " + result);
            } catch (NumberFormatException e) {
                variableC.setText("WRONG INPUT!!!!");

                e.printStackTrace();
            }
        }

        public void showAbout(View view) {

            Intent intent = new Intent(this, DisplayAboutActivity.class);
            String message = variableC.getText().toString();
            intent.putExtra("resultOfCalc",message);
            startActivity(intent);

        }
    }}