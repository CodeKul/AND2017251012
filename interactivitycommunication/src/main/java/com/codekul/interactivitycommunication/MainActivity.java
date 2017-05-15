package com.codekul.interactivitycommunication;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import java.text.SimpleDateFormat;
import java.util.Date;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ((TextView)findViewById(R.id.textDate)).setText(new SimpleDateFormat("dd MMM yyyy").format(new Date()));
    }

    public void goNext(View view) {

        Class cls = NextActivity.class;

        Bundle bundle = new Bundle();
        bundle.putString("keyDate", ((TextView)findViewById(R.id.textDate)).getText().toString());

        Intent intent = new Intent(this, cls);
        intent.putExtras(bundle);

        //startActivity(intent);

        startActivityForResult(intent, 1233);
    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        super.onActivityResult(requestCode, resultCode, data);

        if(requestCode == 1233) {
            if(resultCode == RESULT_OK) {

                if(data != null) {

                    Bundle bundle = data.getExtras();
                    int img = bundle.getInt("keyImg");
                    ((ImageView)findViewById(R.id.imageHero)).setImageResource(img);
                }
            }
        }
    }
}
