package com.codekul.uixml;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_main);

        final EditText edtName = (EditText) findViewById(R.id.edtName);
        final Button btnOkay = (Button) findViewById(R.id.btnOkay);
        btnOkay.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String name = edtName.getText().toString();
                edtName.setText(name.toUpperCase());
            }
        });

         /*Car car = new Car();
         Car car1 = new Bmw();
         Bmw bmw = new Bmw();
         Bmw bmw1 = (Bmw) new Car();*/
    }
}

class Car {

}

class Bmw extends  Car {


}
