package com.codekul.app;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.LinearLayout;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        LinearLayout layoutRoot = new LinearLayout(this);
        layoutRoot.setOrientation(LinearLayout.VERTICAL);
        LinearLayout.LayoutParams paramsRoot = new LinearLayout.LayoutParams(LinearLayout.LayoutParams.MATCH_PARENT,LinearLayout.LayoutParams.MATCH_PARENT);
        layoutRoot.setLayoutParams(paramsRoot);

        final EditText edtName = new EditText(this);
        edtName.setHint("Any Name");
        LinearLayout.LayoutParams paramsName = new LinearLayout.LayoutParams(LinearLayout.LayoutParams.MATCH_PARENT, LinearLayout.LayoutParams.WRAP_CONTENT);
        edtName.setLayoutParams(paramsName);
        layoutRoot.addView(edtName);

        Button btnOkay = new Button(this);
        btnOkay.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String name = edtName.getText().toString();
                edtName.setText(name.toUpperCase());
            }
        });
        btnOkay.setText("Okay");
        LinearLayout.LayoutParams paramsBtn = new LinearLayout.LayoutParams(LinearLayout.LayoutParams.MATCH_PARENT, LinearLayout.LayoutParams.WRAP_CONTENT);
        btnOkay.setLayoutParams(paramsBtn);
        layoutRoot.addView(btnOkay);

        setContentView(layoutRoot);
    }
}
