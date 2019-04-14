package com.onder.onderworks2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    EditText editText,editText2,editText3;
    Button button,button2,button3,button4;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Implement edip OnClickListener kullandık.

        init();

        button.setOnClickListener(this);    // Buradaki yapıya dikkat!
        button2.setOnClickListener(this);
        button3.setOnClickListener(this);
        button4.setOnClickListener(this);

        editText = findViewById(R.id.editText);
        editText2 = findViewById(R.id.editText2);
        editText3 = findViewById(R.id.editText3);

    }

    public void init(){     // oncreate i kod kalabalığından kurtarmak için bir fonksiyon içinde yazdık.

        button = findViewById(R.id.sum);
        button2 = findViewById(R.id.deduct);
        button3 = findViewById(R.id.multiply);
        button4 = findViewById(R.id.divide);


    }


    @Override
    public void onClick(View v) {
        switch (v.getId()){

            case R.id.sum:

                if (editText.getText().toString().matches("") || editText2.getText().toString().matches("")){
                    Toast.makeText(MainActivity.this, "alani bos birakmayiniz", Toast.LENGTH_SHORT).show();

                }else {

                    int a = Integer.parseInt(editText.getText().toString());
                    int b = Integer.parseInt(editText2.getText().toString());
                    int c = a + b;

                    editText3.setText("Result: "+c);

                }
                break;

            case  R.id.deduct:

                if (editText.getText().toString().matches("") || editText2.getText().toString().matches("")){
                    Toast.makeText(MainActivity.this, "alani bos birakmayiniz", Toast.LENGTH_SHORT).show();

                }else {

                    int a = Integer.parseInt(editText.getText().toString());
                    int b = Integer.parseInt(editText2.getText().toString());
                    int c = a - b;

                    editText3.setText("Result: " + c);
                }
                break;

            case R.id.divide:

                if (editText.getText().toString().matches("") || editText2.getText().toString().matches("")){
                    Toast.makeText(MainActivity.this, "alani bos birakmayiniz", Toast.LENGTH_SHORT).show();

                }else {

                    int a = Integer.parseInt(editText.getText().toString());
                    int b = Integer.parseInt(editText2.getText().toString());
                    int c = a / b;

                    editText3.setText("Result: " + c);
                }
                break;

            case R.id.multiply:

                if (editText.getText().toString().matches("") || editText2.getText().toString().matches("")){
                    Toast.makeText(MainActivity.this, "alani bos birakmayiniz", Toast.LENGTH_SHORT).show();

                }else {

                    int a = Integer.parseInt(editText.getText().toString());
                    int b = Integer.parseInt(editText2.getText().toString());
                    int c = a * b;

                    editText3.setText("Result: " + c);
                }
                break;


        }
    }
}
