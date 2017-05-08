package com.codekul.app;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.LinearLayout;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        LinearLayout layoutRoot = new LinearLayout(this);
        layoutRoot.setOrientation(LinearLayout.VERTICAL);
        LinearLayout.LayoutParams paramsRoot = new LinearLayout.LayoutParams(500,500);
        layoutRoot.setLayoutParams(paramsRoot);

        EditText edtName = new EditText(this);
        edtName.setHint("Any Name");
        LinearLayout.LayoutParams paramsName = new LinearLayout.LayoutParams(500, 150);
        edtName.setLayoutParams(paramsName);
        layoutRoot.addView(edtName);

        Button btnOkay = new Button(this);
        btnOkay.setText("Okay");
        LinearLayout.LayoutParams paramsBtn = new LinearLayout.LayoutParams(500, 100);
        btnOkay.setLayoutParams(paramsBtn);
        layoutRoot.addView(btnOkay);

        setContentView(layoutRoot);
    }
}
