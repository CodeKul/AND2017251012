package com.codekul.nestedlayouts;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.Switch;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        findViewById(R.id.btnOkay).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if (((Switch) findViewById(R.id.switchData)).isChecked())
                    ((ImageView) findViewById(R.id.imageData))
                            .setImageResource(R.drawable.and_mob);
                else ((ImageView) findViewById(R.id.imageData))
                        .setImageResource(R.drawable.and_os);
            }
        });
    }
}
