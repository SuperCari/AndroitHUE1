package at.fh.swengb.androithue1;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private EditText editText9;
    private TextView resultView;
    private Double finish;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        editText9 = (EditText) findViewById(R.id.editText9);
        resultView = (TextView) findViewById(R.id.textViewResult);
    }

    public void calcEUR(View view) {

        String num1String = editText9.getText().toString();

        double num1=0;

        try {
            num1=Double.parseDouble(num1String);


            double result = (num1/7.5);
            resultView.setText(num1String+"/ 7.5 = "+result);

            finish = result;
        } catch (NumberFormatException e) {
            resultView.setText("INVALID INPUT!");
            e.printStackTrace();
        }


    }

    public void calcHRK(View view) {

        String num1String = editText9.getText().toString();

        double num1=0;

        try {
            num1=Double.parseDouble(num1String);


            double result = (num1*7.5);
            finish = result;
            resultView.setText(num1String+"* 7.5 = "+result);
        } catch (NumberFormatException e) {
            resultView.setText("INVALID INPUT!");
            e.printStackTrace();
        }

    }


    public void buttonAbout (View view) {

        Intent intent = new Intent(this,AboutView.class);
        intent.putExtra("data",finish.toString());
        startActivity(intent);
    }


}



